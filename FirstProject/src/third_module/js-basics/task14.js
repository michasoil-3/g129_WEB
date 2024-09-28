let sideA = parseFloat(prompt("Enter first side:"))
let sideB = parseFloat(prompt("Enter second side:"))
let sideC = parseFloat(prompt("Enter third side:"))
let isTriangle = true
if (sideA + sideB < sideC) {
    isTriangle = false
}
if (sideA + sideC < sideB) {
    isTriangle = false
}
if (sideB + sideC < sideA) {
    isTriangle = false
}

alert(isTriangle ? "YES" : "NO")
