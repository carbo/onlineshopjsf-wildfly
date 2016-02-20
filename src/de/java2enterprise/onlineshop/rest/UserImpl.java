package de.java2enterprise.onlineshop.rest;

import de.java2enterprise.onlineshop.model.Customer;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;

/**
 * Created by cbokeloh on 18.02.16.
 */
@Stateless
public class UserImpl implements User {
    @PersistenceUnit
    private EntityManagerFactory emf;

    @Transactional
    @Override
    public List<Customer> allUsers() {
        StringBuilder builder = new StringBuilder();
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT e FROM Customer e");
        List<Customer> customers = query.getResultList();

        return customers;
    }
}
