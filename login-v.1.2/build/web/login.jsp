<%-- 
    Document   : index
    Created on : Sep 22, 2016, 8:50:06 AM
    Author     : Hasan
--%>

<%@page errorPage  = "exception.jsp" %>
<%@taglib prefix = "pjbank" uri = "http://www.pjbank.com/tags" %>
<jsp:useBean id="login" class="com.pjbank.LoginBean" scope="session"/>
<jsp:setProperty name="login" property="*"/>
<html>
    <title> Please Login </title>
    
    <body>
        <h2> ${pjbank:validate(login)} </h2>
        <form>
            <fieldset>
                <legend>Login Information</legend>
                <table>
                    <tr>
                        <td><label for="username">User Name:</label></td>
                        <td><input type="text" name ="username" id="username"></td>
                        <td>${login.username}</td>
                    </tr>
                    <tr>
                        <td><label for="password">Password:</label></td>
                        <td><input type="password" name ="password" id="password"></td>
                        <td>${login.password}</td>
                    </tr>
                </table>
                <p/><input type="submit" value="Login">
                <input type="reset">
            </fieldset>
        </form>
    </body>
</html>