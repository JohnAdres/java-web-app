package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormGetServlet extends HttpServlet {

     @Override
     public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
          PrintWriter out = response.getWriter();
          String title = "Using GET Method to Read Form Data";
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
