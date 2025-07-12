const label1 = document.getElementById('label1');
const label2 = document.getElementById('label2');
const label3 = document.getElementById('label3');
const totalLabel = document.getElementById('total');
const roll = document.getElementById('btn');
let max = 10;
let min = 1;
let rolled1 = 0;
let rolled2 = 0;
let rolled3 = 0;
let total = 0;

roll.onclick = function(){
   rolled1 = Math.floor(Math.random() * (max - min) + min);
   rolled2 = Math.floor(Math.random() * (max - min) + min);
   rolled3 = Math.floor(Math.random() * (max - min) + min);
   label1.textContent = rolled1;
   label2.textContent = rolled2;
   label3.textContent = rolled3;
   
   total = rolled1 + rolled2 + rolled3;
   totalLabel.textContent = total;
}