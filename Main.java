public class Main {

   public static void main(String []args) {
      
      // 4.7 WRAPPER CLASSES wrap primitives into objects
      // why? some methods NEED objects!
      Integer fancyInt = new Integer(13); 
      Double fancyDoub = new Double(4.00);
      // calling the constructor is no longer necessary!
      // can just declare them like you would primitives:
      Integer fancierInt = 13; 
      // AUTOBOXING: Java converts int to Integer above
      int regularInt = fancierInt; // UNBOXING 

      // Another benefit of Wrappers: objects have methods
      System.out.println(Integer.MIN_VALUE);
      System.out.println(Integer.MAX_VALUE);
      String stringyNums = "13.0"; 
      double parsedD = Double.parseDouble(stringyNums);
      System.out.println(parsedD);
      String stringyNums2 = "13";
      int parsedI = Integer.parseInt(stringyNums2);
      System.out.println(parsedI);


   }
}
