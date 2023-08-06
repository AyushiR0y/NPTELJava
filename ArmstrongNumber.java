import java.util.Scanner;
public class Exercise1_4 {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
           int result=0;
      
int originalNumber = n;
        int numDigits = String.valueOf(n).length();

        while (n > 0) {
            int digit = n % 10;
            result += Math.pow(digit, numDigits);
            n /= 10;
        }

        if (result == originalNumber) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }

        sc.close();
    }
}
