import java.util.Scanner;
class OddEven{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        if (a % 2 == 0)
        {
            System.out.println(a+" is even.");

        }
        else
        {
            System.out.println(a+" is odd.");
        }
    }
}
-------------------------------------------------------------------------
  Output::::
java OddEven
Enter the number:
67
67 is odd.
  
Enter the number:
98
98 is even.
