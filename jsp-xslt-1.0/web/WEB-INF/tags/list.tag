<%-- 
    Document   : list
    Created on : Sep 25, 2016, 9:30:33 AM
    Author     : Hasan
--%>
<%@tagliburi  = "http://java.sun.com/jstl/core_rt" prefix = "c"%>
    <%@ taglib uri = "http://java.sun.com/jstl/xml_rt" prefix = "x" %>
    <%@ taglib uri = "http://java.sun.com/jstl/fmt_rt" prefix = "fmt" %>
    <%@ attribute name = "dolist" fragment = "true" %>
    <%@ variable name-given = "start" scope = "NESTED" %>
    <%@ variable name-given = "rest" scope = "NESTED" %>
    <c:import url="/WEB-INF/xml/right-hand.xml" var="rhs" />
    <x:parse xml="${rhs}" var="data" scope="request" />
    <x:forEach var="item" select="$requestScope:data/items/*">
        <c:set var="start">
            <x:out select="$item/start" />
        </c:set>
        <c:set var="rest">
            <x:out select="$item/rest" />
        </c:set>
        <jsp:invoke fragment="dolist" />
    </x:forEach>