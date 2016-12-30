package com.vrp.wd.base;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import com.vrp.wd.test.TestTable;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;
import static com.epam.jdi.uitests.web.selenium.driver.WebDriverUtils.killAllRunWebDrivers;

/**
 * Created by Pavel.Skrebnev on 30.12.16.
 */
public class TestsBase extends TestNGBase {

    @BeforeSuite(alwaysRun = true)
    public static void setUp() {
        WebSite.init(TestTable.class);
        logger.info("Run test");
    }

    @AfterSuite(alwaysRun = true)
    public static void tearDown() {
        killAllRunWebDrivers();
    }
}
