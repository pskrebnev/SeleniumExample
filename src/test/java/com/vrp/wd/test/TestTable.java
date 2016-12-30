package com.vrp.wd.test;

import com.epam.jdi.uitests.web.selenium.elements.complex.table.Table;
import com.epam.web.matcher.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static com.vrp.wd.TablePage.htmlTableExample;

/**
 * Created by Pavel.Skrebnev on 30.12.16.
 */
public class TestTable extends Table {

    // check the page is opened
    @BeforeMethod
    public void before(Method method) {
        htmlTableExample.isOpened();
    }

    @Test
    public void getTableInfo() {
        htmlTableExample.isOpened();
        Assert.isFalse(htmlTableExample.title.equals("HTML Tables"));
    }
}
