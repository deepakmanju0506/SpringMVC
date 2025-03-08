package com.xworkz.fan.repository;

import com.xworkz.fan.entity.FanEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Component
public class FanRepositoryImpl implements FanRepository{
    @Override
    public boolean save(FanEntity fanEntity) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("X-workz");
    EntityManager em = emf.createEntityManager();
   EntityTransaction et = em.getTransaction();
   try{
       et.begin();
       em.persist(fanEntity);
       et.commit();
       return true;
   }catch (Exception e){
       et.rollback();
   }finally {
       emf.close();
       em.close();
   }
        return false;
    }
}
