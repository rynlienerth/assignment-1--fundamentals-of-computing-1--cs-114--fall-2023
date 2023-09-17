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

    double celsius = (fahrenheit - 32) * 5 / 9;

    printBlockLetterKL(); 
    System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
  }
}


//Start of step 3 