package webdriver.common.elements.pages.eks;

import webdriver.BasePageObject;

public class EksHomePage extends BasePageObject {

    public EksDetailPage openEksDetailPage() {
        driver.get("https://us-west-2.console.aws.amazon.com/eks/home?region=us-west-2#/clusters/eksCluster");
        return new EksDetailPage();
    }
}
