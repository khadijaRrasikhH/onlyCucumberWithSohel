package steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DashBoardPage;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;
import java.util.List;
import java.util.Map;

public class Loginsteps extends CommonMethods {

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        LoginPage LP=new LoginPage();
        sendText(LP.usernamebox,ConfigReader.getPropertyValue("username"));
        sendText(LP.passwordbox, ConfigReader.getPropertyValue("password"));
    }
    @When("user clicks on login Button")
    public void user_clicks_on_login_button() {
        LoginPage LP=new LoginPage();
        click(LP.loginBtn);
    }

    @When("admin user is successfully logged in")
    public void admin_user_is_successfully_logged_in() {
       // String actualR=driver.getTitle();
        //String expected="OragneHRM";
        //Assert.assertEquals("the title both match", actualR,expected);
    }
    @When("user enters valid ess username and password")
    public void user_enters_valid_ess_username_and_password() {
        LoginPage LP=new LoginPage();
        LP.usernamebox.sendKeys("Admin");
        LP.passwordbox.sendKeys("admin123");
    }

    @When("ess user is successfully login")
    public void ess_user_is_successfully_login() {
        DashBoardPage DBP =new DashBoardPage();
        //Assert.assertTrue(DBP.welcomemessage.isDisplayed());
    }

    @When("user enters invalid username and password")
    public void user_enters_invalid_username_and_password() {
        LoginPage LP=new LoginPage();
        LP.usernamebox.sendKeys("johnny1234560");
        LP.passwordbox.sendKeys("Syntax1253!!!!");

    }

    @When("user see invalid credentials text on login page")
    public void user_see_invalid_credentials_text_on_login_page() {

        System.out.println("invalid credentials");
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        LoginPage LP=new LoginPage();
        sendText(LP.usernamebox, username);
        sendText(LP.passwordbox, password);
    }

    @When("{string} is successfully logged in")
    public void is_successfully_logged_in(String firstname) {
        System.out.println("working fine ");
    }
    @When("user enters valid username and invalid password and verify the error")
    public void user_enters_valid_username_and_invalid_password_and_verify_the_error(DataTable errordata) {
        LoginPage loginPage = new LoginPage();
        List<Map<String, String>> employeesNames = errordata.asMaps();
        for (Map<String, String> employeename : employeesNames) {
            String userNameValue = employeename.get("username");
            String passwordValue = employeename.get("password");
            String errorValue = employeename.get("errormessage");
            System.out.println(userNameValue + " " + passwordValue + " " + errorValue);

            LoginPage LP = new LoginPage();
            sendText(LP.usernamebox, userNameValue);
            sendText(LP.passwordbox, passwordValue);
            click(LP.loginBtn);
            String actual = LP.errormessage.getText();
            Assert.assertEquals("Values do not match", errorValue, actual);
            System.out.println("MY test case is passed");
        }
    }
    @When("user enters different {string} and {string} and verify the {string} for all the combinations")
    public void user_enters_different_and_and_verify_the_for_all_the_combinations(String usernamevalue, String passwordvalue, String error) {
        LoginPage LP = new LoginPage();
        sendText(LP.usernamebox, usernamevalue);
        sendText(LP.passwordbox, passwordvalue);
        click(LP.loginBtn);
        String actual = LP.errormessage.getText();
        Assert.assertEquals("Values do not match", error, actual);
    }
}
