package runner;

import entities.Food;
import java.util.List;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EditFood {
    
    public static int addFood(Food f){  
    
    int i=0;  
    Session session=new Configuration().  
     configure().buildSessionFactory().openSession();  

     Transaction t=session.beginTransaction();  

     i=(Integer)session.save(f);  

     t.commit();  
     session.close();  

     return i;  
     
    } 

    public static List<Food> getAllFood() {

        Session session = new Configuration().configure().buildSessionFactory().openSession();

        Query query = session.createQuery("from Food");

        List<Food> list = query.list();

        session.close();
        
        return list;
      
    }
    
    public static void updateFood(Food f){
        Session session = new Configuration().configure().buildSessionFactory().openSession();

        session.beginTransaction();
        
        //session.update(f);
        Food x=(Food)session.merge(f);

        session.saveOrUpdate(x);
        
        session.getTransaction().commit();
        
        session.close();
    }

}
