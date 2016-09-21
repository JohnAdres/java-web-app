<%-- 
    Document   : expression-scriplet.jsp
    Created on : Sep 20, 2016, 10:55:59 PM
    Author     : Hasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!
     int global = 0; //global variable.it's a statement (;) needed
%> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>       
        <p>Today is <%= new java.util.Date()%></p> //expression no ; needed
        <p>This Page has been accessed <%= ++global%> times </p>
        <hr/>

        <%
             int local = 0; // local variable
             String[] names = {"Cookie 1", "Cookie 2", "Cookie 3"};
             String[] values = {"Chocolate", "Butter", "sugar"};
        %>
        <p>This Page has been accessed <%= global%></p>
        <p>local variable = <%= local%></p>

        <table> 
            <tr>
                <%
                     for (int i = 0; i < names.length; i++) {
                %>
                <td>
                    <%= names[i]%>
                </td>
                <td>
                    <%= values[i]%>
                </td>
            </tr>
            <%
                 }
            %>


        </tr>
    </table>
    </hr>
    <p> This page has been accessed local <%=++local%>Times</p>
</body>
</html>
