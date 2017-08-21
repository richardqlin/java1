import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testng {
@Test
public void checkbox() throws Exception
{
FirefoxDriver fd= new FirefoxDriver();
fd.manage().window().maximize();
fd.get(“http://www.flipkart.com/laptops/lenovo~brand/pr?sid=6bo,b5g&otracker=hp_nmenu_sub_electronics_0_Lenovo&#8221;);
Thread.sleep(10000);
List checkBoxes = fd.findElements(By.xpath(“//input[@type=’Checkbox’]”));
System.out.println(checkBoxes.size());
for(int i=0; i<checkBoxes.size(); i++){
System.out.println(checkBoxes.get(i).getText());
checkBoxes.get(i).click();
}
fd.close();
}
}

