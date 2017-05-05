
public class Bottle {
    public static void main(String[] args)
    {
        int numBeer = 99;
        String world = "bottles";
        while (numBeer > 0) {
            if (1 == numBeer) {
                world = "bottle";
            }
            System.out.println(numBeer + " " + world + " beer on the wall. Take one down.");
            numBeer -= 1;
            if (numBeer > 0) {
                System.out.println(numBeer + " " + world + " on the wall");
            } else {
                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println("No more bottles");
            }
        }
    }
}
