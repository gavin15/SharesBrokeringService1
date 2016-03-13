
package userws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the userws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuyUserShare_QNAME = new QName("http://UserWS/", "BuyUserShare");
    private final static QName _BuyUserShareResponse_QNAME = new QName("http://UserWS/", "BuyUserShareResponse");
    private final static QName _CreateUser_QNAME = new QName("http://UserWS/", "CreateUser");
    private final static QName _CreateUserResponse_QNAME = new QName("http://UserWS/", "CreateUserResponse");
    private final static QName _FileNotFoundException_QNAME = new QName("http://UserWS/", "FileNotFoundException");
    private final static QName _ListUserShares_QNAME = new QName("http://UserWS/", "ListUserShares");
    private final static QName _ListUserSharesResponse_QNAME = new QName("http://UserWS/", "ListUserSharesResponse");
    private final static QName _SellUserShare_QNAME = new QName("http://UserWS/", "SellUserShare");
    private final static QName _SellUserShareResponse_QNAME = new QName("http://UserWS/", "SellUserShareResponse");
    private final static QName _Hello_QNAME = new QName("http://UserWS/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://UserWS/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: userws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuyUserShare }
     * 
     */
    public BuyUserShare createBuyUserShare() {
        return new BuyUserShare();
    }

    /**
     * Create an instance of {@link BuyUserShareResponse }
     * 
     */
    public BuyUserShareResponse createBuyUserShareResponse() {
        return new BuyUserShareResponse();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link FileNotFoundException }
     * 
     */
    public FileNotFoundException createFileNotFoundException() {
        return new FileNotFoundException();
    }

    /**
     * Create an instance of {@link ListUserShares }
     * 
     */
    public ListUserShares createListUserShares() {
        return new ListUserShares();
    }

    /**
     * Create an instance of {@link ListUserSharesResponse }
     * 
     */
    public ListUserSharesResponse createListUserSharesResponse() {
        return new ListUserSharesResponse();
    }

    /**
     * Create an instance of {@link SellUserShare }
     * 
     */
    public SellUserShare createSellUserShare() {
        return new SellUserShare();
    }

    /**
     * Create an instance of {@link SellUserShareResponse }
     * 
     */
    public SellUserShareResponse createSellUserShareResponse() {
        return new SellUserShareResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuyUserShare }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserWS/", name = "BuyUserShare")
    public JAXBElement<BuyUserShare> createBuyUserShare(BuyUserShare value) {
        return new JAXBElement<BuyUserShare>(_BuyUserShare_QNAME, BuyUserShare.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuyUserShareResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserWS/", name = "BuyUserShareResponse")
    public JAXBElement<BuyUserShareResponse> createBuyUserShareResponse(BuyUserShareResponse value) {
        return new JAXBElement<BuyUserShareResponse>(_BuyUserShareResponse_QNAME, BuyUserShareResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserWS/", name = "CreateUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserWS/", name = "CreateUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserWS/", name = "FileNotFoundException")
    public JAXBElement<FileNotFoundException> createFileNotFoundException(FileNotFoundException value) {
        return new JAXBElement<FileNotFoundException>(_FileNotFoundException_QNAME, FileNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUserShares }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserWS/", name = "ListUserShares")
    public JAXBElement<ListUserShares> createListUserShares(ListUserShares value) {
        return new JAXBElement<ListUserShares>(_ListUserShares_QNAME, ListUserShares.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUserSharesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserWS/", name = "ListUserSharesResponse")
    public JAXBElement<ListUserSharesResponse> createListUserSharesResponse(ListUserSharesResponse value) {
        return new JAXBElement<ListUserSharesResponse>(_ListUserSharesResponse_QNAME, ListUserSharesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellUserShare }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserWS/", name = "SellUserShare")
    public JAXBElement<SellUserShare> createSellUserShare(SellUserShare value) {
        return new JAXBElement<SellUserShare>(_SellUserShare_QNAME, SellUserShare.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellUserShareResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserWS/", name = "SellUserShareResponse")
    public JAXBElement<SellUserShareResponse> createSellUserShareResponse(SellUserShareResponse value) {
        return new JAXBElement<SellUserShareResponse>(_SellUserShareResponse_QNAME, SellUserShareResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserWS/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserWS/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
