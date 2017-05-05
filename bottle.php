<?php

function main() {
    $numBeer = 99;
    $world = "bottles";
    while ($numBeer > 0) {
        if ($numBeer == 1) {
           $world = "bottle";
        }
        echo $numBeer . " " . $world . "of beer on the wall. Take one down.\n";
        $numBeer -= 1;
        if ($numBeer > 0) {
            echo $numBeer . " " . $world . " of beer on the wall\n";
        } else {
           sleep(20);
           echo "No more bottles of beer on the wall\n";
        }
    }
}

main();
