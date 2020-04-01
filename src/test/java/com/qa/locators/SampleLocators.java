package com.qa.locators;

import org.openqa.selenium.By;

public class SampleLocators {
	public By tutorialsDropdown() {
		return By.xpath("//a[@id='navbtn_tutorials']/i[contains(@class,'fa-caret-down')]");
	}

	public By tutorialLink(String courseName) {
		return By.xpath("//a[text()='" + courseName + "']");
	}

	public By tutorialHeader() {
		return By.xpath("//div[@id='mainLeaderboard']//following-sibling::h1");

	}

	public By homeIcon() {
		return By.xpath("//a[contains(@class,'fa-home')]");
	}
}
