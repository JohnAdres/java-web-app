<%@page contentType="text/html; charset=UTF-8"%>
  <%@page import="org.json.JSONObject"%>
  <%
  System.out.println("hi");
    JSONObject obj=new JSONObject();
    obj.put("name","Ambarish");
    obj.put("surname","Bura"); 
 response.getWriter().print(obj);
  %>
