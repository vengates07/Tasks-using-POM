package page;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class TestingPage extends TestBase{
		
		//Shop button
		@FindBy(xpath = "//a[contains(text(),'Shop')]")
		WebElement shop;
		
		//Home Button
		@FindBy(xpath = "//a[contains(text(),'Home')]")
		WebElement home;
		
		//Clicking the book
		@FindBy(xpath = "//h3[contains(text(),'Mastering JavaScript')]")
		WebElement clickImage;
		
		//Add to basket
		@FindBy(xpath = "//button[contains(text(),'Add to basket')]")
		WebElement add;
		
		//Checking the Basket
		@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[1]")
		WebElement basket;
		
		//Click the Description
		@FindBy(xpath = "//a[contains(text(),'Description')]")
		WebElement desc;
		
		//Description Box
		@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/p[1]")
		WebElement descVisible;
		
		//Click the Review
		@FindBy(xpath = "//a[contains(text(),'Reviews (0)')]")
		WebElement review;
		
		//Review Box
		@FindBy(xpath = "//div[@id='reviews']")
		WebElement reviewVisible;
				
		//Image Tag
		@FindBy(tagName = "img")
		List<WebElement> imageTag;
		
		//List of book names
		@FindBy(tagName = "h3")
		List<WebElement> bookList;
		
		//List of Arrivals
		@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")
		List<WebElement> arrivals;
		
		//List of slides
		@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
		List<WebElement> slides;
		
		JavascriptExecutor js;
	
	
			//Three Slides
		
			public TestingPage() {
				init();
				PageFactory.initElements(driver, this);
				js = (JavascriptExecutor) driver;
			}
			
			public void clickShop() {
				shop.click();
			}
			
			public void clickHome() {
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				home.click();
			}
			
			public void checkSlider() {
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				List<WebElement> s = slides;
				for(WebElement image:s) {
					List<WebElement> img = imageTag;
					Assert.assertTrue(img.size()==10);
				}
			
			}
			
			public void confirmSlider() {
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				List<WebElement> s = slides;
				
					List<WebElement> img = imageTag;
					
				Assert.assertTrue(img.size()==10);
			}
			
			
			
			//Three Arrivals
			
			public void checkArrival() {
				
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				
				js.executeScript("window.scrollBy(0,700)");
				
				List<WebElement> a = arrivals;
				for(WebElement list:a) {
					List<WebElement> books = bookList;
					
					if(books.size()==3) {
						System.out.println("There are only three arrivals in the home page");
					}
					}
			}
			
			
			public void confirm() {
				
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
					List<WebElement> a = arrivals;
					
					List<WebElement> books = bookList;
					
					Assert.assertTrue(books.size()==3);
					
			}
			
			

			//Navigate The Arrivals
			
				public void clickOnImage() {
					
					driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
					
					List<WebElement> a = arrivals;
					for(WebElement image:a) {
						if(image.getText().contains("Mastering JavaScript")) {
							clickImage.click();
						}
					}
				}
				
				public void checkingNavigation() {
				
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					Assert.assertTrue(driver.getTitle().contains("JavaScript"));
					
				}
				
				public void addToBasket() {
					
					add.click();
				
				}
				
				public void checkingBasket() {
				
					Assert.assertTrue(basket.getText().contains("added"));
				
				}
				

			
			
			//Checking the Description
		
				public void clickDescription() {
					js.executeScript("window.scrollBy(0,500)");
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					desc.click();
				}
				
				public void checkDescription() {
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					if(descVisible.isDisplayed())
					{
							System.out.println("The description of the book is available");
							Assert.assertTrue(true);
					}
					else {
							Assert.assertTrue(false);
					}
				}
				
		
				
			//Checking the review
				
					
				public void clickReview() {
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					review.click();
				}
				
				public void checkReview() {
					
					js.executeScript("window.scrollBy(0,600)");
					
					if(reviewVisible.isDisplayed()) {
						System.out.println("The Review is visible to user");
					}
					else {
						System.out.println("Re-run the application");
						Assert.assertTrue(false);
					}
				}

			

}
