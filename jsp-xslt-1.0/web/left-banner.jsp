<%-- 
    Document   : left-banner
    Created on : Sep 25, 2016, 9:08:17 AM
    Author     : Hasan
--%>
<%@taglib prefix  = "pjbank" tagdir = "/WEB-INF/tags" %>
<jsp:useBean id="login" class="com.pjbank.LoginBean" scope="session" />
<jsp:setProperty name="login" property="*" />
<table>
    <pjbank:valid>
        <jsp:attribute name="good">
            <tr><td>
                    <ul>
                        <li>Access</li>
                        <li>Account info</li>
                        <li>Personal info</li>
                        <li>logout</li>
                    </ul>                   
                </td></tr>
            </jsp:attribute>
        <jsp:attribute name="bad">
            <tr><td>
                    <a href="login.jsp">
                        <font class="start">L</font>
                        <font class="rest">ogin</font>
                    </a>
                </td>
            </tr>
        </jsp:attribute>
    </pjbank:valid>
</table>