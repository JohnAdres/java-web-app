<%-- 
    Document   : index
    Created on : Sep 25, 2016, 8:03:52 AM
    Author     : Hasan
--%>
<!--please add jstl-1.2_2.jar in the tomcat/lib folder or if using glassfish,
just add the library to the project property-->

<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="exception.jsp"%>
<%@taglib prefix = "pjbank" tagdir="/WEB-INF/tags" %>
<pjbank:header title = "Welcome to PJ Bank"/>
<!DOCTYPE html>
<table width = "100%">
    <tr>
        <td valign="top" width="25%"><jsp:include page="left-banner.jsp"/></td>
        <td valign="top">Welcome to PJ, No:1 Java Bank</td>
        <td valign="top" width="25%"><jsp:include page="right-banner.jsp"/></td>
        
            
        
        
        
    </tr>
</table>

<pjbank:footer>&copy; PJBANK, 2016</pjbank:footer>

