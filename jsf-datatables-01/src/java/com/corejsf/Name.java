package com.corejsf;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Nov 27, 2016
 */
import java.io.Serializable;

public class Name implements Serializable {

     private String first;
     private String last;
     private boolean editable;

     public Name(String first, String last) {
          this.first = first;
          this.last = last;
     }

     public void setFirst(String newValue) {
          first = newValue;
     }

     public String getFirst() {
          return first;
     }

     public void setLast(String newValue) {
          last = newValue;
     }

     public String getLast() {
          return last;
     }

     public boolean isEditable() {
          return editable;
     }

     public void setEditable(boolean newValue) {
          editable = newValue;
     }
}
