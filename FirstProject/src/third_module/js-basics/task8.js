let quantity = parseInt(prompt("How many do you buy?"))
const price = quantity * 120
if (price > 4000) {
    alert(`${price * 0.9} KZT`)
} else {
    alert(`${price} KZT`)
}