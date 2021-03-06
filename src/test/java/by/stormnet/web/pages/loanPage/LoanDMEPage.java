package by.stormnet.web.pages.loanPage;

import by.stormnet.web.pages.AbstractPage;

public class LoanDMEPage extends AbstractPage {

    private String beVerify = "//*[@id=\"divs0f7350442f_transition\"]/button[2]";
    private String saveButton = "/html/body/div[1]/div/section[2]/div/form/div[2]/button[1]";
    private String decideButton = "//button[@class='btn btn-decision']";
    private String approval = "//*[@id='select2-chosen-20']";
    private String checkApproval = "//*[@id='select2-result-label-50']";
    private String checkBox = ".icheckbox_square-blue.checked";

    public LoanDMEPage navigateToPage() {
        openUrl(baseUrl);
        return this;
    }

    public LoanDMEPage getVerifyLoanPage() {
        return this;
    }

    public LoanDMEPage clickBeVerify() {
        getElement(beVerify).click();
        return getVerifyLoanPage();
    }

    public LoanDMEPage clickSaveButton() {
        getElement(saveButton).click();
        return getVerifyLoanPage();
    }

    public LoanDMEPage clickDecidebutton() {
        getElement(decideButton).click();
        return getVerifyLoanPage();
    }

    public LoanDMEPage clickApproval() {
        jsScroll();
        waitForElementVisible(getElementBy(approval));
        getElement(approval).click();
        return getVerifyLoanPage();
    }

    public LoanDMEPage checkApproval() {
        getElement(checkApproval).click();
        return getVerifyLoanPage();
    }

    public LoanDMEPage checkBox() {
        getElementByCss(checkBox).click();
        return getVerifyLoanPage();
    }

}
