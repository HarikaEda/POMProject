package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utils.Driver;

import java.util.List;
/*Page Object sınıfı, kullanıcı adı ve şifre alanlarına erişmek için özelliklere ve
 bu alanlara değer atamak ve tıklama işlemleri gerçekleştirmek için metotlara sahip olabilir.
POM, birçok farklı test çerçevesi ve Selenium WebDriver gibi test araçlarıyla birlikte kullanılabilir.
POM, test kodunun daha sürdürülebilir, yeniden kullanılabilir ve anlaşılır hale gelmesini sağlar.
 Bu da yazılım testi otomasyonunun daha verimli bir şekilde yönetilmesini sağlar.

 */
public class SauceDemoInventory {
/*Sauce DemoInventory uygulaması, genellikle Selenium WebDriver ve TestNG veya JUnit gibi
test çerçeveleri ile birlikte kullanılır.
Bu uygulama, testlerin çalışma zamanında farklı senaryoların test edilmesini sağlamak için birkaç özellik içerir.
Bu özellikler arasında kullanıcı girişi, ürün arama, ürün sepeti yönetimi ve ödeme işlemleri gibi özellikler yer alabilir.
 */
    public SauceDemoInventory(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(tagName = "select")
    WebElement sortBy;

    @FindBy(className = "inventory_item_price")
    List<WebElement> products;

    public void sortBy(String filter){
        Select select = new Select(sortBy);
        select.selectByVisibleText(filter);
    }

    public void validateProductsAreSorted(){
//        yontem 1: For

        for (int i = 0; i< products.size()-1; i++) {

            WebElement currentProduct = products.get(i);
            WebElement nextProduct = products.get(i+1);

            double currentPrice = Double.parseDouble(currentProduct.getText().substring(1)); // 4.99
            double nextPrice = Double.parseDouble(nextProduct.getText().substring(1)); //  7.99

            Assert.assertTrue(currentPrice<=nextPrice, "Products are not sorted");

        }

    }

}




