package org.cancer.donate.testbase;

import org.cancer.donate.pages.DonatePage;

public class PageInitializer extends BaseClass {

    public static DonatePage donatePage;

    public static void initializePageObjects() {
        donatePage = new DonatePage();
    }
}
