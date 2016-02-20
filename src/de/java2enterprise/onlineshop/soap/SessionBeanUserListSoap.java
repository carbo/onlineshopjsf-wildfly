package de.java2enterprise.onlineshop.soap;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by cbokeloh on 20.02.16.
 */
@WebService
@SOAPBinding(style= SOAPBinding.Style.RPC)
public interface SessionBeanUserListSoap extends java.rmi.Remote {

    @WebMethod
    public String echo();
}
