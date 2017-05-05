
#include <unistd.h>
#include <iostream>

using namespace std;

enum Bottle { BeerBottle };


class Shelf {
private:    
    unsigned BottlesLeft;
public:
    Shelf( unsigned bottlesbought ) : BottlesLeft( bottlesbought )
    {}
    void TakeOneDown()
    {
        if (!BottlesLeft)
            throw BeerBottle;
        BottlesLeft--;
    }
    operator int () {
        return BottlesLeft;
    }
};


int main( int, char ** )
{
    Shelf Beer(99);
    try {
        for (;;) {
            char const* plural = (int)Beer !=1 ? "s" : "";
            cout << (int)Beer << " bottle" << plural << " of beer on the wall. Take one down." << endl;
            Beer.TakeOneDown();
            cout << (int)Beer << " bottle" << plural << " of beer on the wall." << endl;
        }

    } catch ( Bottle ) {
        cout << "No more bottles" << endl;
    }

    sleep(20);
    return 0;
}

