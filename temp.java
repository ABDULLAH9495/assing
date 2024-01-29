
var temperatureCelsius = prompt("Enter the current temperature in Celsius:");

var temperatureNumeric = parseFloat(temperatureCelsius);

if (temperatureNumeric > 30) {
   
    alert("It's a hot day!");
} else {
   
    alert("The weather is moderate.");
}

var subject1 = parseFloat(prompt("Enter marks for Subject 1:"));
var subject2 = parseFloat(prompt("Enter marks for Subject 2:"));
var subject3 = parseFloat(prompt("Enter marks for Subject 3:"));
var totalMarks = subject1 + subject2 + subject3;
var percentage = (totalMarks / 300) * 100;

console.log("------ Marksheet ------");
console.log("Subject 1: " + subject1);
console.log("Subject 2: " + subject2);
console.log("Subject 3: " + subject3);
console.log("-----------------------");
console.log("Total Marks: " + totalMarks);
console.log("Percentage: " + percentage.toFixed(2) + "%");


var grade;

if (percentage >= 80) {
    grade = "A+";
} else if (percentage >= 70) {
    grade = "A";
} else if (percentage >= 60) {
    grade = "B";
} else if (percentage >= 50) {
    grade = "C";
} else if (percentage >= 40) {
    grade = "D";
} else {
    grade = "Fail";
}

console.log("Grade: " + grade);
