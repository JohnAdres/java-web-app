<%-- 
    Document   : valid
    Created on : Sep 25, 2016, 9:10:38 AM
    Author     : Hasan
--%>


<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ attribute name="good" fragment="true" %>
<%@ attribute name="bad" fragment="true" %>
<c:choose>
    <c:when test="${login.valid == true}" >
        <jsp:invoke fragment="good" />
    </c:when>
    <c:otherwise>
        <jsp:invoke fragment="bad" />
    </c:otherwise>
</c:choose>