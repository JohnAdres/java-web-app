package com.beans;

/**
 *
 * @author Hasan
 */
public class Thermostat {

     private int temp;
     private int maxTemp;
     private int minTemp;
     private String fuelType;

     public Thermostat() {
// no argument constructor for Bean use
          this(75);
     }

     public Thermostat(int temp) {
          this.temp = temp;
          init();
     }

     public void setTemp(int temp) {
          this.temp = temp;
// initialize settings with this temp
          init();
     }

     public int getTemp() {
          return temp;
     }

     public String  init() {
          maxTemp = this.temp + 10;
          minTemp = this.temp - 15;
          if (maxTemp > 150) {
               return (fuelType = "Dilithium");
          } else {
               return (fuelType = "NaturalGas");
          }
     }
}
