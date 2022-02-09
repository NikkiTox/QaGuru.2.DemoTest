package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

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
        // Разобраться с указанием даты рождения
        /*$("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionByValue("March");
        $(".react-datepicker__month-select").scrollTo();
        $(".react-datepicker__year-select").selectOptionContainingText или selectOptionByValue ("1994");
        $(".react-datepicker__day react-datepicker__day--005").click();
        */
        $("#subjectsInput").setValue("Music & AQA");
        $(byText("Music")).click();
        $("#uploadPicture").click();
        File file = new File("G:/AQA/DEMOQA3/src/test/java/tests/bassguitar.jpg");
        $("#file").uploadFile(file);
        $("#file").click();
    }
}
