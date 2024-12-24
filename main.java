import java.util.Scanner;

public class main{

  public static void main(String ... args){
    Scanner input = new Scanner(System.in);
    int minutes = 0;
    while (true) {
      System.out.print("Write the minutes: ");
      if (input.hasNextInt()){
        minutes = input.nextInt();
        input.nextLine();
        if (minutes > 0)
          break;
        else
          System.out.println("Invalid number");
      }
      else {
        System.out.println("Invalid number");
        input.nextLine();
      }
    }
      System.out.println(minutes + " minutes has " + minutes * 60 + " seconds");
  }
}
