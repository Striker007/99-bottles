"use strict";


function sleep(time) {
	return new Promise((resolve) => setTimeout(resolve, time));
}


{
	let numBottles = 99;
	let word = "bottles";

	while (numBottles > 0) {
		if (numBottles == 1) {
			word = "bottle";
		}
		console.log(`${numBottles} ${word} of beer on the wall. Take one down.`);
		numBottles -= 1;
		if (numBottles > 0) {
			console.log(`${numBottles} ${word} of beer on the wall.`);

		} else {
			sleep(20000);
			console.log("No more bottles of beer on the wall"); 
		}
	}
}
