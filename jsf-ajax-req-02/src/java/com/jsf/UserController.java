package com.jsf;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UserController {

     private String resultText;

     public String getResultText() {
          return resultText;
     }

     public void setResultText(String resultText) {
          this.resultText = resultText;
     }

     public void sendAction() {
          try {
               Thread.sleep(2000);

          } catch (InterruptedException ex) {
               Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
          }
          resultText = "Success operation: " + new Date();
     }
}
