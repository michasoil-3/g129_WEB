let year = parseInt(prompt("Enter year:"))
if ((year % 4 === 0 && year % 10 !== 0) || year % 400 === 0) {
    alert("YES")
} else {
    alert("NO")
}
