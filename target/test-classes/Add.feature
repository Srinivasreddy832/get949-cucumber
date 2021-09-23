Feature: Addition
 Scenario: Addtion of two number
       Given I have two numbers to add "51" and "65"
       When do the additon
       Then Display the result in the console
  Scenario: Addtion of two number list
       Given I have two numbers
       |8|
       |9|
       When do the additon
       Then Display the result in the console
   Scenario: Addtion of two number in map
       Given I have two numbers as map
          |num1|8|
          |num2|9|
       When do the additon
       Then Display the result in the console
       
       System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
		    driver= new ChromeDriver();
		     driver.get("https://www.selenium.dev/");
		  driver.findElement(By.linkText("Downloads")).click();
		   Assert.assertEquals(ss, driver.getTitle());
       