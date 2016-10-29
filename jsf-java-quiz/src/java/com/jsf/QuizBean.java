package com.jsf;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Oct 29, 2016
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class QuizBean
        implements Serializable {

     private int currentProblem;
     private int tries;
     private int score;
     private String response = "";
     private String correctAnswer;
     private ArrayList<Problem> problems = new ArrayList<Problem>(Arrays.asList(
             new Problem("What trademarked slogan describes Java development? Write once, ...", "run anywhere"),
             new Problem("What are the first 4 bytes of every class file (in hexadecimal)?", "CAFEBABE"),
             //             new Problem("What does this statement print? System.out.println(1+\"2\");", "12"),
             //             new Problem("Which Java keyword is used to define a subclass?", "extends"),
             //             new Problem("What was the original name of the Java programming language?", "Oak"),
             new Problem("Which java.util class describes a point in time?", "Date")));

     public String getQuestion() {
          return this.problems.get(this.currentProblem).getQuestion();
     }

     public String getAnswer() {
          return this.correctAnswer;
     }

     public int getScore() {
          return this.score;
     }

     public String getResponse() {
          return this.response;
     }

     public void setResponse(String newValue) {
          this.response = newValue;
     }

     public String AnswerAction() {
          ++this.tries;
          if (this.problems.get(this.currentProblem).isCorrect(this.response)) {
               ++this.score;

               if (this.currentProblem == this.problems.size()) {
                    return "done";
               } else {
                    this.nextProblem();
               }
               return "success";
          }
          if (this.tries == 1) {
               return "again";
          }
          this.nextProblem();
          if (this.currentProblem == this.problems.size()) {
               return "done";
          }
          return "failure";
     }

     public String startOverAction() {
          Collections.shuffle(this.problems);
          this.currentProblem = 0;
          this.score = 0;
          this.tries = 0;
          this.response = "";
          return "startOver";
     }

     private void nextProblem() {
          this.correctAnswer = this.problems.get(this.currentProblem).getAnswer();
          ++this.currentProblem;
          this.tries = 0;
          this.response = "";
     }
}
