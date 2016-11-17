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
import javax.faces.model.SelectItem;

@ManagedBean(name = "formColor") // or @Named("form")
@SessionScoped

public class Color implements Serializable {

     private int[] colors;

     public int[] getColors() {
          return colors;
     }

     public void setColors(int[] newValue) {
          colors = newValue;
     }

     public SelectItem[] getColorItems() {
          return colorItems;
     }

     private final SelectItem[] colorItems = {
          new SelectItem(java.awt.Color.RED.getRGB(), "Red"), // value, label
          new SelectItem(java.awt.Color.GREEN.getRGB(), "Green"),
          new SelectItem(java.awt.Color.BLUE.getRGB(), "Blue"),
          new SelectItem(java.awt.Color.YELLOW.getRGB(), "Yellow"),
          new SelectItem(java.awt.Color.ORANGE.getRGB(), "Orange", "", true) // disabled
     };

     public String getColorsConcatenated() {
          StringBuilder result = new StringBuilder();
          for (int color : colors) {
               result.append(String.format("%06x ", color));
          }
          return result.toString();
     }

}
