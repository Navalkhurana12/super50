
/*
 * @filename:Mystring
 * @description:this pergrom will perform most of the string operation 
 * author :Navalkhurana 
 */
import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    MyString myStr = new MyString(input);
    boolean running=true;
    while (true) {
      System.out.println("\nCurrent String: " + myStr.getValue()
          + "\nSelect an operation:\n1. Append\n2. CountWords\n3. Replace\n4. isPalindrome\n5. Splice\n6. Split\n7. MaxRepeatingCharacter\n8. Sort\n9. Shift\n10. Reverse\n0. Exit\nEnter choice: ");
      int choice = sc.nextInt();
      sc.nextLine();
      switch (choice) {
        case 1:
          System.out.print("Enter string to append: ");
          String toAppend = sc.nextLine();
          myStr.append(toAppend);
          System.out.println("Result: " + myStr.getValue());
          break;

        case 2:
          int wordCount = myStr.countWords();
          System.out.println("Word count: " + wordCount);
          break;

        case 3:
          System.out.print("Enter string to replace: ");
          String oldStr = sc.nextLine();
          System.out.print("Enter replacement string: ");
          String newStr = sc.nextLine();
          myStr.replace(oldStr, newStr);
          System.out.println("Result: " + myStr.getValue());
          break;

        case 4:
		  
          boolean isPal = myStr.isPalindrome();
          System.out.println("Is palindrome: " + isPal);
          break;

        case 5:
          System.out.print("Enter start index: ");
          int start = sc.nextInt();
          System.out.print("Enter length: ");
          int length = sc.nextInt();
          myStr.splice(start, length);
          System.out.println("Result: " + myStr.getValue());
          break;

        case 6:
          System.out.print("Enter pattern to split by: ");
          String pattern = sc.nextLine();
          String[] parts = myStr.split(pattern);
          System.out.print("Result: [");
          for (int i = 0; i < parts.length; i++) {
            System.out.print("\"" + parts[i] + "\"");
            if (i < parts.length - 1)
              System.out.print(", ");
          }
          System.out.println("]");
          break;

        case 7:
          String maxChar = myStr.maxRepeat();
          System.out.println("Max repeating character: " + maxChar);
          break;

        case 8:
          String sorted = myStr.sort();
          System.out.println("Sorted: " + sorted);
          break;

        case 9:
          System.out.print("Enter shift amount: ");
          int n = sc.nextInt();
          myStr.shift(n);
          System.out.println("Result: " + myStr.getValue());
          break;

        case 10:
          String reversed = myStr.reverse();
          System.out.println("Reversed: " + reversed);
          break;

        case 0:
          running = false;
          System.out.println("Exiting...");
          break;

        default:
          System.out.println("Invalid choice");
      }
      }
    }
  }

