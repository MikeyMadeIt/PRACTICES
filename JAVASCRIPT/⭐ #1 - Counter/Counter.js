const increaseBtn = document.getElementById('increase');
const decreaseBtn = document.getElementById('decrease');
const countLabel = document.getElementById('counter');
const resetBtn = document.getElementById('reset');
let count = 0;

increaseBtn.onclick = function(){
   count++;
   countLabel.textContent = count;
};
decreaseBtn.onclick = function(){
   count--;
   countLabel.textContent = count;
};
resetBtn.onclick = function(){
   count = 0;
   countLabel.textContent = count;
};