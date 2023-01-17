import java.util.Scanner;
class palindromeM {
    static void Palindrome(int a){
        int b,c,k,s=0;
        b=a;
        while(a>0)
        {
            k=a%10;
            s=s*10+k;
            a=a/10;
            
        }
        if(s==b)
        {
            System.out.println("The number of"+b+" is palindrome .");
            
        }
        else
        {
            System.out.println("The number of "+b+" is not palindrome .");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number");
        int s = sc.nextInt();
        Palindrome(s);
        
    }
}


Output::::
Enter Number
121
The number of121 is palindrome.
