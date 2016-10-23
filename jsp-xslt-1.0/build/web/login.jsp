<%-- 
    Document   : index
    Created on : Sep 22, 2016, 8:50:06 AM
    Author     : Hasan
--%>
<%@ page contentType="text/html" errorPage="exception.jsp"%>
<jsp:useBean id="login" class="com.pjbank.LoginBean" scope="session"/>
<jsp:setProperty name="login" property="*"/>


<%
     String uname = "";
     String pword = "";
     if (login.getUsername() != null) { // Processing the Form data
          uname = login.getUsername();
          pword = login.getPassword();
     }
%>
<form action="index.jsp" method='post' name='loginForm'>
    <fieldset>
        <legend>Login Information</legend>
        <table>
            <tr>
                <td><label for="username">User Name:</label></td>
                <td><input type="text" name ="username" id="username">
                    <%= uname%></td>
            </tr>
            <tr>
                <td><label for="password">Password:</label></td>
                <td><input type="password" name ="password" id="password">
                    <%= pword%></td>
            </tr>
        </table>
        <p/><input type="submit" value="Login">
        <input type="reset">
    </fieldset>
</form>
</body>
</html>