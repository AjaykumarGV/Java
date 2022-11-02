package org.stepdef;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.pojo.BookTicketPojo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionClass extends BookTicketPojo {

	public static BookTicketPojo bt;

	@When("User is in a Bookmyshow application")
	public void user_is_in_a_Bookmyshow_application() {

		launchBrowser();
		launchUrl("https://in.bookmyshow.com/explore/home/chennai");
		maxWindow();

	}

	@When("User have to enter a movie name and select a date")
	public void user_have_to_enter_a_movie_name_and_select_a_date() throws AWTException {

		waitWindow();

		bt = new BookTicketPojo();
		btnClick(bt.getNotnow());

		Actions act = new Actions(driver);
		act.moveToElement(bt.getTxtBox()).doubleClick().perform();
		act.doubleClick(bt.getTxtBox()).perform();

		toText(bt.getTxtname(), "Vikram");
		btnClick(bt.getClickname());
		waitWindow();
		btnClick(bt.getBookTicket());

		act.moveToElement(bt.getDate()).doubleClick().perform();

	}

	@When("User have to select theatre and select screen")
	public void user_have_to_select_theatre_and_select_screen() {

		btnClick(bt.getShowTime());
		btnClick(bt.getAccept());

	}

	@When("User have to select a seat and book a ticket")
	public void user_have_to_select_a_seat_and_book_a_ticket() {

		waitWindow();
		btnClick(bt.getSeats());
		btnClick(bt.getBtnClick());

		WebElement table = driver.findElement(By.className("setmain"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));

		for (int i = 1; i < rows.size(); i++) {

			WebElement row = rows.get(i);

			if (i == 8) {

				List<WebElement> datas = row.findElements(By.tagName("td"));

				for (int j = 1; j < datas.size(); j++) {

					WebElement data = datas.get(j);

					if (data.equals("1")) {

						btnClick(bt.getClickrowandseats());

					}

				}

			}

		}
	}

	@Then("User is in a Payment Method")
	public void user_is_in_a_Payment_Method() {

	}

}
