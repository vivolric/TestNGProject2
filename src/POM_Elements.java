import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Elements {
    public POM_Elements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy (linkText = "Sign in")
    public WebElement signIn;

    @FindBy (id = "email")
    public WebElement email;

    @FindBy (id = "passwd")
    public WebElement password;

    @FindBy (id = "SubmitLogin")
    public WebElement signInButton;

    @FindBy (css = "a[title='Addresses']")
    public WebElement myAddressesButton;

    @FindBy (css = "a[title='Add an address']")
    public WebElement addNewAddressButton;

    @FindBy (id = "firstname")
    public WebElement firstName;

    @FindBy (id = "lastname")
    public WebElement lastName;

    @FindBy (id = "address1")
    public WebElement address;

    @FindBy (id = "city")
    public WebElement city;

    @FindBy (id = "id_state")
    public WebElement randomState;

    @FindBy (id = "postcode")
    public WebElement zipCode;

    @FindBy (id = "phone")
    public WebElement homePhone;

    @FindBy (id = "submitAddress")
    public WebElement saveButton;

    @FindBy (css = "a[title='Update']")
    public WebElement updateButton;

    @FindBy (css = "a[title='Delete']")
    public WebElement deleteButton;

    @FindBy (css = "p[class='alert alert-warning']")
    public WebElement noAddressMsg;

    @FindBy (linkText = "DRESSES")
    public WebElement dresses;

    @FindBy (css = "p[class='buttons_bottom_block no-print']>a[id='wishlist_button']")
    public WebElement addToWishList;

    @FindBy (css = "a[title='Close']")
    public WebElement close;

    @FindBy (css = "a[title='View my customer account']")
    public WebElement userName;

    @FindBy (css = "a[title='My wishlists']")
    public WebElement wishList;

    @FindBy (linkText = "My wishlist")
    public WebElement myWishList;

    @FindBy (css = "p[class='product-name']")
    public WebElement verifyDress;

    @FindBy (className = "icon-remove-sign")
    public WebElement removeX;

    @FindBy (css = "p[class='alert alert-warning']")
    public WebElement noProducts;

    @FindBy (css = "i[class='icon-remove']")
    public  WebElement delete;




}