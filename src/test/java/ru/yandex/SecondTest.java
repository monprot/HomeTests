package ru.yandex;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.UnitBase;

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
        in.clickMailText();
        in.setMailText("текст письма");//Ввод текста письма
        in.clickSendMail();//кнопка отправить письмо

    }
}
