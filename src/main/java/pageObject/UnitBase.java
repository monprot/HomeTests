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

    @FindBy(xpath = ".//a[text()='Перейти во «Входящие».']")//кнопка входящие
    private WebElement inputsMail;

    @FindBy(xpath = ".//span[@class='mail-ComposeButton-Refresh js-main-action-refresh ns-action']")//кнопка обновить
    private WebElement refreshMail;

    @FindBy(xpath = "(.//span[@title='Тестируем почту'])[1]")
    private WebElement findMail;

    @FindBy(xpath = "(.//span[@title='текст письма'])[2]")
    private WebElement findMail2;

    @FindBy(xpath = "(.//button[@data-lego='react'])[2]")
    private WebElement settingsButton;

    @FindBy(xpath = "(.//span[text()='Личные данные, подпись, портрет'])[2]")
    private WebElement lkSetButton;

    @FindBy(xpath = ".//div[@class='cke_wysiwyg_div cke_reset cke_enable_context_menu cke_editable cke_editable_themed cke_contents_ltr']")
    private WebElement podText;

    @FindBy(xpath = "(.//span[text()='Добавить подпись'])[2]")
    private WebElement setPodBut;

    @FindBy(xpath = "(.//span[@title='Тестируем почту2'])[1]")
    private WebElement findMail3;

    @FindBy(xpath = "(.//span[@title='текст письма2'])[2]")
    private WebElement findMail4;

    @FindBy(xpath = ".//a[@class='yandex-header__logo-service yandex-header__logo-service_lang_ru count-me']")
    protected WebElement logo;

    //.//div[@class='mail-Message-Toolbar-Subject mail-Message-Toolbar-Subject_message js-toolbar-subject js-subject-content js-invalid-drag-target']
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

    /**
     * Кликаем на поле ввода текста(просто так надо)
     */
    public void clickMailText() { click(mailText); }
    /**
     * кнопка отправки письма
     */
    public void clickSendMail() { click(mailSend); }

    /**
     * Кликаем на входящие письма
     */
    public void clickInputsMail() { click(inputsMail); }

    /**
     * Кликаем кнопку оновить
     */
    public void clickRefresh() { click(refreshMail); }

    public void clickFindMail() { click(findMail); }

    public void clickFindMail2() { click(findMail2); }

    public void clickSettingButton() { click(settingsButton); }

    public  void clickLkSetButton() { click(lkSetButton); }

    public void clickPodpText() { click(podText); }

    public void setPodpText(String text) {
        setText(podText, text) ;
    }

    public void clickSetPodButton() { click(setPodBut); }

    public void clickFindMail3() { click(findMail3); }

    public void clickFindMail4() { click(findMail4); }

    public void clickLogo() { click(logo); }
}
