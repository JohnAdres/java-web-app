
package com.beans;
public class BeanCursor {

     private static final String[] names = {
          "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus",
          "Neptune", "Pluto"};

     private static final int numPlanets = names.length;

     private static final int[] moons = {0, 0, 1, 2, 16, 18, 20, 8, 1};
     private int index;

     public BeanCursor() {
          index=-1;
     }
     public boolean next() {
          index++;
          if (index >= numPlanets) {
              // index--;
               return false;
          } else {
               return true;
          }
     }

     public String getPlanet() {
          return names[index];
     }

     public int getMoon() {
          return moons[index];
     }
}
