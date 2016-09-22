<%-- 
    Document   : session-1
    Created on : Sep 21, 2016, 12:19:28 PM
    Author     : Hasan
--%>
<!DOCTYPE html>
<%@ page import =  "java.util.*"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% Properties cookies = (Properties) session.getAttribute("cookies");
             String names[] = {"Cookie_1", "Cookie_2", "Cookie_3"};
             String values[] = {"Chocolate", "Biscuit", "Candy"};

             if (cookies != null) {
        %>          
        <table>
            <tr>
                <%
                     for (int i = 0; i < cookies.size(); i++) {
                %>

                <td> <%= names[i]%></td>
                <td> <%=  cookies.getProperty(names[i])%></td>
            </tr>
            <%}%>
        </table>
        <%
             } else {
                  cookies = new Properties();
                  for (int i = 0; i < names.length; i++) {
                       cookies.setProperty(names[i], values[i]);
                       session.setAttribute("cookies", cookies);
                  }

             }

        %>
    </body>
</html>
