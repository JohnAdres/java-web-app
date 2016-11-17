package com.jsf;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Nov 16, 2016
 */
import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;
import javax.faces.bean.ManagedBean;
// or import javax.inject.Named;
import javax.faces.bean.SessionScoped;
// or import javax.enterprise.context.SessionScoped;
import javax.faces.model.SelectItem;

@ManagedBean(name = "formLanguage")
@SessionScoped
public class Language implements Serializable {

     private Set<String> languages = new TreeSet<String>();

     public Set<String> getLanguages() {
          return languages;
     }

     public void setLanguages(Set<String> newValue) {
          languages = newValue;
     }

     public SelectItem[] getLanguageItems() {
          return languageItems;
     }
     private static final SelectItem[] languageItems = {
          new SelectItem("English"),
          new SelectItem("French"),
          new SelectItem("Russian"),
          new SelectItem("Italian"),
          new SelectItem("Esperanto", "Esperanto", "", true) // disabled
     };

}
