package co.uk.zoopla.hooks;

import co.uk.zoopla.commons.BrowserClass;
import org.junit.After;
import org.junit.Before;

public class Hook extends BrowserClass
{
    @Before
    public void setUp()
    {
        launchBrowser("Chrome");
    }

    @After
    public void tearDown()
    {
        closeBrowser();
    }
}
