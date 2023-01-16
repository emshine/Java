import java.util.Scanner;
class Factorial{
    public static void main(String[] args){
        float f =1;

        System.out.println("Enter the number: \t");
        Scanner sc = new Scanner(System.in);
        float s = sc.nextFloat();
        while(s!=0)
        {
            f =f*s;
            s=s-1; 
        }
        System.out.println("The factorial is "+f);
    }
}

----------------------------------------------------------------
  
  Output::::
Enter the number: 
10
The factorial is 3628800.0
