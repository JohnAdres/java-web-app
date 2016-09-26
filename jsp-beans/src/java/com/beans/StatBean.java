/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

public class StatBean {

     private double[] numbers;


     public double getAverage() {
          double sum = 0;
          for (int i = 0; i < numbers.length; i++) {
               sum += numbers[i];
          }
          return sum / numbers.length;
     }

     public double[] getNumbers() {
          return numbers;
     }

     public double getNumbers(int index) {
          return numbers[index];
     }

     public void setNumbers(double[] numbers) {
          this.numbers = numbers;
     }

     public void setNumbers(int index, double value) {
          numbers[index] = value;
     }

     public int getNumbersSize() {
        
          return numbers.length;
     }
     
}
