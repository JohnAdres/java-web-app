<%-- 
    Document   : index
    Created on : Sep 24, 2016, 7:16:44 AM
    Author     : Hasan
--%>
<!--json-taglib-0.4.1.jar used
http://json-taglib.sourceforge.net/tutorial.html
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<json:object>
  <json:property name="outer" value="foo"/>
    
  <json:object name="inner">
    <json:property name="innerProp1" value="val1"/>
    <json:property name="innerProp2" value="val2"/>
    
    <json:object name="inner2">
      <json:property name="inner2Prop1" value="in2p1"/>
      <json:property name="inner2Prop2" value="in2p2"/>
    </json:object>  
      
  </json:object> 
</json:object>