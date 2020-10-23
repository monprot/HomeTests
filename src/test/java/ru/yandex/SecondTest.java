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
    void MailTest() throws InterruptedException {
        UnitBase in = new UnitBase(getDriver());

        in.clickInButton(); //кликаем на кнопку войти в почту
        in.setLoginYand("testimmailauto" + "\n"); //вводим логин
        in.setPasswordYand("1029384756" + "\n"); //вводим пароль

        in.clickWriteMail(); //кликаем на кнопку "написать письмо"

        String mailurl = getDriver().getCurrentUrl(); //считываем текущий адрес страницы
        Assert.assertEquals(mailurl,"https://mail.yandex.ru/?uid=1198887252#compose" ); //проверка соответствия адреса страницы

        in.clickSelfPost();//выбор получателя письма "себе"
        in.setMailTheme("Тестируем почту");//Ввод темы письма

        in.setMailText("текст письма");//Ввод текст письма
        in.clickSendMail();//нажать на кнопку отправить письмо

        in.clickInputsMail();//нажать на кнопку входящие
        in.clickRefresh();//нажать на кнопку обновить
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Boolean isPresent = driver.findElements(By.xpath(".//span[@title='Тестируем почту']")).size() > 0;
        Assert.assertTrue(isPresent);

        Thread.sleep(2000);
        in.clickFindMail();
        Thread.sleep(1000);
        in.clickFindMail2();

        Boolean isTheme = driver.findElements(By.xpath(".//div[text()='Тестируем почту']")).size() > 0;
        Assert.assertTrue(isTheme);
        Boolean isText = driver.findElements(By.xpath(".//div[text()='текст письма']")).size() > 0;
        Assert.assertTrue(isText);

        in.clickSettingButton();
        in.clickLkSetButton();
        in.clickPodpText();
        in.setPodpText("Я подпись подпись подпись, я вовсе не медведь");
        in.clickSetPodButton();
        in.clickLogo();
        in.clickWriteMail(); //кликаем на кнопку "написать письмо"

        String mailurl2 = getDriver().getCurrentUrl(); //считываем текущий адрес страницы
        Assert.assertEquals(mailurl2,"https://mail.yandex.ru/?uid=1198887252#compose" ); //проверка соответствия адреса страницы
        Boolean isPodp = driver.findElements(By.xpath(".//div[contains(text(),'Я подпись подпись подпись, я вовсе не медведь')]")).size() > 0;
        Assert.assertTrue(isPodp);

        in.clickSelfPost();//выбор получателя письма "себе"
        in.setMailTheme("Тестируем почту2");//Ввод темы письма

        in.setMailText("текст письма2");//Ввод текст письма
        in.clickSendMail();//нажать на кнопку отправить письмо

        in.clickInputsMail();//нажать на кнопку входящие
        in.clickRefresh();//нажать на кнопку обновить

        Boolean isPresent2 = driver.findElements(By.xpath(".//span[@title='Тестируем почту2']")).size() > 0;
        Assert.assertTrue(isPresent2);

        Thread.sleep(2000);
        in.clickFindMail3();
        Thread.sleep(1000);
        in.clickFindMail4();

        Boolean isTheme2 = driver.findElements(By.xpath(".//div[text()='Тестируем почту2']")).size() > 0;
        Assert.assertTrue(isTheme2);
        Boolean isText2 = driver.findElements(By.xpath(".//div[text()='текст письма2']")).size() > 0;
        Assert.assertTrue(isText2);
        Boolean isPodp2 = driver.findElements(By.xpath(".//div[contains(text(),'Я подпись подпись подпись, я вовсе не медведь')]")).size() > 0;
        Assert.assertTrue(isPodp2);
    }
}
