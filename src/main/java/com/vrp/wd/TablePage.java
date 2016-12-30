package com.vrp.wd;

import com.epam.jdi.uitests.web.selenium.elements.complex.table.Table;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Pavel.Skrebnev on 29.12.16.
 */
@JSite(domain = "http://www.w3schools.com")
public class TablePage extends WebSite {

    // check title
    @JPage(url = "/html/html_tables.asp", title = "HTML Tables")
    public static WebPage htmlTableExample;

    @FindBy(id = "customers")
    public static Table customersTable;

}
