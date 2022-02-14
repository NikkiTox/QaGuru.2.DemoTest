package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPages {
    // locators
    SelenideElement firstNameInput = $("#firstName");
    SelenideElement lastNameInput = $("#lastName");


    //actions

    //setValue("Testing First Name")
    public void setFirstName (String firstName) {
        firstNameInput.setValue(firstName);
    }
    public void SetLastName (String lastName) {
        lastNameInput.setValue(lastName);
    }

}