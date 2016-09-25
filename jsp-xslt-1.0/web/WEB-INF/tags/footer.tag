<%-- 
    Document   : footer
    Created on : Sep 25, 2016, 8:42:43 AM
    Author     : Hasan
--%>
<!--please add jstl-1.2_2.jar in the tomcat/lib folder or if using glassfish,
just add the library to the project property-->
<%@taglib prefix ="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<jsp:useBean id="today" class ="java.util.Date"/>

<hr/>
</body>
<address>
    
    <fmt:formatDate value="${today}" type ="both" dateStyle="full" timeStyle="full"/>
    <br/>
    <jsp:doBody/>
    
</address>
</tml>