
from time import sleep


def main():
    numBeer = 99
    world = "bottles"
    while numBeer > 0:
        if numBeer == 1:
            world = "bottle"
        print(str(numBeer) + " " + world + "of beer on the wall. Take one down.")
        numBeer = numBeer - 1
        if numBeer > 0:
            print(str(numBeer) + " " + world + " of beer on the wall")
        else:
           sleep(20)
           print("No more bottles of beer on the wall")

main()
