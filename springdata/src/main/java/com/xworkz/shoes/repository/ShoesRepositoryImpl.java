package com.xworkz.shoes.repository;

import com.xworkz.shoes.entity.ShoesEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Component
public class ShoesRepositoryImpl  implements  ShoesRepository{

    @Override
    public boolean save(ShoesEntity shoesEntity) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("X-workz");
     EntityManager em = emf.createEntityManager();
    EntityTransaction et =  em.getTransaction();
    try{
        et.begin();
        em.persist(shoesEntity);
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
