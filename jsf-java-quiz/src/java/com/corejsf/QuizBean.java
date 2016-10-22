package com.corejsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;


/**
 *
 * @author Hasan
 */
@Named
@SessionScoped
public class QuizBean implements Serializable {

     private int currentProblem;
     private int tries;
     private int score;
     private String response = "";
     private String correctAnswer;

     private ArrayList<com.corejsf.Problem> problems = new ArrayList<com.corejsf.Problem>(Arrays.asList(
             new com.corejsf.Problem(
                     "What trademarked slogan describes Java development? Write once, ...",
                     "run anywhere"),
             new com.corejsf.Problem(
                     "What are the first 4 bytes of every class file (in hexadecimal)?",
                     "CAFEBABE"),
             new com.corejsf.Problem(
                     "What does this statement print? System.out.println(1+\"2\");",
                     "12"),
             new com.corejsf.Problem(
                     "Which Java keyword is used to define a subclass?",
                     "extends"),
             new com.corejsf.Problem(
                     "What was the original name of the Java programming language?",
                     "Oak"),
             new com.corejsf.Problem(
                     "Which java.util class describes a point in time?",
                     "Date")));

     public String getQuestion() {
          return problems.get(currentProblem).getQuestion();
     }

     public String getAnswer() {
          return correctAnswer;
     }

     public int getScore() {
          return score;
     }

     public String getResponse() {
          return response;
     }

     public void setResponse(String newValue) {
          response = newValue;
     }
     //-------------------------------------------------------------------------
     public String AnswerAction() {
          tries++;
          if (problems.get(currentProblem).isCorrect(response)) {
               score++;
               nextProblem();
               if (currentProblem == problems.size()) {
                    return "done";
               } else {
                    return "success";
               }
          } else if (tries == 1) {
               return "again";
          } else {
               nextProblem();
               if (currentProblem == problems.size()) {
                    return "done";
               } else {
                    return "failure";
               }
          }
     }//AnswerAction()
     
     public String startOverAction(){
          Collections.shuffle(problems);
          currentProblem = 0;
          score = 0;
          tries = 0;
          response="";
          return "startOver";
     }
     //-------------------------------------------------------------------------
     private void nextProblem(){
          correctAnswer = problems.get(currentProblem).getAnswer();
          currentProblem++;
          tries = 0;
          response="";
     }
}
