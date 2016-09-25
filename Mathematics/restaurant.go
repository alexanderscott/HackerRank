// https://www.hackerrank.com/challenges/restaurant

package main

import (
	"fmt"
)

func gcd(x, y int) int {
	for y != 0 {
		x, y = y, x%y
	}
	return x
}

func main() {
	var n int

	fmt.Scan(&n)

	for n > 0 {
		var x, y int

		fmt.Scan(&x)
		fmt.Scan(&y)

		fmt.Printf("%d\n", (x / gcd(x, y) * y / gcd(x, y)))

		n--
	}

}
