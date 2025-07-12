 const visa = document.getElementById('visa');
 const paypal = document.getElementById('paypal');
 const gcash = document.getElementById('gcash');
 const submit = document.getElementById('submit');
 const output = document.getElementById('output');
 let message;
 
 submit.onclick = function() {
    if(visa.checked){
       message = "You select Visa as your payment";
       output.textContent = message;
    }else if(paypal.checked){
       message = "You select Paypal as your payment";
       output.textContent = message;
    }else if(gcash.checked){
       message = "You select Gcash as your payment";
       output.textContent = message;
    }else{
       message = "Please select a payment";
       output.textContent = message;
    }
 }