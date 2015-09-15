package dat.cphbusiness.sip15web;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class genSchema {

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dat.cphbusiness_sip15web_war_1.0-SNAPSHOTPU");
    static EntityManager em = emf.createEntityManager();
    
    public static void main(String[] args) {
        
        // GENERATE SCHEMA
        
        // Generates the SQL-Schema for Student, Subject & Student_Subject
        //Persistence.generateSchema("dat.cphbusiness_sip15web_war_1.0-SNAPSHOTPU", null);
 
        // PERSIST OBJECT
        
//        Student testStudent = new Student("TEST");
//        em.getTransaction().begin();
//        em.persist(testStudent);
//        em.getTransaction().commit();
        
        
    }
    
}
