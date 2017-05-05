package main

import (
    "fmt"
    "time"
)

func main() {
    nbeer := 99
    world := "bottles"
    for nbeer > 0 {
        if (nbeer == 1) {
            world = "bottle"
        }
        fmt.Println(nbeer, " ", world, " of beer on the wall. Take one down")
        nbeer -= 1
        if (nbeer > 0) {
            fmt.Println(nbeer, " ", world, " of beer on the wall")
        } else {
            time.Sleep(time.Second * 20)
            fmt.Println("No more beer on the wall")
        }
    }
}
