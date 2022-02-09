package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class TestFormTest {
    @BeforeAll
    static void BeforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void successFillTest() {
        open("/automation-practice-form");
        $(".main-header").shouldHave(text("Practice Form"));
        $("#firstName").setValue("Testing First Name");
        $("#lastName").setValue("Testing Last Name");
        $("#userEmail").setValue("Testmail@test.com");
        $(byText("Male")).click();
        $("#userNumber").setValue("+35554556589");
        $("#dateOfBirthInput").click();
        $("#react-datepicker__month-select").selectOption("March");
        $("#react-datepicker__year-select").selectOption("1994");
        $(byText("2")).click();


    }
}
