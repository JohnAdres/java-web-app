<%-- 
    Document   : convert
    Created on : Sep 19, 2016, 6:25:39 AM
    Author     : Hasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            
             #main{
                margin: 0 auto;
                width:400px;
                height: 250px;
                background: lightblue;
                border: 2px solid #99ccff;               
            }
        </style>
    </head>
    <body>
        <div id= "main">
        <% 
            float f;
            float c;       
            String in = request.getParameter("temp").trim();
            f = Float.valueOf(in);
            c = f - 32.0f * 5.0f / 9.0f;
            String celcius = String.format("%.02f", c);
        %>
        <h2>
            <%=
                 f + "in Fahrenhet = " + celcius + " c"
            %>
        </h2>
        <p><a href = "index.html">Convert another</a></p>
        </div>
    </body>
</html>
