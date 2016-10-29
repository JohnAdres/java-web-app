package com.corejsf;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class QuizBean implements Serializable {

     private ArrayList<ProblemBean> problems = new ArrayList<ProblemBean>();
     private int currentIndex, score;
     boolean valid = false;
     String url;
     int index = 0;

     public QuizBean() {

//          problems.add(new ProblemBean(new int[]{3, 1, 4, 1, 5}, 9));//pi
          problems.add(new ProblemBean(new int[]{1, 1, 2, 3, 5}, 8));//fibonacci
          problems.add(new ProblemBean(new int[]{1, 4, 9, 16, 25}, 36));//squares
//         problems.add(new ProblemBean(new int[]{2, 3, 5, 7, 11}, 13));//primes
          problems.add(new ProblemBean(new int[]{1, 2, 4, 8, 16}, 32));//power of 2
     }

//    public void QuizBean(ArrayList<ProblemBean> newValue){//it was setProblems
//         problems = newValue;
//         currentIndex = 0;
//         score = 0;
//    }
     public int getScore() {
          return score;
     }

     public ProblemBean getCurrent() {
          if (index == problems.size()-1) {
               setValid("result.xhtml");
          }
          return problems.get(currentIndex);
     }

     public String getAnswer() {
          return "";
     }

     public void setAnswer(String newValue) {
          try {

               if (index < problems.size()) {
                    int answer = Integer.parseInt(newValue.trim());
                    if (getCurrent().getSolution() == answer) {
                         score++;
                         index++;

                    }

                    currentIndex = (currentIndex + 1) % problems.size();
               }
          } catch (NumberFormatException e) {
          }
     }

     public String getUrl() {
          return url;
     }

     public void setValid(String url) {
          this.url = url;
          valid = true;
     }

     public boolean getValid() {
          return valid;
     }
}
