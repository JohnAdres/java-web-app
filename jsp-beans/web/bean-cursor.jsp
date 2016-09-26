<%-- 
    Document   : bean-cursor
    Created on : Sep 26, 2016, 1:49:17 PM
    Author     : Hasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <body bgcolor="white">
        <jsp:useBean id="planets" class="com.beans.BeanCursor"/>
        <table border="1">
            <tr>
                <th>Planet</th> <th>Number of Moons</th>
            </tr>
            <% while (planets.next()) { %>
            <tr>
                <td><jsp:getProperty name="planets" property="planet"/></td>
                <td align="center"><jsp:getProperty name="planets" property="moon"/></td>
            </tr>
            <% }%>
        </table>
    </body>
</html>