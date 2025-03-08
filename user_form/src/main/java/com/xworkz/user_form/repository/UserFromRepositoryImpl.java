package com.xworkz.user_form.repository;

import com.xworkz.user_form.entity.UserFormEntity;
import com.xworkz.user_form.service.UserFormService;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class UserFromRepositoryImpl implements UserFormRepository{

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("userForm");

    public UserFromRepositoryImpl(){
        System.out.println("created a no-Args in UserFormServiceImpl ");
    }


    @Override
    public boolean save(UserFormEntity userFormEntity) {

        EntityManager em =emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(userFormEntity);
        em.getTransaction().commit();
        em.close();
        return true ;
    }

    @Override
    public List<UserFormEntity> getAll() {
        EntityManager em = emf.createEntityManager();

        return emf.createEntityManager().createNamedQuery("findAll").getResultList();
    }

    @Override
    public void deleteUserById(Integer id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.createNamedQuery("deleteUser").setParameter("id",id).executeUpdate();
        em.getTransaction().commit();

    }

    @Override
    public UserFormEntity findById(Integer id) {
        EntityManager em  = emf.createEntityManager();
        Query query = em.createNamedQuery("findById").setParameter("id",id);
        System.out.println("Repo :"+query.getSingleResult());
        return (UserFormEntity) query.getSingleResult();
    }

    @Override
    public boolean updateUser(UserFormEntity userFormEntity) {

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        UserFormEntity userFormEntitys = em.find(UserFormEntity.class,userFormEntity.getId());
        if(userFormEntitys != null){
            em.merge(userFormEntitys);
            em.getTransaction().commit();
        }
        em.close();
        return true;
    }
}
