/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//<script language="javascript">	
function validate()
{
        var username = document.LoginForm.txt_username;
        var password = document.LoginForm.txt_password;
        if (username.value == null || username.value == "")
{
window.alert("please enter username ?");
        username.style.background = '#f08080';
        username.focus();
        return false;
    }
    if (password.value == null || password.value == "") 
    {
        window.alert("please enter password ?");
        password.style.background = '#f08080';
        password.focus();
        return false;
    }
}		

