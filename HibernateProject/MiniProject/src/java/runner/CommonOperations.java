package runner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import entities.Feedback;
import entities.User;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 *
 * @author Aravind Sankaran Nair
 */
public class CommonOperations {
    
     public static List<User> getLoginDetails(User user){
         
         Session session=null;
    SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory(); 
         session=sessionFactory.openSession();
         session.beginTransaction();
         String UNAME=user.getUname();
         String UPASSWORD=user.getPword();
         String SQL_QUERY = "from User where uname='"+UNAME+"' AND pword='"+UPASSWORD+"'";         
         List<User> admin = session.createQuery(SQL_QUERY).list();        
         session.close();  
         
        return admin;   
    }
     
     public static int register(User u){   
     
    int i=0;  
    
    long timeNow=Calendar.getInstance().getTimeInMillis();
    Timestamp ts=new Timestamp(timeNow);
    
    u.setUser_category(2);
    
    Session session=new Configuration().  
     configure().buildSessionFactory().openSession();  

     Transaction t=session.beginTransaction();  

     i=(Integer)session.save(u);  

     t.commit();  
     session.close();  

     return i;  
 } 
    
}