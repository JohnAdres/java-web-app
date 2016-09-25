/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pjbank.functions;

import com.pjbank.LoginBean;

public class Validate {

     public static String validate(LoginBean lb) {
          try {
               if ((lb.getUsername().equals("jack"))
                       && (lb.getPassword().equals("jill"))) {
                    return "Valid Login";
               }
               return "Invalid Login, Please try again.";
          } catch (NullPointerException ex) { // No login data
               return "Please Login.";
          }
     }
}
