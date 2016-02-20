package de.java2enterprise.onlineshop.soap;

import javax.ejb.Stateless;
import javax.jws.WebService;
import java.lang.annotation.Annotation;

/**
 * Created by cbokeloh on 20.02.16.
 */
@Stateless
@WebService(endpointInterface="de.java2enterprise.onlineshop.soap.SessionBeanUserListSoap")
public class SessionBeanUserListSoapImpl {
    public String echo() {
        return "Hallo";
    }
}
