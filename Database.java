//Create a separate package;
package com.guruits.Hibernate;

//Import Methods
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

//Create a class name Database
public class Database 
{
	//Main Method;
    public static void main( String[] args )
   
    {

    	Employee Info = new Employee();		//Create new Employee Info;
    	//Employee Info = null;
    	
        Info.setEmployee_Id(07);
        Info.setEmployee_Name("Manirathnam");
        Info.setEmployee_Address("Mumbai");
        Info.setEmployee_Mobile(64615182);
        Info.setEmployee_Salary(50000);
        Info.setEmployee_JoinedOn(2010);
        
        //Configuration object
        Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        
        //SessionFactory object
        SessionFactory sf = con.buildSessionFactory(reg);
        
        //Method of open session
        Session session = sf.openSession();
        
        //CRUD Read Operation;
        /*
        System.out.println("READ DATA FROM DATABASE");
        Info = (Employee) session.get(Employee.class, 03);
        }
        */
        
        Transaction tx = session.beginTransaction();
        session.save(Info);
        
        tx.commit();
        System.out.println("UPDATE DATA INTO DATABASE");
        System.out.println(Info);
    }
}