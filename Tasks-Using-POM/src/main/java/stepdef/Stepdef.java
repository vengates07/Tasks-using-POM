package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.TestingPage;

public class Stepdef {
	
	TestingPage slider;
		
		//Task1 : checking the slides
	
		@Given("User opens the browser and go to webpage")
		public void user_opens_the_browser_and_go_to_webpage() {
			slider = new TestingPage();
		}
	
		@When("User click shop menu")
		public void user_click_shop_menu() {
			slider.clickShop();
		}
		@When("user click on Home menu")
		public void user_click_on_Home_menu() {
			slider.clickHome();
		}
		@When("test home page has three slides only")
		public void test_home_page_has_three_slides_only() {
		    slider.checkSlider();
		}
		@Then("check its only have three slides")
		public void check_its_only_have_three_slides() {
		    slider.confirmSlider();
		}
	
	
		//Task2: checking the arrivals in home page
		
		@When("test home page has three arrivals only")
		public void test_home_page_has_three_arrivals_only() {
		    slider.checkArrival();
		}


		@Then("check its only have three arrivals")
		public void check_its_only_have_three_arrivals() {
		    slider.confirm();
		}

	
		//Task3: Checking the navigation of image
		
		@When("user clicks image in the arrival")
		public void user_clicks_image_in_the_arrival() {
		    slider.clickOnImage();
		}
	
		
		@When("check whether it is navigating to next page")
		public void check_whether_it_is_navigating_to_next_page() {
		   slider.checkingNavigation();
		}
		
		@When("add that book into basket")
		public void add_that_book_into_basket() {
			slider.addToBasket();
		}
		
		@Then("check the user can add to basket")
		public void check_the_user_can_add_to_basket() {
			slider.checkingBasket();
		}
	
		//Task4: checking the description section
		
		@When("click on description tab for the book")
		public void click_on_description_tab_for_the_book() {
		    slider.clickDescription();
		}

		@Then("there should be description of the book")
		public void there_should_be_description_of_the_book() {
		    slider.checkDescription();
		}

		
		
		//Task5: checking the review section
		
		@When("user click the review")
		public void user_click_the_review() {
			slider.clickReview();
		}
	
		@Then("check the user able to see reviews")
		public void check_the_user_able_to_see_reviews() {
			slider.checkReview();
		}
	
		

}
