package de.java2enterprise.onlineshop.soap;

import de.java2enterprise.onlineshop.model.Customer;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by cbokeloh on 20.02.16.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class UserListSoap {
    @PersistenceUnit
    private EntityManagerFactory emf;
    @WebMethod
    public List<Customer> echo(String input)
    {
        StringBuilder builder = new StringBuilder();
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT e FROM Customer e");
        List<Customer> customers = query.getResultList();

        return customers;
    }
}
