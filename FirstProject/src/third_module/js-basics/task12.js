let grade = parseFloat(prompt("Enter grade:"))
let letter = null;
if (grade >= 90) {
    letter = "A"
} else if (grade >= 75) {
    letter = "B"
} else if (grade >= 60) {
    letter = "C"
} else if (grade >= 50) {
    letter = "D"
} else {
    letter = "F"
}
alert(letter)
