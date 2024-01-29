
var number = parseInt(prompt("Enter a number:"));

console.log("Multiplication Table for " + number + ":");
for (var i = 1; i <= 10; i++) {
    var result = number * i;
    console.log(number + " x " + i + " = " + result);
}
var number = 5;
var factorial = 1;
var i = 1; 


while (i <= number) {
    factorial *= i;
    i++;
}
console.log("The factorial of " + number + " is: " + factorial);



// factorial of 5

var number = 5; 
var factorial = 1;
var i = 1; 


while (i <= number) {
    factorial *= i;
    i++;
}


console.log("The factorial of " + number + " is: " + factorial);
