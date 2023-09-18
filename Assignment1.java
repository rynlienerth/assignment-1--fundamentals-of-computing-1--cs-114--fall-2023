// Import libraries here
import java.util.Random;
import java.util.Scanner;

//start of the letters step 1

public class Assignment1 {
 
  public static void printBlockLetterKL() {
   String[] letterKL = { 
 
  "KK      KK   LL            ",
  "KK    KK     LL            ",
  "KK   KK      LL            ",
  "KK KK        LL            ",
  "KKKK         LL            ",
  "KK KK        LL            ",
  "KK   KK      LL            ", 
  "KK    KK     LL            ",
  "KK      KK   LL            ",
  "KK        KK LLLLLLLLLLLLLL",
  
  };
  for (String line : letterKL) {
          System.out.println(line);
}
  }
      
  

//Start of step 2 Temperature Conversions

  public static void main(String[] args) {
    
    //printing block letters
              printBlockLetterKL(); 
              
    //Start of step 2 Temperature Conversions   
    try (Scanner scanner = new Scanner(System.in)) {
             System.out.println("Enter temperature in Fahrenheit: ");
    double fahrenheit = scanner.nextDouble();
             System.out.println("Enter a 5-character string: ");
String inputString = scanner.next();
    double celsius = (fahrenheit - 32) * 5 / 9;

      
              
      //printing temperature conversion
              System.out.println("Temperature Conversion: " + fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
 
      // Step 3 Trimmed Reverse String
  
//adding just in case string is not 5 letters in length
 if (inputString.length() != 5) {
            System.out.println("Error: Please enter a 5-character string.");
      return;
 }
 String trimmedReversedString = new StringBuilder(inputString.substring(1,4)).reverse().toString();

 //Printing out the trimmed reversed string
            System.out.println("Result: " + trimmedReversedString);
  
 //Added Step 4 Random Number
 Random random = new Random();
      int randomNumber = random.nextInt(16353) + 32;
            System.out.println("Random Number: " + randomNumber);
  
  //Step 5 adding TempConversion, Reversed trimmed string, and random number
            System.out.print(celsius+trimmedReversedString+randomNumber);
          }
  }
}




