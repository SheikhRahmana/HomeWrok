package day4homework;

public class ConditionalOperators {

	public static void main(String[] args) {
    int a = 10;
    int b= 20;
     //how I can compare above two value
    System.out.println(a==b);
    // == operators is used to compare tow premetive types value
    //it is giving us true or false answer
    if(a==b) {
    	System.out.println("Both values are equal");
    }
    else {
    	System.out.println("Both values are not equal");
    }
    if(true) {
    	System.out.println("Both variable contains equal value");
    }
    else {
    	System.out.println("Both variables values are not equal");
    }// Why system is showing yellow warning sign, because the condition is already true so unnessary we wrote
    //else part that is why it is dead code.
    //---------------------------------------------
    boolean flag = true;
    if(flag) {
    	System.out.println("It is visible");
    }
    else {
    	System.out.println("It is not visible");
    	// abobve lines of vode did not show dead code because we are using variabl here.
    	//==========================================
    	//nested condition
    	int total=100;
    	if(total<=100) {
    		System.out.println("Total is less than or equal to 100");
    		if(total>=80) {
    			System.out.println("Total is greater than or equal to 80");
    			 if(total==80) {
    				 System.out.println("pas it");
    			 }
    		}
    		else {
    			System.out.println("N/A");
    		}
    	}
    	else {
    		System.out.println("Exit");
    	}
    
    //string compare , we use  equals which compare values on the other hand  == compare references
    String browser="chrome";
    if(browser.equals("chrome")) {
    	System.out.println("chrome launched");
    }
    if(browser.equals("firefox")){
     System.out.println("Firefox launched");		
	}
    if(browser.equals("Safari")) {
    	System.out.println("Safari Launched");
    }
    //------------------------------------
    //if i write above code it will check every condition because there are no negative condition so 
    // we can write a === else== condition which will allow if the condition is satisfied or not
    else {
    	System.out.println("Please pass correct input");
    	//if I pass incorrect input at the line 54 it will execute line 67
    }
    //============================
    //now we can write a condition which will be more effective during execution
    String browsers="Brave";
    if(browsers.equals("Brave")) {
    	System.out.println("Brave executed");
    }
    else if(browsers.equals("IE")) {
    	System.out.println("IE launched");
    }
    else if(browsers.equals("Opera")) {
    	System.out.println("opera launched ");
    }
    else {
    	System.out.println("Invalid browser name");
    }
    //==================================================
    //above code  if very first condition  met requirement it will execute at line 74 and willn't check 
    //any other line of code and will exit from the condition 
    //===================================================
    int x=100;
    int y=200;
    int z=300;
    if(x>y && x>z) {// x is not greater than y  even x is not greater than z  so the condition is false
    	// && -> is called short circuit operator 
    	// in short circuit if the frist condition is false it will not check second one 
    	System.out.println("x is the bigger number");
    }
    else if(y>z) {// y is not greater than z so the conditio is false
    	System.out.println( "y is the bigger number");
    }
    else { // so  Z is the largest number 
    	System.out.println("Z is the greater number ");
    }
   }
    
  }
}


