package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

     public String message;

     @Override
     public void init() {
          message = "I am your First Servlet";
     }

     @Override
     public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
          res.setContentType("text/html");
          PrintWriter out = res.getWriter();
          out.println("<h1>" + message + "</h1>");
     }
     @Override
     public void destroy(){
          
     }
}
