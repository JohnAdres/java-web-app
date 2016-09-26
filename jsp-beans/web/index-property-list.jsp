<%-- 
    Document   : index-property-list
    Created on : Sep 26, 2016, 11:20:56 AM
    Author     : Hasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="stat2" class = "com.beans.StatBeanList">

    <jsp:setProperty name="stat2" property="numberList" value="10, 20,30,40,50"/>
</jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
       
        <title>JSP Page</title>
    </head>
    <body>

        <jsp:getProperty name="stat2" property="numberList"/>
        average :
        <jsp:getProperty name="stat2" property="average"/>
    </body>
</html>
