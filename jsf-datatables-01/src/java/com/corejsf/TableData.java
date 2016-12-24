package com.corejsf;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Nov 27, 2016
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

import javax.faces.bean.ManagedBean;
// or import javax.inject.Named;
import javax.faces.bean.SessionScoped;
// or import javax.enterprise.context.SessionScoped;

@ManagedBean // or @Named
@SessionScoped
public class TableData implements Serializable {

     /*private static final Name[] names = new Name[]{
          new Name("William", "Dupont"),
          new Name("Anna", "Keeney"),
          new Name("Mariko", "Randor"),
          new Name("John", "Wilson")
     };

     public Name[] getNames() {
          return names;
     }
      */
     private static final ArrayList<Name> names = new ArrayList<Name>(Arrays.asList(
             new Name("William", "Dupont"),
             new Name("Anna", "Keeney"),
             new Name("Mariko", "Randor"),
             new Name("John", "Wilson")));

     public  ArrayList<Name> getNames() {
          return names;
     }

     // this can void too
     public String save() {
          // if you make it true then as soon as you press save all index will be editable.
          for (Name name : names) {
               name.setEditable(false);
          }
          return null;
     }
     
     public String deleteRow(Name name){
          names.remove(name);
          return null;
     }
        
}
