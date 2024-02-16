package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Page_Bloodbank_edit extends BaseTest {

	public Page_Bloodbank_edit(WebDriver driver) {
		this.driver = driver;
	}

	public void editTest() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(pr_loc.getProperty("edit_option"))).click();
		driver.findElement(By.xpath(pr_loc.getProperty("edit_title"))).clear();
		driver.findElement(By.xpath(pr_loc.getProperty("edit_title"))).sendKeys(pr_data.getProperty("Bloodgroup_edit"));
		Thread.sleep(2000);

		Actions act = new Actions(driver);
		WebElement save = driver.findElement(By.id(pr_loc.getProperty("edit_save_btn")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 400)");
		Thread.sleep(2000);

		act.moveToElement(save).click().build().perform();
		System.out.println("save is clicked");

	}

	public void deleteTest() throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(By.xpath(pr_loc.getProperty("delete_option"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr_loc.getProperty("delete_ok"))).click();
	}

}
