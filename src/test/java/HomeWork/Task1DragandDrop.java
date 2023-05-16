package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utils.Driver;

public class Task1DragandDrop {
    /* Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
     Fill in capitals by country.*/
   private WebDriver driver;
   @FindBy(xpath = "//div[@id='box1']")
    WebElement norway;
    @FindBy(xpath = "//div[@id='box2']")
    WebElement sweden;
    @FindBy(xpath = "//div[@id='box3']")
    WebElement denmark;
    @FindBy(xpath = "//div[@id='box4']")
    WebElement finland;
    @FindBy(xpath = "//div[@id='box101']")
    WebElement oslo;
    @FindBy(xpath = "//div[@id='box102']")
    WebElement stockholm;
    @FindBy(xpath = "//div[@id='box103']")
    WebElement copenhagen;
    @FindBy(xpath = "//div[@id='box104']")
    WebElement helsinki ;
   public Task1DragandDrop() {
     PageFactory.initElements(Driver.getDriver(), this);

   }
   public void dragNorwayToOslo() {
       Actions action = new Actions(Driver.getDriver());
        action.dragAndDrop(norway,oslo).build().perform();
   }
   public void dragSwedenToStockholm() {
       Actions action = new Actions(Driver.getDriver());
        action.dragAndDrop(sweden,stockholm).build().perform();
   }
   public void dragDenmarkToCopenhagen() {
       Actions action = new Actions(Driver.getDriver());
        action.dragAndDrop(denmark,copenhagen).build().perform();
   }
   public void dragFinlandToHelsinki() {
       Actions action = new Actions(Driver.getDriver());
        action.dragAndDrop(finland,helsinki).build().perform();
   }













}







