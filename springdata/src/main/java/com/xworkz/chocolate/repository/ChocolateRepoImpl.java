package com.xworkz.chocolate.repository;

import com.xworkz.chocolate.entity.ChocolateEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
@Component
public class ChocolateRepoImpl implements ChocolateRepo{
    @Override
    public boolean save(ChocolateEntity chocolateEntity) {
        EntityManagerFactory emf =  Persistence.createEntityManagerFactory("X-workz");
        EntityManager em = emf.createEntityManager();
       EntityTransaction et =em.getTransaction();

       try{
           et.begin();
           em.persist(chocolateEntity);
           et.commit();
           return true;
       }catch(Exception e){
           et.rollback();

       }finally {

           em.close();
       }
        return false;
    }
}
