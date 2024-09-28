let minutes = parseInt(prompt("Enter minutes:"))
let hours = Math.floor(minutes / 60)
let minutesLeft = minutes - (60 * hours)
if (minutesLeft === 0) {
    alert(`ONLY ${hours} HOURS`)
} else {
    alert(`${hours} HOURS and ${minutesLeft} MINUTES`)
}
