<%-- 
    Document   : cookie-3-remove
    Created on : Sep 21, 2016, 9:44:54 AM
    Author     : Hasan
--%>
<!DOCTYPE html>
<html>
    <head>
        <title>Delete Cookie Example</title>
    </head>
    <body>
        <h1>JSP deleting all cookies </h2>
            <%
                 Cookie[] cookies = request.getCookies();
                 //check null because there are chances that there are no cookies
                 if (cookies != null) {
                      for (int i = 0; i < cookies.length; i++) {
                           Cookie cookie = cookies[i];
                           if (cookie.getName().equals(cookies[i].getName())) {
                                cookie.setMaxAge(0);
                                response.addCookie(cookie);
                           }
                      }
                 }
            %>
    </body>
</html>