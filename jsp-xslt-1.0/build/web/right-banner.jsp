<%-- 
    Document   : right-banner
    Created on : Sep 25, 2016, 9:30:01 AM
    Author     : Hasan
--%>
<%@ taglib prefix="pjbank" tagdir="/WEB-INF/tags" %>
<table class="border">
    <pjbank:list>
        <jsp:attribute name="dolist">
            <tr><td>
                    <font class="start">${start}</font>
                    <font class="rest">${rest}</font>
                </td></tr>
            </jsp:attribute>
        </pjbank:list>
</table>