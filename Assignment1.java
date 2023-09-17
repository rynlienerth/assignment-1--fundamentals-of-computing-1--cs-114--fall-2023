// Import libraries here
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
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter temperature in Fahrenheit: ");
    double fahrenheit = scanner.nextDouble();
    System.out.println("Enter a 5-character string: ");
String inputString = scanner.next();
    double celsius = (fahrenheit - 32) * 5 / 9;

    printBlockLetterKL(); 
    System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
  
    // Step 3 Trimmed Reverse String
    

  if (inputString.length() != 5) {
    System.out.println("Error: Please enter a 5-character string.");
    return;
  }
  String trimmedReversedString = new StringBuilder(inputString.substring(1,4)).reverse().toString();

  System.out.println("Result: " + trimmedReversedString);
  }
}




