package com.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Example using servlet initialization and the getLastModified method.
 */
public class GetLastModified extends HttpServlet {

     private long modTime;
     private int[] numbers = new int[5];

     /**
      * The init method is called only when the servlet is first loaded, before
      * the first request is processed.
      */
     public void init() throws ServletException {
// Round to nearest second (ie 1000 milliseconds)
          modTime = System.currentTimeMillis() / 1000 * 1000;
          for (int i = 0; i < numbers.length; i++) {
               numbers[i] = (int) (Math.random() * 100);
          }
     }

     public void doGet(HttpServletRequest request,
             HttpServletResponse response)
             throws ServletException, IOException {
          response.setContentType("text/html");
          PrintWriter out = response.getWriter();
          String title = "Your Lottery Numbers";
          out.println(
                 "Based upon extensive research of "
                  + "astro-illogical trends, psychic farces, "
                  + "and detailed statistical claptrap, "
                  + "we have chosen the " + numbers.length
                  + " best lottery numbers "
                  + "<OL>");
          for (int i = 0; i < numbers.length; i++) {
               out.println(" <LI>" + numbers[i]);
          }
        
     }

     @Override
     public long getLastModified(HttpServletRequest request) {
          return (modTime);
     }
               
}
