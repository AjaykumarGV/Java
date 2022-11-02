package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookTicketPojo extends BaseClass {

	public BookTicketPojo() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Not Now']")
	private WebElement notnow;

	@FindBy(xpath = "//span[contains(text(),'Search for Movies')]")
	private WebElement txtBox;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement txtname;
	
	@FindBy(xpath="(//strong[text()='Vikram'])[1]")
	private WebElement clickname;

	@FindBy(xpath = "(//span[text()='Book tickets'])[1]")
	private WebElement bookTicket;

	@FindBy(xpath="(//div[@class='date-day'])[5]")
	private WebElement date;

	@FindBy(xpath = "(//div[text()='DOLBY 7.1'])[1]")
	private WebElement showTime;

	@FindBy(xpath = "(//div[text()='Accept'])[1]")
	private WebElement accept;

	@FindBy(xpath="//li[text()='2']")
	private WebElement seats;

	@FindBy(id = "proceed-Qty")
	private WebElement btnClick;
	
	@FindBy(xpath="(//a[@class='_available _selected'])[1]")
	private WebElement clickrowandseats;

	public WebElement getNotnow() {
		return notnow;
	}

	public WebElement getTxtBox() {
		return txtBox;
	}

	public WebElement getTxtname() {
		return txtname;
	}

	public WebElement getClickname() {
		return clickname;
	}

	public WebElement getBookTicket() {
		return bookTicket;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getShowTime() {
		return showTime;
	}

	public WebElement getAccept() {
		return accept;
	}

	public WebElement getSeats() {
		return seats;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

	public WebElement getClickrowandseats() {
		return clickrowandseats;
	}

	
	
}
