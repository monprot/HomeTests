package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selBase.Base;

public class UnitBase extends Base {

    public UnitBase(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//input[@id='text']")
    private WebElement setSearchText; //поле текста поиска яндекса

    @FindBy(xpath = ".//div[@class='search2__button']/button")
    private WebElement submitSearch; //кнопка поиска яндекса

    @FindBy(xpath = ".//div[@class='serp-header__logo']/a")
    private WebElement homeLogo; //логотип яндекса

    @FindBy(xpath = "(.//b[contains(text(), 'github.com')])[1]//..")
    private WebElement aGitHub; //ссылка на гитхаб из первого результата

    @FindBy(xpath = ".//input[@placeholder='Search GitHub']")
    private WebElement setSearchTextGit; //поле текста поиска гитхаба

    @FindBy(xpath = ".//span[@data-search-type='Users']/..")
    private WebElement searchUserGit; //категория поиска юзеры

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


    /**
     * Для яндекс почты
     */
    @FindBy(xpath = "//*[@id='passp-field-login']")
    private WebElement yandLogin; //поле вводы логина

    @FindBy(xpath = "//*[@id='passp-field-passwd']")
    private WebElement yanPassword;//поле ввода пароля

    @FindBy(xpath = ".//a[@class = 'button2 button2_size_mail-big button2_theme_mail-white button2_type_link HeadBanner-Button HeadBanner-Button-Enter with-shadow']")
    private WebElement inbutton;//кнопка входа в аторизацию майл яндекс

    @FindBy(xpath = ".//a[@class='mail-ComposeButton js-main-action-compose']")
    private WebElement writemail;//кнопка написать письмо

    @FindBy(xpath = ".//span[@data-name='Себе']")
    private WebElement selfpsot;//кнопка выбора получателя себе

    @FindBy(xpath = "(.//input[@type='text'])[3]")
    private WebElement mailTheme;//поле ввода темы письма

    @FindBy(xpath = ".//div[@class='cke_wysiwyg_div cke_reset cke_enable_context_menu cke_editable cke_editable_themed cke_contents_ltr']")
    private WebElement mailText;//поле ввода текста письма

    @FindBy(xpath = "(.//button[@data-nb='button'])[2]")
    private WebElement mailSend;//кнопка отправить письмо

    @FindBy(xpath = ".//a[text()='Перейти во «Входящие».']")
    private WebElement inputsMail;//кнопка входящие

    @FindBy(xpath = ".//span[@class='mail-ComposeButton-Refresh js-main-action-refresh ns-action']")
    private WebElement refreshMail;//кнопка обновить

    @FindBy(xpath = "(.//span[@title='Тестируем почту'])[1]")
    private WebElement findMail;//текст темы в списке сообщений

    @FindBy(xpath = "(.//span[@title='текст письма'])[2]")
    private WebElement findMail2;//текст сообщения письма в списке сообщений

    @FindBy(xpath = "(.//button[@data-lego='react'])[2]")
    private WebElement settingsButton;//кнопка настроек

    @FindBy(xpath = "(.//span[text()='Личные данные, подпись, портрет'])[2]")
    private WebElement lkSetButton;//кнопка настроек личных данных

    @FindBy(xpath = ".//div[@class='cke_wysiwyg_div cke_reset cke_enable_context_menu cke_editable cke_editable_themed cke_contents_ltr']")
    private WebElement podText; //поле ввода текста подписи

    @FindBy(xpath = ".//span[@class='ui-button-text']")
    private WebElement setPodBut; //кнопка "Добавить подпись"

    @FindBy(xpath = "(.//span[@title='Тестируем почту2'])[1]")
    private WebElement findMail3; //текст темы в списке сообщений

    @FindBy(xpath = "(.//span[@title='текст письма2'])[2]")
    private WebElement findMail4; //текст сообщения письма в списке сообщений

    @FindBy(xpath = ".//a[@class='yandex-header__logo-service yandex-header__logo-service_lang_ru count-me']")
    protected WebElement logo;//логотип яндекс почты

    @FindBy(xpath = "((.//span[@title='Тестируем почту'])[1]/../../../../../../..//div)[5]/label/span[1]")
    protected WebElement checkMail1;//чекбокс сообщения с первой темой

    @FindBy(xpath = "((.//span[@title='Тестируем почту2'])[1]/../../../../../../..//div)[5]/label/span[1]")
    protected WebElement checkMail2;//чекбокс сообщения со второй темой

    @FindBy(xpath = ".//span[text()='Удалить']")
    protected WebElement deleteMails;//кнопка удалить сообщения


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

    /**
     * кликаем на группу сообщений в списке сообщений
     */
    public void clickFindMail() { click(findMail); }

    /**
     * кликаем на сообщение в группе сообщений в списке сообщений
     */
    public void clickFindMail2() { click(findMail2); }

    /**
     * кликаем на кнопку настроек
     */
    public void clickSettingButton() { click(settingsButton); }

    /**
     * кликаем на настройку личных данных
     */
    public  void clickLkSetButton() { click(lkSetButton); }

    /**
     * Клик в поле воода подписи
     */
    public void clickPodpText() { click(podText); }

    /**
     * Ввод подписи
     * @param text
     */
    public void setPodpText(String text) {
        setText(podText, text) ;
    }

    /**
     * кликаем кнопку добавления подписи
     */
    public void clickSetPodButton() { click(setPodBut); }

    /**
     * кликаем по группе сообщений с нужной темой
     */
    public void clickFindMail3() { click(findMail3); }

    /**
     * кликаем на сообщений в группе сообщений
     */
    public void clickFindMail4() { click(findMail4); }

    /**
     * кликаем на логотип яндекс почты
     */
    public void clickLogo() { click(logo); }

    /**
     * кликаем на чекбокс с темой 1
     */
    public void clickCheckMail1() { click(checkMail1); }

    /**
     * кликаем на чекбокс с темой 2
     */
    public void clickCheckMail2() { click(checkMail2); }

    /**
     * кликаем кнопку удаления писем
     */
    public void clickDeleteMails() { click(deleteMails); }
}
