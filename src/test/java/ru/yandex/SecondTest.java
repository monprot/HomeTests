package ru.yandex;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.UnitBase;

import java.util.concurrent.TimeUnit;

public class SecondTest extends TestSettings2 {
    @Epic("Селениум")
    @Feature("Тест почты")
    @Story("Отправка писем")
    @Test
    void MailTest(){
        UnitBase in = new UnitBase(getDriver());

        in.clickInButton(); //кликаем на кнопку войти в почту
        in.setLoginYand("testimmailauto" + "\n"); //вводим логин
        in.setPasswordYand("1029384756" + "\n"); //вводим пароль

        in.clickWriteMail(); //кликаем на кнопку "написать письмо"

        String mailurl = getDriver().getCurrentUrl(); //считываем текущий адрес страницы
        Assert.assertEquals(mailurl,"https://mail.yandex.ru/?uid=1198887252#compose" ); //проверка соответствия адреса страницы

        in.clickSelfPost();//выбор получателя письма "себе"
        in.setMailTheme("Тестируем почту");//Ввод темы письма
        in.clickMailText();//нажать в поле ввода текста письма
        in.setMailText("текст письма");//Ввод текст письма
        in.clickSendMail();//нажать на кнопку отправить письмо

        in.clickInputsMail();//нажать на кнопку входящие
        in.clickRefresh();//нажать на кнопку обновить
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Boolean isPresent = driver.findElements(By.xpath(".//span[@title='Тестируем почту']")).size() > 0;
        Assert.assertTrue(isPresent);
        System.out.println("1");

        in.clickFindMail();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        in.clickFindMail2();

        Boolean isTheme = driver.findElements(By.xpath(".//div[text()='Тестируем почту']")).size() > 0;
        Assert.assertTrue(isTheme);
        System.out.println("2");
        Boolean isText = driver.findElements(By.xpath(".//div[text()='текст письма']")).size() > 0;
        Assert.assertTrue(isText);
        System.out.println("3");
    }
}
