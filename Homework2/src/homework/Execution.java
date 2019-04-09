package homework;

public class Execution {
    
	
	   //Declare Main Method

	public static void main(String[] args) {
		
		
		
		//called Variables to a different class
		 JavaClass  objectvar = new JavaClass();
		 
		objectvar.differentclass();
		  
		
		// empty Constructor: public JavaClass(){}
		
		//Constructor 
		 
		JavaClass objectcons = new JavaClass(2017);
		 
		  // Object Creation
		
		 JavaClass object = new JavaClass();
         System.out.println(object.name);
          
       // void method 
         
         JavaClass ObjectMeth= new JavaClass();
         ObjectMeth.methV();

         
         
         
        // static void meth
        System.out.println(JavaClass.seats);
         
         // no static method return type 
        
       JavaClass retobject= new JavaClass();
       retobject.carsupport(5, 2);
      
	// condition if/else statement
       int money=25000;
        if  (money == 28000) {
        	
     System.out.println("the two values are the same ");
        	
        }else {
     System.out.println("the two values are not the same");}
        	
        
       // Arithmetic Operations
        
        int note1 = 30;
	    int note2 = 15;
	      int note3=  7;
         double avg= (note1+note2+note3)/3;
        
       System.out.println(avg);
	}

}
       