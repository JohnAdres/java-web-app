
package com.beans;

import java.util.StringTokenizer;
import java.util.Vector;

public class StatBeanList {

     private double[] numbers;
//------------------------------------------------------------------------------
     public double getAverage() {
          double sum = 0;
          for (int i = 0; i < numbers.length; i++) {
               sum += numbers[i];
          }
          return sum / numbers.length;
     }
//------------------------------------------------------------------------------
     public void setNumberList(String values) {
          Vector n = new Vector();
          StringTokenizer tok = new StringTokenizer(values, ",");
          while (tok.hasMoreTokens()) {
               n.addElement(tok.nextToken());
               numbers = new double[n.size()];
               for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = Double.parseDouble((String) n.elementAt(i));
               }
          }
     }
//------------------------------------------------------------------------------

     public String getNumberList() {

          String list = new String();
          for (int i = 0; i < numbers.length; i++) {
               if (i != numbers.length - 1) {
                    list += numbers[i] + ",";
               } else {
                    list += " " + numbers[i];
               }

          }

          return list;
     }
}
