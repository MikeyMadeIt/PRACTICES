// THE EASY WAY
let username;
username = window.prompt("What is your name?")
console.log(`Your name is: ${username}`);

// THE PROFESSIONAL WAY
let username;
document.getElementById('btn').onclick = function(){
   username = document.getElementById('text').value;
   document.getElementById('greet').textContent = `Hello, ${username}`;
};