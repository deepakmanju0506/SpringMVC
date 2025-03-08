package com.xworkz.jet.repository;

import com.xworkz.jet.entity.JetEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Component
public class JetRepositoryImpl implements JetRepository{
    @Override
    public boolean save(JetEntity jetEntity) {
        EntityManagerFactory emf =Persistence.createEntityManagerFactory("X-workz");
       EntityManager em = emf.createEntityManager();
      EntityTransaction et =  em.getTransaction();

      try{
          et.begin();
          em.persist(jetEntity);
          et.commit();
          return  true;
      }catch(Exception e){
          et.rollback();
      }finally {
          em.close();
          emf.close();
      }
        return false;
    }
}
