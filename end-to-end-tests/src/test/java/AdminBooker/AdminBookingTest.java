package AdminBooker;

import org.junit.Before;
import org.junit.Test;
import pageobjects.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class AdminBookingTest extends TestSetup {

    @Before
    public void logIntoApplication() {
        navigateToApplication();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.populateUsername("admin");
        loginPage.populatePassword("password");
        loginPage.clickLogin();
    }
    @Test
    public void adminBookingOpenModel(){

        ReportPage reportPage = new ReportPage(driver);
        assertThat(reportPage.reportExists(), is(true));
    }
}
