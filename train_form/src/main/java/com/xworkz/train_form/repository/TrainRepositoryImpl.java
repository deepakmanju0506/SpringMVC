package com.xworkz.train_form.repository;

import com.xworkz.train_form.entity.TrainEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Repository
public class TrainRepositoryImpl implements TrainRepository{

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("trainForm");
    @Override
    public boolean save(TrainEntity trainEntity) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(trainEntity);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public List<TrainEntity> getAll() {
        EntityManager em = emf.createEntityManager();
        return emf.createEntityManager().createNamedQuery("getAll").getResultList();
    }

    @Override
    public void removeData(int id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.createNamedQuery("deleteData").setParameter("id",id).executeUpdate();
        em.getTransaction().commit();
    }

    @Override
    public TrainEntity findAll(Integer id) {
         EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("findById").setParameter("id",id);

        return (TrainEntity) query.getSingleResult();
    }

    @Override
    public boolean updateData(TrainEntity trainEntity) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TrainEntity trainEntity1 = em.find(TrainEntity.class, trainEntity.getId());
        if(trainEntity1 != null){
        em.merge(trainEntity1);
        em.getTransaction().commit();
    }
        return true;
    }
}
