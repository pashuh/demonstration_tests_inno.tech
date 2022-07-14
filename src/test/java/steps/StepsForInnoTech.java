package steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class StepsForInnoTech {

    @Step("Открываем страницу ИнноТех")
    public void openPage() {
        open("https://inno.tech/ru/");
    }

    @Step("Перейти на открывшуюся вкладку в браузере")
    public void goswitchTo(int number) {
        switchTo().window(number);
    }

    @Step("Открыть вкладку продукты")
    public void openProduct() {
        $(".header__cont").$("[href='/ru/product/']").click();
    }

    @Step("Проверить наличие продукта  'Интернет-банк'")
    public void checkProduct(String product) {
        $(".product-section__right.product-list").find("[data-block-num='2']").shouldHave(Condition.text(product));
    }

    @Step("Открыть контакты Компании")
    public void openContacts() {
        $(".header__cont").$(byText("О компании")).hover();
        $(".h-submenu--mini").$("[href='/ru/company/contacts/']").click();
    }

    @Step("Проверить адрес компании")
    public void checkAddress() {
        $(".c-info__address-text").shouldHave(Condition.text("Территория инновационного центра «Сколково», ул. Луговая, д. 4, корп. 5, пом. 19"));
    }

    @Step("Открыть вкладку продукты")
    public void openCareer() {
        $(".header__cont").$("[href='https://inno.tech/career']").click();
    }

    @Step("Кликнуть Стать частью команды")
    public void clickCommandsCareer() {
        $("[href='/vacancies']").click();
    }

    @Step("Ввести вакансию")
    public void setVacancies(String vacancies) {
        $("[placeholder='Вакансия']").setValue(vacancies);
    }

    @Step("Выбрать г.Москва")
    public void setCityMoscow() {
        $(By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[1]/div")).click();
        $(By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[2]/div/ul/li[2]")).click();
    }

    @Step("Выбрать направление 'Тестирование'")
    public void setTesting() {
        $(By.xpath("/html/body/div/div[2]/div[1]/div[3]")).click();
        $(By.xpath("/html/body/div/div[2]/div[1]/div[3]/div[2]/div/ul/li[3]")).click();
    }

    @Step("Выбрать опыт 'От 1 года до 3 лет'")
    public void setExperience() {
        $(By.xpath("/html/body/div/div[2]/div[1]/div[4]/div[1]")).click();
        $(By.xpath("/html/body/div/div[2]/div[1]/div[4]/div[2]/div/ul/li[4]")).click();
    }

    @Step("Кликнуть 'Связаться с нами''")
    public void clickSendQuestion() {
        $(".header-btns").click();
    }

    @Step("Вводим личные данные")
    public void setPersonalData(String firstName, String lastName, String email, String phone,
                                String company, String country, String comment) {
        $("#formStartPopup").$("#nameP").setValue(firstName);
        $("#formStartPopup").$("#surnameP").setValue(lastName);
        $("#formStartPopup").$("#emailP").setValue(email);
        $("#formStartPopup").$("#phoneP").setValue(phone);
        $("#formStartPopup").$("#companyP").setValue(company);
        $("#formStartPopup").$("#countryP").setValue(country);
        $("#formStartPopup").$("#commentP").setValue(comment);
    }

    @Step("Выбрать вопрос")
    public void chooseQuestion(String questtion) {
        $(".popup__form.form").$(".ss-disabled").click();
        switch (questtion) {
            case "Продукты":
                $("div.ss-content.ss-open div.ss-list div:nth-child(2)").click();
                break;
            case "PR":
                $("div.ss-content.ss-open div.ss-list div:nth-child(3)").click();
                break;
            case "Взаимодействие с аналитиками":
                $("div.ss-content.ss-open div.ss-list div:nth-child(4)").click();
                break;
            case "Карьера":
                $("div.ss-content.ss-open div.ss-list div:nth-child(5)").click();
                break;
            case "Исследования и образование":
                $("div.ss-content.ss-open div.ss-list div:nth-child(5)").click();
                break;
            case "Другое":
                $("div.ss-content.ss-open div.ss-list div:nth-child(6)").click();
                break;
        }
    }

    @Step("Проставить согласие на обработку персональных данных")
    public void clickCheckbox() {
        $("#formStartPopup").$("[for='confirmP']").click();
    }

    @Step("Проверить что персональные данные введены")
    public void checkResultsQuestion() {
        $("#formStartPopup").shouldHave(Condition.text("Вопрос"), Condition.text("Имя"),
                Condition.text("Фамилия"), Condition.text("Рабочий email"), Condition.text("Номер телефона"),
                Condition.text("Компания"), Condition.text("Страна")).shouldHave(Condition.visible);
    }

    @Step("Кликнуть отправить")
    public void clickSend() {
        $("#formStartPopup").$("[type='submit']").click();
    }

    @Step("Проверяем наличие ошибки")
    public void checkError() {
        assert $("#formStartPopup").$$(".default-input--error").size() == 6;
    }
}
