package amazon;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class AmazonHomePage extends AmazonBasePage{

    public AmazonHomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

        // Home Page ile ilgili diger elementleri locate edebilirsiniz

}

