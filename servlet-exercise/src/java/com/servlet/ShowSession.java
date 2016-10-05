package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShowSession extends HttpServlet {

     public void doGet(HttpServletRequest request,
             HttpServletResponse response)
             throws ServletException, IOException {
          response.setContentType("text/html");
          PrintWriter out = response.getWriter();
          String title = "Session Tracking Example";
          HttpSession session = request.getSession(true);
          String heading;
// Use getAttribute instead of getValue in version 2.2.
          Integer accessCount = (Integer) session.getValue("accessCount");
          if (accessCount == null) {
               accessCount = 0;
               heading = "Welcome, Newcomer";
          } else {
               heading = "Welcome Back";
               accessCount = accessCount+1;
          }
// Use setAttribute instead of putValue in version 2.2.
          session.setAttribute("accessCount", accessCount);
          out.println("<HTML>"
                  + "<BODY BGCOLOR=\"#FDF5E6\">\n"
                  + "<H1 ALIGN=\"CENTER\">" + heading + "</H1>\n"
                  + "<H2>Information on Your Session:</H2>\n"
                  + "<TABLE BORDER=1 ALIGN=\"CENTER\">\n"
                  + "<TR BGCOLOR=\"#FFAD00\">\n"
                  + " <TH>Info Type<TH>Value\n"
                  + "<TR>\n"
                  + " <TD>ID\n"
                  + " <TD>" + session.getId() + "\n"
                  + "<TR>\n"
                  + " <TD>Creation Time\n"
                  + " <TD>"
                  + new Date(session.getCreationTime()) + "\n"
                  + "<TR>\n"
                  + " <TD>Time of Last Access\n"
                  + " <TD>"
                  + new Date(session.getLastAccessedTime()) + "\n"
                  + "<TR>\n"
                  + " <TD>Number of Previous Accesses\n"
                  + " <TD>" + accessCount + "\n"
                  + "</TABLE>\n"
                  + "</BODY></HTML>");
     }

     /**
      * Handle GET and POST requests identically.
      */
     @Override
     public void doPost(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {
          doGet(request, response);
     }
}
