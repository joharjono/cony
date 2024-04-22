/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

	function validate()
	{

            var user_name= /^[a-z A-Z]+$/; 
            var password_valid=/^[A-Z a-z 0-9]{6,12}$/; 
            var i_email= /^[a-z A-Z 0-9 @ ]+$/; 
            

            var username = document.getElementById("username"); 
            var password = document.getElementById("password"); 
//            var email = document.getElementById("email"); 
				
            if(!user_name.test(username.value) || username.value=='') 
            {
		alert("Enter Username Alphabet Only....!");
                username.focus();
                password.style.background = '#f08080'; 
                return false;                    
            }
            if(!password_valid.test(password.value) || password.value=='')
            {
		alert("Password Must Be 6 to 12 character"); //alert message
                password.focus();
                password.style.background = '#f08080'; //set textbox color
                return false;                    
            }
//            if(!i_email.test(email.value) || email.value=='') 
//            {
//		alert("Enter Email Alphabet Only....!"); 
//                email.focus();
//                email.style.background = '#f08080'; 
//                return false;                    
//            }
	}
