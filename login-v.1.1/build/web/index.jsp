<%-- 
    Document   : index
    Created on : Sep 22, 2016, 8:50:06 AM
    Author     : Hasan
--%>

<%@ page errorPage="exception.jsp" %>
<jsp:useBean id="login" class="com.pjbank.LoginBean" scope="session"/>
<jsp:setProperty name="login" property="*"/>
<html>
    <body>
        <%
             if (login.getUsername() != null) { // Processing the Form data

        %>
        
        
        <h2> Login Information </h2>
        <hr/>
        <h4> User Name: <jsp:getProperty name="login" property="username"/> </h4>
        <h4> Password : <jsp:getProperty name="login" property="password"/> </h4>
        <hr/>
        <jsp:setProperty name="login" property="username" value="" />
        <%             login.setPassword("");
        } else { // Display the Form
        %>
        <form>
            <fieldset>
                <legend>Login Information</legend>
                <table>
                    <tr>
                        <td><label for="username">User Name:</label></td>
                        <td><input type="text" name ="username" id="username"></td>
                    </tr>
                    <tr>
                        <td><label for="password">Password:</label></td>
                        <td><input type="password" name ="password" id="password"></td>
                    </tr>
                </table>
                <p/><input type="submit" value="Login">
                <input type="reset">
            </fieldset>
        </form>
        <% }%>
    </body>
</html>