// Import the HashSet class
import java.util.HashSet;
import java.util.Scanner;

public class Carbank {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    
    Scanner userInput = new Scanner(System.in);

    String first_input = userInput.nextLine();

    cars.add(first_input);

    String second_input = userInput.nextLine();

    cars.add(second_input);

    String third_input = userInput.nextLine();

    cars.add(third_input);

    String fourth_input = userInput.nextLine();

    cars.add(fourth_input);

    System.out.println(cars);
  }
}