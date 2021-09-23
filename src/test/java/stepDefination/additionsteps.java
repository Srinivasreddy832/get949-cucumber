package stepDefination;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class additionsteps {
	int a,b,sum;
	
 @Given("I have two numbers to add {string} and {string}")

		public void i_have_two_numbers_to_add_and(String n1, String n2) {
	 a= Integer.parseInt(n1);
	 b=Integer.parseInt(n2);
		    
		}
    @Given("I have two numbers")
	 public void i_have_two_numbers(List<String> numbers) {
    	a=Integer.parseInt(numbers.get(0));
    	b=Integer.parseInt(numbers.get(1));
	     
	 }
    
      @Given("I have two numbers as map")
    	public void i_have_two_numbers_as_map(io.cucumber.datatable.DataTable dataTable) {
    	 Map<String,String> data= dataTable.asMap(String.class, String.class);
    	 a=Integer.parseInt(data.get("num1"));
     	b=Integer.parseInt(data.get("num2"));
    	   
    	}







      @When("do the additon")
		public void do_the_additon() {
    	  sum=a+b;
		    
		}
		@Then("Display the result in the console")
		public void display_the_result_in_the_console() {
		   System.out.println("Addtion is "+sum);
		}




}
