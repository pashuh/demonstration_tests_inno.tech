package tests;

import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import steps.StepsForInnoTech;

@Owner("pashuh")
@Link(name = "inno.tech", url = "https://inno.tech/ru/")
public class InnoTechTests extends TestBase {
    StepsForInnoTech steps = new StepsForInnoTech();

    String firstName = "Тест";
    String lastName = "Один";
    String email = "test@innotech.ru";
    String phone = "79264409397";
    String company = "ИнноТех";
    String country = "Россия";
    String comment = "Hello!";
    String product = "Интернет-банк";
    String vacancies = "QA";
    String question = "Карьера";

    @Test
    @Tag("Product")
    @DisplayName("Проверка наличия Интернет-банка в продуктах")
    public void checkProductTest() {
        steps.openPage();
        steps.openProduct();
        steps.checkProduct(product);
    }

    @Test
    @Tag("Contacts")
    @DisplayName("Проверяем корректность адреса компании в контактах")
    public void checkAddressTest() {
        steps.openPage();
        steps.openContacts();
        steps.checkAddress();
    }

    @Test
    @Tag("JobSearch")
    @DisplayName("Проверяем наличие вакансий QA, в г. Москва, направление 'Тестирование', опыт 1-3 года")
    public void jobSearchTest() {
        steps.openPage();
        steps.openCareer();
        steps.goswitchTo(1);
        steps.clickCommandsCareer();
        steps.setVacancies(vacancies);
        steps.setCityMoscow();
        steps.setTesting();
        steps.setExperience();
    }

    @Test
    @Tag("Question")
    @DisplayName("Проверяем возможность ввода личных данных в форме 'Связаться с нами'")
    public void sendQuestionTest1() {
        steps.openPage();
        steps.clickSendQuestion();
        steps.chooseQuestion(question);
        steps.setPersonalData(firstName, lastName, email, phone, company, country, comment);
        steps.clickCheckbox();
        steps.checkResultsQuestion();
    }

    @Test
    @Tag("Question")
    @DisplayName("Проверяем наличие ошибки при отправке пустой формы 'Связаться с нами'")
    public void checkErrorEmptyMessage() {
        steps.openPage();
        steps.clickSendQuestion();
        steps.clickSend();
        steps.checkError();
    }
}
