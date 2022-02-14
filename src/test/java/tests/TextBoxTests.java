package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class TextBoxTests {
    @BeforeAll
    static void BeforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1366x768";
    }
    @Test
    void successFillTest() {
        open("/text-box");
        $(".main-header").shouldHave(text("Text Box"));

        $("#userName").setValue("Nikita");
        $("#userEmail").setValue("Nikkitox@ya.ru");
        $("#currentAddress").setValue("Ufa");
        $("#permanentAddress").setValue("Dagestanskaya");
        $("#submit").scrollTo().click();


        $("#output").shouldHave(text("Nikita"), text("Nikkitox@ya.ru"),
                text("Ufa"), text("Dagestanskaya"));
        $("#name").shouldHave(text("Nikita"));
        $("#currentAddress").setValue("Ufa");
    }

}
