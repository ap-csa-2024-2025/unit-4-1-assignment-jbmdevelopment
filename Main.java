import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter any integer. (Enter -1 to stop)");
    int num = 0;
    int sum = 0;
    while(!(num == -1)) {
        num = input.nextInt();
        sum += num;
    }
    sum++;
    System.out.println("Sum is " + sum);
    int count = 0;
    int max = Integer.MIN_VALUE;
    int i = 0;
    int score = 0;
    System.out.println("How many times do you want to input a score?");
    count = input.nextInt();
    while(i < count) {
        score = input.nextInt();
        if(score > max) {
          max = score;
        }
        i++;
    }
    System.out.println("The largest score is " + max);
    // write solutions to problems here
  }
}
