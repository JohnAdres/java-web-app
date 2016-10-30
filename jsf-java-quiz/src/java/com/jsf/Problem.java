package com.jsf;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Oct 29, 2016
 */
import java.io.Serializable;

public class Problem implements Serializable {

     private final String question;
     private final String answer;

     public Problem(String question, String answer) {
          this.question = question;
          this.answer = answer;
     }

     public String getQuestion() {
          return question;
     }

     public String getAnswer() {
          return answer;
     }

     // override for more sophisticated checking
     public boolean isCorrect(String response) {
          return response.trim().equalsIgnoreCase(answer);
     }
}
