const output = document.getElementById('output');
const enter = document.getElementById('btn');
const input = document.getElementById('input');
let age;
let message;

enter.onclick = function() {
   age = input.value;
   age = Number(age);
   
   if(age >= 18){
      message = "You can enter this site.";
      output.textContent = message;
   }else if(age <= 0){
      message = "Enter a valid age."
      output.textContent = message;
   }else{
      message = "You can't enter this site.";
      output.textContent = message;
   }
}