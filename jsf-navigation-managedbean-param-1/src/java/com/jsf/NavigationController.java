package com.jsf;

import java.io.Serializable;
import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named(value = "navigationController")
@RequestScoped
public class NavigationController implements Serializable {

     //this managed property will read value from request parameter pageId
     @ManagedProperty(value = "#{param.pageId}")
     FacesContext fc = FacesContext.getCurrentInstance();
     private String pageId = getvalue(fc);

     //condional navigation based on pageId
     //if pageId is 1 show page1.xhtml,
     //if pageId is 2 show page2.xhtml
     //else show home.xhtml
     public String showPage() {

          if (pageId == null) {
               return "home";
          }
          if (pageId.equals("1")) {
               return "page1";
          } else if (pageId.equals("2")) {
               return "page2";
          } else {
               return "home";
          }

     }

     public String getvalue(FacesContext fc) {

          Map<String, String> params = fc.getExternalContext().getRequestParameterMap();
          return params.get("pageId");

     }

}
