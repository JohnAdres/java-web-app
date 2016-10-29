
package com.jsf;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Oct 29, 2016
 */

import java.io.Serializable;

public class Problem
implements Serializable {
    private String question;
    private String answer;

    public Problem(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return this.question;
    }

    public String getAnswer() {
        return this.answer;
    }

    public boolean isCorrect(String response) {
        return response.trim().equalsIgnoreCase(this.answer);
    }
}