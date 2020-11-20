package runner;

import entities.User;
import entities.Feedback;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import org.hibernate.Query;

import org.hibernate.Session;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  
  
public class ViewFeedback {  
  
public static List<Feedback> getFeedback(){  
    
 int i=0;  
 Session session=new Configuration().  
  configure().buildSessionFactory().openSession();  
          
  //Transaction t=session.beginTransaction();  
  //t.begin();  
    Query query = session.createQuery("from Feedback");
  //i=(Integer)session.save(v);  
      List<Feedback> list = query.list();
  //t.commit();  
  session.close();  
    
  return list;  
 } 

 public static int addFeedback(Feedback f){   
     
    int i=0;  
    
    long timeNow=Calendar.getInstance().getTimeInMillis();
    Timestamp ts=new Timestamp(timeNow);
    
    f.setDate(ts);
    
    Session session=new Configuration().  
     configure().buildSessionFactory().openSession();  

     Transaction t=session.beginTransaction();  

     i=(Integer)session.save(f);  

     t.commit();  
     session.close();  

     return i;  
 } 



}  