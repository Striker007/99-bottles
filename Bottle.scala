
object Bottle {
    def main(args: Array[String]): Unit = {

        (99 to 1 by -1).par foreach { n =>
            println(
                f"$n%d bottles of beer on the wall. Take one down.\n" +
                f"${n - 1}%d bottles of beer on the wall\n")
        }

        Thread sleep 20000
    }
}
