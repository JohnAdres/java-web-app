<%-- 
    Document   : xmlparse
    Created on : Sep 23, 2016, 4:12:02 PM
    Author     : Hasan
--%>
<!--To run this code please add jstl-1.2_1.jar to Tomcat server's lib folder
http://www.java2s.com/Code/Jar/j/Downloadjstl121jar.htm. Restart Netbeans + restart
Tomcat
-->
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/xml_rt" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<jsp:useBean id="today" class="java.util.Date" />
<!--core tags: set, remove, out, catch, if, choose, when, forEach, 
forToken, otherwise, import, redirect, url, param-->
<html>
    <body>
        <h2> Portfolio Statement </h2>
        <hr/>
        <c:set var="total" value="0" />
        <c:import url="/WEB-INF/portfolio.xml" var="funds" />
        <x:parse xml="${funds}" var="portfolio-var" scope="request" />
        <table border="2">
            <tr>
                <th>Fund Name</th><th>Shares</th><th>Purchase Price</th>
                <th>Current Price</th><th>Current Value</th>
            </tr>
            <!--The out tag places the result to the template text which is
            in this case body of the set tag-->
            <x:forEach var="fund" select="$requestScope:portfolio-var/portfolios/*">
                <tr>
                    <td><x:out select="$fund/name" /></td>
                    <c:set var="shares">
                        <x:out select="$fund/shares" />
                    </c:set>
                    <td>${shares}</td>
                    <c:set var="pprice">
                        <x:out select="$fund/purchase-price" />
                    </c:set>
                    <td><fmt:formatNumber value="${pprice}" type="currency"/></td>
                    <c:set var="cprice">
                        <x:out select="$fund/current-price" />
                    </c:set>
                    <td><fmt:formatNumber value="${cprice}" type="currency"/></td>
                    <td><fmt:formatNumber value="${cprice * shares}" type="currency"/></td>
                </tr>
                <c:set var="total" value="${total + cprice * shares}" />
            </x:forEach>
        </table>
        <p/>
        Total Balance on
        <fmt:formatDate value="${today}" type="date" dateStyle="full" /> is
        <fmt:formatNumber value="${total}" type="currency"/>.<hr/>
    </body>
</html>