package org.example;


import org.example.entity.Address;
import org.example.entity.Employee;
import org.example.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class TestRelationalEntity {
    public static void main(String[] args)
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
         //User user = new User();
         //user.setEmail("pavitra.shetty@gmail.com");
         //user.setFirstName("pavitra");
         //user.setLastName("Shetty");
        //Address address = new Address();
        //address.setCity("nagar");
        //address.setState("maharashtra");
        //address.setStreet("mg road");
        //entityManager.getTransaction().begin();
        //entityManager.persist(address);
        //user.setAddress(address);
        User user = entityManager.find(User.class,"18269b3f-ac05-48e8-9151-fce60807bb11");
        //entityManager.persist(user);
        //entityManager.getTransaction().commit();


        entityManager.close();

        entityManagerFactory.close();
    }
}

