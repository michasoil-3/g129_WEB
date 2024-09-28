const username = "user"
const password = "qwerty"
let enteredUsername = prompt("Enter username:")
let enteredPassword = prompt("Enter password:")
if ((enteredPassword == password) && (enteredUsername == username)) {
    alert("Authentication completed")
} else {
    alert("Invalid login or password")
}
