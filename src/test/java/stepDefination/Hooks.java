package stepDefination;


import Base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;


public class Hooks extends BaseTest {

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ScreenshotUtil.takeScreenshotAsByteArray(driver);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        quit();
    }
}