package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashBoardPage;
import pages.EmployeeListPage;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

public class employeeSearchSteps extends CommonMethods {


    @When("user enters with valid username and password")
    public void user_enters_with_valid_username_and_password() {
        LoginPage LP = new LoginPage();
        sendText(LP.usernamebox, ConfigReader.getPropertyValue("username"));
        sendText(LP.passwordbox, ConfigReader.getPropertyValue("password"));
    }
        @When("user click on login Button")
        public void user_click_on_login_button() {
            LoginPage LP = new LoginPage();
           click(LP.loginBtn);

    }
    @When("user navigates to employee list page")
    public void user_navigates_to_employee_list_page() {
        DashBoardPage dash=new DashBoardPage();
        click(dash.pimOPtion);
        click(dash.employeeListOption);
    }
    @When("user enters valid employee id")
    public void user_enters_valid_employee_id() {
        EmployeeListPage emplist = new EmployeeListPage();
        sendText(emplist.idEmployee, "15518");
    }
    @Given("user enters valid employee name")
    public void user_enters_valid_employee_name() {
        EmployeeListPage emplist = new EmployeeListPage();
        sendText(emplist.employeenamefield, "David");

    }
    @When("click on search button")
    public void click_on_search_button() {
        EmployeeListPage emplist = new EmployeeListPage();
        click(emplist.searchButton);
    }

    @Then("user see employee information is displayed")
    public void user_see_employee_information_is_displayed() {
        System.out.println("employee id displayed");

    }


}
