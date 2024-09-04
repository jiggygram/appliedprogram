public class jiggy {
    int a = 31; // This is an instance variable

    static int y = 28; // This is a static variable
public static void localMethods(){
    int z = 75; //This is a local variable
    System.out.println("The local variable = " + z);
}
public void instanceMethod(){
    //Accessing instance variable
    System.out.println(a + " Can be directly accessed from the instance method");

    //Accessing static variable
    System.out.println(y + " Can be directly accessed from the instance method");

}
//Static Method
public static void staticMethod(){
    //Accessing static variable
    System.out.println(y + " Can be directly accessed from the static method");
    
    // Note: Cannot access instance variables directly in a static method
    // System.out.println(instanceVariable); 
    // This would cause an error

}
    public static void main(String[] args) {
       

        // Creation of an object
        jiggy gram = new jiggy();

        //Accessing the instance variable
        System.out.println("The instance variable = " + gram.a);

        //Accessing the local variable
        

        //Accessing the static variable
        System.out.println("The static variable = " + jiggy.y);

        //Calling instanceMethod
        gram.instanceMethod();
        
 
        //Calling staticMethod
        staticMethod();

        //Calling localMethod
        localMethods();
    }
   
}
