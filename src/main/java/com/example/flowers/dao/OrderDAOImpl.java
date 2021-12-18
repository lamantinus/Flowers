package com.example.flowers.dao;

import com.example.flowers.entities.Basket;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class OrderDAOImpl implements OrderDAO {

    @PersistenceContext
    private EntityManager entityManager;

    protected Session getSession() {
        return entityManager.unwrap(Session.class);
    }

    @Override
    public List<Basket> getNotCompletedOrders() {
        return entityManager.createQuery("SELECT b FROM Basket b WHERE b.completed = false").getResultList();
    }

    @Override
    public void complete(int basketId) {
        Session session = this.getSession();

        Basket basket = (Basket) entityManager
            .createQuery("from Basket b where b.id = :basketId")
            .setParameter("basketId", basketId)
            .getResultList().stream().findFirst().orElse(null);

        basket.setCompleted(true);

        session.update(basket);
    }
}

