
//Create Project.CreatePackage.Create Class.Declare DataTypes & Variables

package homework;

public class JavaClass {
	  int year;
      int price=28000;
      String model="honda";
      String name="accord";
      boolean diesel= false;
     
      static int seats=5;
      
       // call variable to a differnet class 
      public void differentclass(){
    	  System.out.println (price+ " "+ model+ " "+diesel);
      }
    	  //  empty Constructor
    	  
    	   public JavaClass(){}
    		   
          // Constructor 
    	 
           public JavaClass (int Year ){
           this.year = Year;
           System.out.println(year);}
        	   
           
      //Object Creation JavaClass object 
          
           // void method 
           
           public void methV(){
        System.out.println("this is my void meth");
           }
                  
           // static void meth 
        	   
           // no static Return Type Method
    
 public  int carsupport(int frontseat,int backseat){
      int result= frontseat+ backseat;
       System.out.println(result);
       return result ; 
        	   
           }
           
        	   
               
}   

