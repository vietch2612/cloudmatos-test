package webdriver.common.testcases;

import io.qameta.allure.Story;
import lombok.SneakyThrows;
import org.testng.Assert;
import org.testng.annotations.Test;
import webdriver.common.elements.pages.DashboardPage;
import webdriver.common.elements.pages.LoginPage;
import webdriver.common.elements.pages.eks.EksDetailPage;
import webdriver.common.elements.pages.eks.EksHomePage;
import webdriver.common.elements.pages.vpc.VpcInboundRulesDetailPage;
import webdriver.common.elements.pages.vpc.VpcSecurityGroupPage;
import webdriver.common.template.QCPracticeTestTemplate;

public class EksTest extends QCPracticeTestTemplate {

    @Test
    @Story("AWS EKS security groups allow incoming traffic only on TCP port 443 from the Group Page")
    public void VerifyThatSecurityGroupsAllowsIncomingTrafficOnlyOnTCP443InGroup() {
        LoginPage loginPage = new LoginPage();
        DashboardPage dashboardPage = loginPage.login();
        EksHomePage eksHomePage = dashboardPage.openEks();
        EksDetailPage eksDetailPage = eksHomePage.openEksDetailPage();
        VpcSecurityGroupPage vpcSecurityGroupPage = eksDetailPage.openSecurityGroupPage().viewInboundRules();

        Assert.assertTrue(vpcSecurityGroupPage.isTypeHttps());
        Assert.assertTrue(vpcSecurityGroupPage.isProtocolTcp());
        Assert.assertTrue(vpcSecurityGroupPage.isPortRange443());
    }
}
