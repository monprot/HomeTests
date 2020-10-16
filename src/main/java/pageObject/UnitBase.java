package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selBase.Base;

public class UnitBase extends Base {

    public UnitBase(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//input[@id='text']")//поле текста поиска яндекса
    private WebElement setSearchText;

    @FindBy(xpath = ".//div[@class='search2__button']/button")//кнопка поиска яндекса
    private WebElement submitSearch;

    @FindBy(xpath = ".//div[@class='serp-header__logo']/a")//логотип яндекса
    private WebElement homeLogo;

    @FindBy(xpath = "(.//b[contains(text(), 'github.com')])[1]//..")//сылка на гитхаб из первого результата
    private WebElement aGitHub;

    @FindBy(xpath = ".//input[@placeholder='Search GitHub']")//поле текста поиска гитхаба
    private WebElement setSearchTextGit;

    @FindBy(xpath = ".//span[@data-search-type='Users']/..")
    private WebElement searchUserGit;
    /**
     * Вводим текст в поисковую строку.
     *
     * @param text
     */
    public void setSearchText(String text) {
        setText(setSearchText, text);
    }

    /**
     * Кликаем по кнопке Поиск в гугле.
     */
    public void clickSubmitSearch(){
        click(submitSearch);
    }

    public void clickHomeLogo() {
        click(homeLogo);
    }

    public void clickGitHub() { click(aGitHub); }

    public void setSearchGitHub(String texta) { setText(setSearchTextGit, texta); }

    public void clickSearchUserGit() { click(searchUserGit);}



}
