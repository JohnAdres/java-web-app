<%-- 
    Document   : cookes2
    Created on : Sep 21, 2016, 9:05:37 AM
    Author     : Hasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
             Cookie[] cookies = request.getCookies();
            if(cookies != null){
        %>
        
        <table>
            <tr>
                <%
                     for (int i = 0; i < cookies.length; i++) {

                %>
                <td> <%= cookies[i].getName()%> </td>
                <td> <%= cookies[i].getValue()%> </td>
            </tr>
            <% }} else { %>
        </table>
        <%
       
             Cookie Cookie_1 = new Cookie("Cookie_1", "Chocolate Chip");
             Cookie_1.setMaxAge(24 * 60 * 60);

             Cookie Cookie_2 = new Cookie("Cookie_2", "Sugar");
             Cookie_2.setMaxAge(24 * 60 * 60);
             response.addCookie(Cookie_1);
             response.addCookie(Cookie_2);

        %>
        <h2> Cookies Initialized, Reload Page to see them </h2>
        <%}%>
    </body>
</html>
