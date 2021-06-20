/*package org.example.simplee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class Tester {
    public static void main(String[] args)
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        //Employee emp = new Employee();
        ////Employee emp = entityManager.find(Employee.class, "165d4bdb-b182-4c21-b760-59637e8fc99e");

        //emp.setEmail("ss.zz@hmail.com");
        //emp.setFirstName("chili");
        //emp.setLastName("zhang");
       //entityManager.getTransaction().begin();
        //entityManager.merge(emp);
        //entityManager.remove(emp);
        //TypedQuery<Employee>query = entityManager.createQuery("SELECT emp FROM Employee emp ORDER BY emp.email DESC", Employee.class);
        TypedQuery<Employee>query = entityManager.createNamedQuery("Employee.findAll", Employee.class);

        List<Employee> resultList = query.getResultList();
        for(Employee emp : resultList)
        {
            System.out.println(emp);
        }


        //entityManager.getTransaction().commit();

        //delete
        //entityManager.remove(emp);


        entityManager.close();

        entityManagerFactory.close();
    }
}
*/


