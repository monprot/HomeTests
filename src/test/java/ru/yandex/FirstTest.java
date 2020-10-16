package ru.yandex;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.UnitBase;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class FirstTest extends TestSettings {
    @Epic("Селениум")
    @Feature("Гугле тетс")
    @Story("Проверяем картинки")
    @Test
    public void firstTest() {
        getDriver().get("https://www.yandex.ru/");//открываем яндекс
        getDriver().manage().window().maximize();//размер окна на максимум
        UnitBase in = new UnitBase(getDriver()); //создаем объект класса UnitBase


        in.setSearchText("GitHub");//вводим текст в поле поиска
        in.clickSubmitSearch();//нажимаем кнопку поиска
        in.clickGitHub();//нажимаем ссылку на гитхаб

        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());//создаем массив с вкладками

        getDriver().switchTo().window(newTab.get(1));// меняем фокус на вторую вкдадку

        in.setSearchGitHub("kolik929"+ "\n");//вводим в поиск и жмем ENTER
        in.clickSearchUserGit();//в результатах поиска выбираем пользователей
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//ожидание загрузки
        getDriver().findElement(By.xpath(".//a[@class='text-gray' and @href='/kolik929']")).click();//Кликаем по нужному результату
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//ожидание загрузки
        getDriver().findElement(By.xpath("(.//a[@href='/kolik929/TestLesson'])[1]")).click();//переходим в нужный репозиторий

        String title = getDriver().getTitle();//получаем значение заголовка вкладки
        Assert.assertEquals(title,"GitHub - kolik929/TestLesson" );//по заголовку проверяем в верном ли мы месте

//        getDriver().switchTo().window(newTab.get(0));//обратно на первую страницу
//        in.clickHomeLogo();//кликаем на лого
//        String title2 = getDriver().getTitle();//получаем значение заголовка вкладки
//        Assert.assertEquals(title2,"Яндекс" );


    }
}
