package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.messages.Messages;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.DashBoardPage;
import utils.CommonMethods;

import java.util.ArrayList;
import java.util.List;

public class DashboardSteps extends CommonMethods {
    @Then("verify the following tabs on dashboard")
    public void verify_the_following_tabs_on_dashboard(DataTable featuretable) {
        List<String> expectedTabs = featuretable.asList();
        for(String daslis:expectedTabs){
            System.out.println(daslis);
        }


    }
}