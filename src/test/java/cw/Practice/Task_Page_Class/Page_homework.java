package cw.Practice.Task_Page_Class;

import cw.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_homework {


    public Page_homework(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "box1")
    public WebElement oslo;
    @FindBy(id = "box2")
    public WebElement stockholm;
    @FindBy(id = "box3")
    public WebElement washington;
    @FindBy(id = "box4")
    public WebElement copenhagen;
    @FindBy(id = "box5")
    public WebElement soeul;
    @FindBy(id = "box6")
    public WebElement roma;
    @FindBy(id = "box7")
    public WebElement madrid;


    @FindBy(id = "box101")
    public WebElement norway;

    @FindBy(id = "box102")
    public WebElement sweden;

    @FindBy(id = "box103")
    public WebElement unitedState;
    @FindBy(id = "box104")
    public WebElement denmark;
    @FindBy(id = "box105")
    public WebElement southKorea;

    @FindBy(id = "box106")
    public WebElement italy;
    @FindBy(id = "box107")
    public WebElement spain;




}
