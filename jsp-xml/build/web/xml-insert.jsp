<%-- 
    Document   : xml-insert
    Created on : Sep 24, 2016, 10:05:13 AM
    Author     : Hasan
--%>

<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/xml_rt" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jstl/sql_rt" prefix="sql" %>
<sql:setDataSource driver="org.apache.derby.jdbc.ClientDriver"
                   url="jdbc:derby://localhost:1527/pjbank"
                   user="hasan" password="safe"/>
<html>
    <body>
        <h2> Inserting Portfolio into the Database </h2>
        <hr/>
        <c:set var="total" value="0" />
        <c:import url="/WEB-INF/portfolio.xml" var="funds" />
        <x:parse xml="${funds}" var="portfolio-var" scope="request" />
        <x:forEach var="fund" select="$requestScope:portfolio-var/portfolios/*">
            <sql:update>
                INSERT INTO pjbank.portfolio VALUES(?, ?, ?, ?,?)
                <sql:param><x:out select="$fund/name" /></sql:param>
                <sql:param><x:out select="$fund/shares" /></sql:param>
                <sql:param><x:out select="$fund/purchase-price" /></sql:param>
                
                <c:set var="cprice"> <x:out select="$fund/current-price" /></c:set>              
                <sql:param value="${cprice}" />
                
                <c:set var = "share"> <x:out select ="$fund/shares" /></c:set> 
                <sql:param value="${cprice * share}" />
            </sql:update>
            Inserted <x:out select="$fund/name" /> into the database.<br/>
        </x:forEach>
    </body>
</html>