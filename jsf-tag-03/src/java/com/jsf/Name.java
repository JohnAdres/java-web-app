package com.jsf;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Nov 16, 2016
 */
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
// or import javax.inject.Named;
import javax.faces.bean.SessionScoped;
// or import javax.enterprise.context.SessionScoped;

@ManagedBean(name = "formName") // or @Named("form")
@SessionScoped
public class Name implements Serializable {

     private String name;
     private boolean contactMe;

     public String getName() {
          return name;
     }

     public void setName(String newValue) {
          name = newValue;
     }

     public boolean getContactMe() {
          return contactMe;
     }

     public void setContactMe(boolean newValue) {
          contactMe = newValue;
     }
     
}
