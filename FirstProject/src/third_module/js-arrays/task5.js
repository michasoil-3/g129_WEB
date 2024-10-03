let input = 0
let cars = [
    {"name":"Toyota", "price": 12000000, "year": 2015, "volume": 2.2},
    {"name":"Mercedes", "price": 70000000, "year": 2018, "volume": 3.8},
    {"name":"Toyota", "price": 7000000, "year": 2013, "volume": 2.0},
    {"name":"BMW", "price": 11000000, "year": 2011, "volume": 3.0},
    {"name":"Lexus", "price": 60000000, "year": 2017 ,"volume": 5.7}
];
let results = []
while (input !== 5) {
    input = Number.parseInt(prompt(`INSERT [1] TO SEARCH BY NAME
INSERT [2] TO SEARCH BY YEAR
INSERT [3] TO SEARCH BY ENGINE VOLUME
INSERT [4] TO SEARCH BY PRICE
INSERT [5] TO EXIT`))
    results = []
    switch (input) {
        case 1:
            let name = prompt("Enter name:")
            for (let obj of cars) {
                if (obj.name === name)
                    results.push(obj)
            }
            break
        case 2:
            let year = Number.parseInt(prompt("Enter year:"))
            for (let obj of cars) {
                if (obj.year === year)
                    results.push(obj)
            }
            break
        case 3:
            let volume = Number.parseInt(prompt("Enter engine volume:"))
            for (let obj of cars) {
                if (obj.volume === volume)
                    results.push(obj)
            }
            break
        case 4:
            let price = Number.parseInt(prompt("Enter price:"))
            for (let obj of cars) {
                if (obj.price === price)
                    results.push(obj)
            }
            break
        default:
            break
    }
    if (input > 0 && input < 5 && results.length === 0) {
        alert("None found.")
    } else if (results.length !== 0) {
        for (let obj of results)
            console.log(obj)
    }
}