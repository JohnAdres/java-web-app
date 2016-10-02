package com.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class FormPostServlet extends HttpServlet {
// Method to handle POST method request.

     @Override
     public void doPost(HttpServletRequest request,
             HttpServletResponse response)
             throws ServletException, IOException {
          doGet(request, response);
     }

     // Method to handle GET method request.
     @Override
     public void doGet(HttpServletRequest request,
             HttpServletResponse response)
             throws ServletException, IOException {
          // Set response content type
          response.setContentType("text/html");

          PrintWriter out = response.getWriter();
          String title = "Using POST Method to Read Form Data";

          out.println(
                  "<html><body>"
                  + "<h1 align=\"center\">" + title + "</h1>\n"
                  + "<ul><li><b>First Name</b>: "
                  + request.getParameter("first_name")
                  + "<li><b>Last Name</b>: "
                  + request.getParameter("last_name")
                  + "</ul>"
                  + "</body></html>");
     }

}
