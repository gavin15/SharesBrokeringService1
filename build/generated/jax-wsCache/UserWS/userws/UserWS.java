
package userws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.netbeans.xml.schema.userxmlschema.CompanyType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserWS", targetNamespace = "http://UserWS/")
@XmlSeeAlso({
    org.netbeans.xml.schema.userxmlschema.ObjectFactory.class,
    userws.ObjectFactory.class
})
public interface UserWS {


    /**
     * 
     * @param password
     * @param currency
     * @param userName
     * @throws FileNotFoundException_Exception
     */
    @WebMethod(operationName = "CreateUser")
    @RequestWrapper(localName = "CreateUser", targetNamespace = "http://UserWS/", className = "userws.CreateUser")
    @ResponseWrapper(localName = "CreateUserResponse", targetNamespace = "http://UserWS/", className = "userws.CreateUserResponse")
    @Action(input = "http://UserWS/UserWS/CreateUserRequest", output = "http://UserWS/UserWS/CreateUserResponse", fault = {
        @FaultAction(className = FileNotFoundException_Exception.class, value = "http://UserWS/UserWS/CreateUser/Fault/FileNotFoundException")
    })
    public void createUser(
        @WebParam(name = "userName", targetNamespace = "")
        String userName,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "currency", targetNamespace = "")
        String currency)
        throws FileNotFoundException_Exception
    ;

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://UserWS/", className = "userws.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://UserWS/", className = "userws.HelloResponse")
    @Action(input = "http://UserWS/UserWS/helloRequest", output = "http://UserWS/UserWS/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param noOfShares
     * @param companySymbol
     * @param companyName
     * @param userName
     * @return
     *     returns java.lang.String
     * @throws FileNotFoundException_Exception
     */
    @WebMethod(operationName = "BuyUserShare")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "BuyUserShare", targetNamespace = "http://UserWS/", className = "userws.BuyUserShare")
    @ResponseWrapper(localName = "BuyUserShareResponse", targetNamespace = "http://UserWS/", className = "userws.BuyUserShareResponse")
    @Action(input = "http://UserWS/UserWS/BuyUserShareRequest", output = "http://UserWS/UserWS/BuyUserShareResponse", fault = {
        @FaultAction(className = FileNotFoundException_Exception.class, value = "http://UserWS/UserWS/BuyUserShare/Fault/FileNotFoundException")
    })
    public String buyUserShare(
        @WebParam(name = "userName", targetNamespace = "")
        String userName,
        @WebParam(name = "companySymbol", targetNamespace = "")
        String companySymbol,
        @WebParam(name = "companyName", targetNamespace = "")
        String companyName,
        @WebParam(name = "noOfShares", targetNamespace = "")
        int noOfShares)
        throws FileNotFoundException_Exception
    ;

    /**
     * 
     * @param userName
     * @return
     *     returns java.util.List<org.netbeans.xml.schema.userxmlschema.CompanyType>
     */
    @WebMethod(operationName = "ListUserShares")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListUserShares", targetNamespace = "http://UserWS/", className = "userws.ListUserShares")
    @ResponseWrapper(localName = "ListUserSharesResponse", targetNamespace = "http://UserWS/", className = "userws.ListUserSharesResponse")
    @Action(input = "http://UserWS/UserWS/ListUserSharesRequest", output = "http://UserWS/UserWS/ListUserSharesResponse")
    public List<CompanyType> listUserShares(
        @WebParam(name = "userName", targetNamespace = "")
        String userName);

    /**
     * 
     * @param noOfShares
     * @param companySymbol
     * @param companyName
     * @param userName
     * @return
     *     returns java.util.List<org.netbeans.xml.schema.userxmlschema.CompanyType>
     * @throws FileNotFoundException_Exception
     */
    @WebMethod(operationName = "SellUserShare")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SellUserShare", targetNamespace = "http://UserWS/", className = "userws.SellUserShare")
    @ResponseWrapper(localName = "SellUserShareResponse", targetNamespace = "http://UserWS/", className = "userws.SellUserShareResponse")
    @Action(input = "http://UserWS/UserWS/SellUserShareRequest", output = "http://UserWS/UserWS/SellUserShareResponse", fault = {
        @FaultAction(className = FileNotFoundException_Exception.class, value = "http://UserWS/UserWS/SellUserShare/Fault/FileNotFoundException")
    })
    public List<CompanyType> sellUserShare(
        @WebParam(name = "userName", targetNamespace = "")
        String userName,
        @WebParam(name = "companyName", targetNamespace = "")
        String companyName,
        @WebParam(name = "companySymbol", targetNamespace = "")
        String companySymbol,
        @WebParam(name = "noOfShares", targetNamespace = "")
        int noOfShares)
        throws FileNotFoundException_Exception
    ;

}
