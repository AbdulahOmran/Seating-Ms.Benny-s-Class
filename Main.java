import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    String[] names = new String[15];
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    for (int i = 0; i <= 14; i++) {
    System.out.println("What is your name?");

     names[i] = myObj.nextLine();  // Read user input
  
    }
    int i = 0;
    while (i <= 14)
    {
      System.out.println(names[i] + " Is assigned to " + numbers[i]);
      i++;
    }

  }
} 