<%-- 
    Document   : xml-query
    Created on : Sep 24, 2016, 11:09:26 AM
    Author     : Hasan
--%>

<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jstl/sql_rt" prefix="sql" %>
<jsp:useBean id="today" class="java.util.Date" />

<sql:setDataSource driver="org.apache.derby.jdbc.ClientDriver"
                   url="jdbc:derby://localhost:1527/pjbank"
                   user="hasan" password="safe"/>
<html>
    <body>
        <h2> Portfolio Statement </h2>
        <hr/>
        <c:set var="total" value="0" />
        <sql:query var="funds">
            SELECT * FROM pjbank.portfolio
        </sql:query>
        <table border="2">
            <tr>
                <th>Fund Name</th><th>Shares</th><th>Purchase Price</th>
                <th>Current Price</th><th>Current Value</th>
            </tr>
            <c:forEach var="fund" begin="0" items="${funds.rows}">
                <tr>
                    <td>${fund.FundName}</td>
                    <c:set var="shares" value="${fund.shares}" />
                    <td>${shares}</td>
                    <c:set var="pprice" value="${fund['PurchasePrice']}" />
                    <td><fmt:formatNumber value="${pprice}" type="currency"/></td>
                    <c:set var="cprice" value="${fund['CurrentPrice']}" />
                    <td><fmt:formatNumber value="${cprice}" type="currency"/></td>
                    <td><fmt:formatNumber value="${cprice * shares}" type="currency"/></td>
                </tr>
                <c:set var="total" value="${total + cprice * shares}" />
            </c:forEach>
        </table>
        <p/>
        Total Balance on
        <fmt:formatDate value="${today}" type="date" dateStyle="full" /> is
        <fmt:formatNumber value="${total}" type="currency"/>. <hr/>
    </body>
</html>