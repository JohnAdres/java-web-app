<%-- 
    Document   : timer
    Created on : Sep 26, 2016, 6:48:40 PM
    Author     : Hasan
--%>
<jsp:useBean id="timer" class="com.beans.TimerBean" scope="session"/>
<jsp:setProperty name="timer" property="startTime" value="11"/>
<html><body>
        Your online timer has been restarted?
        <jsp:getProperty name="timer" property="elapsedMinutes"/>
    </body></html>