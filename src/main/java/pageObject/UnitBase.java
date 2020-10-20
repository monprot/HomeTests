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

    @FindBy(xpath = "(.//b[contains(text(), 'github.com')])[1]//..")//ссылка на гитхаб из первого результата
    private WebElement aGitHub;

    @FindBy(xpath = ".//input[@placeholder='Search GitHub']")//поле текста поиска гитхаба
    private WebElement setSearchTextGit;

    @FindBy(xpath = ".//span[@data-search-type='Users']/..")//категория поиска юзеры
    private WebElement searchUserGit;

    @FindBy(xpath = "//*[@id='passp-field-login']")//поле вводы логина
    private WebElement yandLogin;

    @FindBy(xpath = "//*[@id='passp-field-passwd']")//поле ввода пароля
    private WebElement yanPassword;

    @FindBy(xpath = ".//a[@class = 'button2 button2_size_mail-big button2_theme_mail-white button2_type_link HeadBanner-Button HeadBanner-Button-Enter with-shadow']")//кнопка входа в аторизацию майл яндекс
    private WebElement inbutton;

    @FindBy(xpath = ".//a[@class='mail-ComposeButton js-main-action-compose']")//кнопка написать письмо
    private WebElement writemail;

    @FindBy(xpath = ".//span[@data-name='Себе']")//кнопка выбора получателя себе
    private WebElement selfpsot;

    @FindBy(xpath = "(.//input[@type='text'])[3]")//поле ввода темы письма
    private WebElement mailTheme;

    @FindBy(xpath = ".//div[@class='cke_wysiwyg_div cke_reset cke_enable_context_menu cke_editable cke_editable_themed cke_contents_ltr']")//поле ввода текста письма
    private WebElement mailText;

    @FindBy(xpath = "(.//button[@data-nb='button'])[2]")//кнопка отправить письмо
    private WebElement mailSend;
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

    /**
     * Кликаем по логотипу яндекса
     */
    public void clickHomeLogo() {
        click(homeLogo);
    }

    /**
     * Кликаем на результат поиска с ссылкой на гитхаб
     */
    public void clickGitHub() { click(aGitHub); }

    /**
     * Вводим текст в поисковою строку гитхаба
     * @param texta
     */
    public void setSearchGitHub(String texta) { setText(setSearchTextGit, texta); }

    /**
     * Клик на категорию юзеров в поиске
     */
    public void clickSearchUserGit() { click(searchUserGit);}

    public void clickInButton() { click(inbutton); }
    /**
     * Вводим логин в поле логина
     * @param login
     */
    public void setLoginYand(String login) { setText(yandLogin, login); }

    /**
     * Вводим пароль в поле пароля
     * @param pass
     */
    public void setPasswordYand(String pass) { setText(yanPassword, pass); }

    /**
     * Кликаем на создание нового письма
     */
    public void clickWriteMail() { click(writemail); }

    /**
     * Клик на "себе" при отправке письма
     */
    public void clickSelfPost() { click(selfpsot); }

    /**
     * Ввод темы письма
     * @param theme
     */
    public void setMailTheme(String theme) { setText(mailTheme, theme); }

    /**
     * Ввод текста письма
     * @param text
     */
    public void setMailText(String text) { setText(mailText, text); }

    public void clickMailText() { click(mailText);}
    /**
     * кнопка отправки письма
     */
    public void clickSendMail() { click(mailSend);}

}
