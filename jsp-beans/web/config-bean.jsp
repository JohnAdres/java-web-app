<%-- 
    Document   : config-bean
    Created on : Sep 26, 2016, 6:23:48 PM
    Author     : Hasan
--%>

<%@page import="com.beans.Thermostat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%Thermostat t1 = new Thermostat();%>
        Thermostat set : <%= t1.getTemp()%>degrees <%=t1.init()%>
        <br/>
        <%Thermostat t2 = new Thermostat(185);%>
        Thermostat set : <%= t2.getTemp()%>degrees <%=t2.init()%>
    </body>
</html>
