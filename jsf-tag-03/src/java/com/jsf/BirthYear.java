package com.jsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.faces.model.SelectItem;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Nov 16, 2016
 */
import javax.faces.bean.ManagedBean;
// or import javax.inject.Named;
import javax.faces.bean.SessionScoped;
// or import javax.enterprise.context.SessionScoped;
import javax.faces.model.SelectItem;

@ManagedBean(name = "formBirth") // or @Named("form")
@SessionScoped
public class BirthYear implements Serializable {

     private Integer yearOfBirth;

     public Integer getYearOfBirth() {
          return yearOfBirth;
     }

     public void setYearOfBirth(Integer newValue) {
          yearOfBirth = newValue;
     }

     private static final Collection<SelectItem> birthYears;

     static {
          birthYears = new ArrayList<SelectItem>();
          // The first item is a "no selection" item
          birthYears.add(new SelectItem(null, "Pick a year:", "", false, false, true));
          for (int i = 1900; i < 2020; ++i) {
               birthYears.add(new SelectItem(i));
          }
     }

     public Collection<SelectItem> getYearItems() {
          return birthYears;
     }
}
