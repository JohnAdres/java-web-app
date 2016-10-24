
package com.jsf;

import java.io.Serializable;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

/**
 * @author Hasan
 * Server: Apache TomEE 1.7.4
 */
@Named
@RequestScoped
public class NavigationController implements Serializable {
   public String moveToPage1(){
      return "page1";
   }
}
