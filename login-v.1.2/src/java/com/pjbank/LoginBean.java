
package com.pjbank;

/**
 *
 * @author Hasan
 */
import java.io.Serializable;
public class LoginBean implements Serializable {
     private String username;
     private String password;
     private boolean valid = false;
     
     public LoginBean() {
     
     }

     public String getUsername() {
          return username;
     }

     public void setUsername(String value) {
          this.username = value;
     }

     public String getPassword() {
          return password;
     }

     public void setPassword(String value) {
          this.password = value;
     }
     
     public boolean isValid(){
          valid = false;
          if(username != null && password != null)
               valid = true;
          return valid;
     }
}
