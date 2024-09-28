let number = parseFloat(prompt("Enter money in KZT:"))
let converted = number / 380
let dollars = Math.floor(converted)
let cents = Math.round((converted - dollars) * 100)
if (cents === 0) {
    alert(`ONLY ${dollars} USD`)
} else {
    alert(`${dollars} USD and ${cents} cents`)
}
