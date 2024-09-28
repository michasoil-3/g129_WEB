let amount = parseFloat(prompt("How much KZT do you wish to convert?"))
let option = parseInt(prompt(`
1- CONVERT TO USD

2- CONVERT TO EUR

3- CONVERT TO GBP`))
let converted = amount
let currency = "KZT"
switch (option) {
    case 1:
        converted = amount / 380
        currency = "USD"
        break
    case 2:
        converted = amount / 430
        currency = "EUR"
        break
    case 3:
        converted = amount / 480
        currency = "GBP"
        break
    default:
        alert("Error in the conversion process!")
        break
}
converted = converted.toFixed(2)
alert(`${amount} KZT = ${converted} ${currency}`)
