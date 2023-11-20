package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObject {
    private WebDriver driver;
    private By orderButtonUpOnMainPage = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']"); //локатор кнопки заказать в верхней части лавной страницы страницы
    private By orderButtonDownOnMainPage = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[@class='Button_Button__ra12g Button_UltraBig__UU3Lp']']"); //локатор кнопки заказать в нижней части лавной страницы страницы

    public void MainPageObject(WebDriver driver){
        this.driver = driver;
    }
    public void clickorderButtonUpOnMainPage() {
        driver.findElement(orderButtonUpOnMainPage).click();//метод клика кнопки Заказать в верхней части лавной страницы страницы
    }
    public void clickorderButtonDownOnMainPage() {
        driver.findElement(orderButtonDownOnMainPage).click();//метод клика кнопки Заказать в верхней части лавной страницы страницы
    }
}
