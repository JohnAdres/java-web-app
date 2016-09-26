<%-- 
    Document   : index-property
    Created on : Sep 26, 2016, 10:55:56 AM
    Author     : Hasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="stat" class = "com.beans.StatBean">
    <%
         double mynums []= {100,250,150, 50, 450};
         stat.setNumbers(mynums);
    %>
    
</jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        The Average of 
        <%
             double numbers [] = stat.getNumbers();
             for (int i = 0; i < numbers.length; i++) {
                if (i != numbers.length-1){
                     out.println(numbers[i] + ",");
                }else {
                     out.println(" " + numbers[i]);
                }
               
          }
        %>
        is equal to
        <jsp:getProperty name="stat" property="average"/>
    </body>
</html>
