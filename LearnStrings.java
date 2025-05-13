package Basic_java;

import java.util.Iterator;

public class LearnStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Literals [It will not create a new memory space]
		String a="Selenium";
		String c="Selenium Course";
		
		//Instantiation [It will create a new memory space]
		String b= new String("Selenium");
		String d= new String("Selenium");
		
		//Length [Count the no of characters starts with 1]
		int length = c.length();
        System.out.println(length);
        
        //Concatenation [Joining the string]
        String a1= "Java";
        String a2= "Selenium course";
        String a3= "From Testleaf";
        System.out.println(a1+a2+a3); //It will perform a arithmetic operation
        System.out.println(a1.concat(a2).concat(a3));
        
        
        //Equals [Comparing the Strings]
        boolean equals = a.equals(c);
        //System.out.println(equals);
        
        if (equals) {
        	System.out.println("Selenium is present");
			
		} else {
			System.out.println("Selenium is not present");

		}
        
        //Double equal(==) [Check the memory location only if the same address it will pass]
        if (a==c) {
        	
        	System.out.println("Success");
			
		} else {
			System.out.println("Falied");

		}
        
        //Ignore case-sentitve [without worrying about upper-case or lower-case]
        boolean equalsIgnoreCase = a.equalsIgnoreCase(c);
        System.out.println(equalsIgnoreCase);
        
        
        //Contains [It is case-sentitive checks whether the value is present or not]
        boolean contains = a.contains("Selenium");
        System.out.println(contains);
        
        if (contains) {
        	System.out.println("Present");
			
		} else {
			System.out.println("Failed");

		}
        
        //to CharArray [Convert the string from character to Array]
        char[] charArray = c.toCharArray();
		//System.out.println(charArray);
        
       for (int i = 0; i < charArray.length; i++) {
    	   System.out.println(charArray[i]);
		
	}
       
       System.out.println("**********");
       
       //ChaAt [Access specific character]
       char charAt = c.charAt(7);
       System.out.println(charAt);
       
       //Replace 
       String e= "CouRse 13456";
       System.out.println(e.replace("CouRse", "Test"));
       
       //Retrive the value 
       String replaceAll1 = e.replaceAll("[^A-z]", ""); //Character 
       System.out.println(replaceAll1);
       String replaceAll2 = e.replaceAll("[^0-9]", ""); //Number
       System.out.println(replaceAll2);
       
       //String to Interger 
      String num= "1234";
      System.out.println(num+10);  //It will not add
      int sti = Integer.parseInt(num);
      System.out.println(sti);
      
      //Interger to string
      int num1= 7645;
      System.out.println(num1+10);
      String its = Integer.toString(num1);
      System.out.println(its);		
      
	}

}

