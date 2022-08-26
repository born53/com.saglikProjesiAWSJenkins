package first.hooks;

import first.utilities.ConfigurationReader;
import first.utilities.DBUtils;
import first.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

    public static RequestSpecification spec;

    @Before(value="@Api")
    public void setUp(){
        spec = new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("medunnaUrl")).build();
    }

    @Before(value="@Db")
    public void setUpDb(){
        DBUtils.createConnection();
    }

    @Before(order = 1, value = "@UIRegistration")
    public void navigateToRegistration(){
        Driver.getDriver().get(ConfigurationReader.getProperty("medunnaRegistration"));
    }


    @After(value="~Api")
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()) {
            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","screenshots");
            Driver.getDriver().get("https://www.medunna.com/logout");
        }

        Driver.closeDriver();
    }
}
