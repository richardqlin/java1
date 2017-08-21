class Selenium1{

@Test
public void checkBoxAll() {

    List<WebElement> checkBoxList=driver.findElements(By.cssSelector("input [type='checkbox']"));
    for(WebElement checkBox:checkBoxList)
    {
        checkBox.click();   
    }
    List<WebElement> unCheckedBoxList=driver.findElements(By.cssSelector("input:not(:checked)[type='checkbox']"));
    if(!CollectionUtils.isEmpty(unCheckedBoxList))
        Assert.fail();

}

}

public static void main(String[] a){

	Selenium1 s= new Selenium1();
    

}