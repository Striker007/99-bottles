def bottlesOfBeer(n) {
    return "" + (n==0 ? "no more" : n) + (n==1  ? " bottle" : " bottles") + " of beer";
}

99.downto(1) {
    println bottlesOfBeer(it)+" on the wall, " + bottlesOfBeer(it) + "!"
    println "Take one down, pass it around,"
    println bottlesOfBeer(it-1)+" on the wall!"
    println ""
    sleep(20000)
}
