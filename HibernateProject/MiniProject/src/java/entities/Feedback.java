/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;



import java.util.Date;
import org.hibernate.annotations.Proxy;


public class Feedback {
   
   private int feedbackId; 
   private String feedback;
   private Date date;
   private User userId;
   
    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

   public Feedback(){
   } 
   
   public Feedback(String feedback, Date date,User userId ){
       this.feedback= feedback;
       this.date=date;
       this.userId= userId;
   }   
   
}
