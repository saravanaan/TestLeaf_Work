package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import wdMethods.Annotattion2;
//import wdMethods.WdAnnotation;

public class ViewLeadPage extends Annotattion2 {
	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Leads']")
	WebElement eleLeads;

	public MyLeadsPage clickLeads() {
		//WebElement eleLeads = locateElement("linktext", "Leads");
		click(eleLeads);
		return new MyLeadsPage();
	}
}
