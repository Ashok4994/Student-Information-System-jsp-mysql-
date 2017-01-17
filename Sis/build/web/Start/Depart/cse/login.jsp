<%-- 
    Document   : login
    Created on : Jun 11, 2015, 11:08:40 PM
    Author     : PEDDI'S
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<% String contextPath = request.getContextPath();%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="<%=contextPath%>/Start/Css/style.css" type="text/css" media="screen" />
        <link rel="stylesheet" href="<%=contextPath%>/Start/Css/prettyPhoto.css" type="text/css" media="screen" />
        <title>JSP Page</title>
        <script type="text/javascript">
            function onBlur(el) {
                if (el.value == '') {
                    el.value = el.defaultValue;
                }
            }
            function onFocus(el) {

                el.value = '';

            }
            function validate(key)
            {
                //getting key code of pressed key
                var keycode = (key.which) ? key.which : key.keyCode;
                //comparing pressed keycodes
                if (!(keycode == 9 || keycode == 46) && (keycode < 48 || keycode > 57))
                {
                    return false;
                }
                return true;
            }
            //Created / Generates the captcha function    
            function DrawCaptcha()
            {
                var a = Math.ceil(Math.random() * 10) + '';
                var b = Math.ceil(Math.random() * 10) + '';
                var c = Math.ceil(Math.random() * 10) + '';
                var d = Math.ceil(Math.random() * 10) + '';
                var e = Math.ceil(Math.random() * 10) + '';
                var f = Math.ceil(Math.random() * 10) + '';
                var g = Math.ceil(Math.random() * 10) + '';
                var code = a + ' ' + b + ' ' + ' ' + c + ' ' + d + ' ' + e + ' ' + f + ' ' + g;
                document.getElementById("txtCaptcha").value = code
            }
            // Remove the spaces from the entered and generated code
            function removeSpaces(string)
            {
                return string.split(' ').join('');
            }
            window.onload = function () {
                DrawCaptcha();
                var myInput1 = document.getElementById('f1');
                var myInput2 = document.getElementById('f2');
                var myInput3 = document.getElementById('txtInput');
                myInput1.onpaste = function (e1) {
                    e1.preventDefault();
                }
                myInput2.onpaste = function (e2) {
                    e2.preventDefault();
                }
                myInput3.onpaste = function (e3) {
                    e3.preventDefault();
                }
            }
            function ValidateContactForm()
            {
                var uname = document.LoginForm.fname;
                var pname = document.LoginForm.fpwd;
                var cname = document.LoginForm.txtInput;
                var str1 = removeSpaces(document.getElementById('txtCaptcha').value);
                var str2 = removeSpaces(document.getElementById('txtInput').value);
                if (uname.value == "Enter username here" || uname.value == "")
                {
                    window.alert('Please enter Username');
                    fname.focus();
                    return false;
                } else if (pname.value == "Enter password here" || pname == "")
                {
                    window.alert("Please enter Password");
                    fpwd.focus();
                    return false;
                } else if (cname.value == "Enter captcha here" || cname == "")
                {
                    window.alert("Please enter Captcha");
                    txtInput.focus();
                    return false;
                } else
                {
                    if (str1 == str2)
                    {
                        document.LoginForm.submit();
                    } else {
                        window.alert('Please enter correct Captcha code');
                        txtInput.focus();
                        return false;
                    }

                }

            }
        </script>

    </head>
    <body>
        <div id="content">
            <div id="scrollContent">
                <center><img SRC="<%=contextPath%>/Start/Depart/cse/headlogo.jpg" alt="login logo" height="80" width="500" /><br> <br> 
                    <form action="login.pvk" method="post" name="LoginForm" onsubmit="return ValidateContactForm()"  >
                        <table width="50%" align="center" >
                            <tr>
                            <font color="red" size="4"><%
                                Object errd = request.getAttribute("errd");
                                if (errd == null) {
                                } else {
                                    out.print(request.getAttribute("errd"));
                                }
                            %></font>
                        </tr><tr></tr><tr></tr>
                    <tr >
                        <td align="center"><label > Username/email</label></td>
                        <td><input type="text" name="uname" autoComplete="off"
                                   onblur="onBlur(this)" onfocus="onFocus(this)"
                                   value="Enter username here" id="fname" required/></td>
                    </tr>
                    <tr><td></td><td></td></tr> <tr><td></td><td></td></tr>
                    <tr><td></td><td></td></tr> <tr><td></td><td></td></tr>
                    <tr><td></td><td></td></tr> <tr><td></td><td></td></tr>
                    <tr><td></td><td></td></tr> <tr><td></td><td></td></tr>
                    <tr >
                        <td align="center"> <label >Password</label></td>
                        <td align="right">
                            <input type="password" name="pwd" autoComplete="off" 
                                   onblur="onBlur(this)" onfocus="onFocus(this)"
                                   value="Enter password here" id="fpwd" required/> 
                        </td>
                    </tr>
                    </tr>
                    <tr><td></td><td><h6 align="right"><a  href="forgotfaculty.pvk" target="_blank">Forgot/Change Password</a></h6></td></tr> <tr><td></td><td></td></tr>
                    <tr><td></td><td></td></tr> <tr><td></td><td></td></tr>
                    <tr><td></td><td></td></tr> <tr><td></td><td></td></tr>
                    <tr><td></td><td></td></tr> <tr><td></td><td></td></tr>
                    <tr >
                        <td  align="center">
                            <input  type="text" id="txtCaptcha" 
                                    style="width:60%; 
                                    background-image:url(<%=contextPath%>/Start/Depart/cse/captcha.JPG); 
                                    text-align:center; border:none;
                                    font-weight:bold; font-size: 500; font-family:Modern"
                                    readonly />
                        </td>
                        <td align="center"> 
                            <input type="text" value="Enter captcha here" autoComplete="off"
                                   onblur="onBlur(this)" onfocus="onFocus(this)"
                                   onkeypress="return validate(event)" required 
                                   id="txtInput"/>    </td>
                    </tr>
                    <tr><td></td><td></td></tr> <tr><td></td><td></td></tr>
                    <tr><td></td><td></td></tr> <tr><td></td><td></td></tr>
                    <tr><td></td><td></td></tr> <tr><td></td><td></td></tr>
                    <tr><td></td><td></td></tr> <tr><td></td><td></td></tr>
                    <tr><td></td><td></td></tr> <tr><td></td><td></td></tr>
                    <tr><td></td><td></td></tr> <tr><td></td><td></td></tr>
                    <tr>
                        <td></td>
                        <td> 
                            <input type="submit" value="Log in" id="sub" 
                                   style="width:100%;" onclick="ValidCaptcha()" />
                        </td>
                    </tr>
                </table>
            </form>
        </center>         
        <br> <br> <br> <br> 
    </div><!--end entry-->
</div><!--end scrollContent-->
</body>
</html>
