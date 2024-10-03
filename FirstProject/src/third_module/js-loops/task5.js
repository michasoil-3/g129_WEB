let users = [
    {"login":"ilyas", "password": "qwerty"},
    {"login":"eldar", "password": "qqqqq"},
    {"login":"assylkhan", "password": "qweqwe"},
    {"login":"anel", "password": "asdasd"},
    {"login":"alibek", "password": "aaaaaa"}

]

let username = prompt("Enter username:")
let password = prompt("Enter password:")
let foundUser = false

for (let obj of users) {
    if (obj.login === username && obj.password === password) {
        foundUser = true
        break
    }
}

if (foundUser) {
    console.log("Authorisation completed.")
} else {
    console.log("Invalid username or password")
}
