import java.util.*;
public class VarandDt {
    public static void main(String[] args) {
// Sum of 2 Numbers-------
        int a=10;
        int b=5;
        int sum=a+b;
        System.out.println(sum);
    // Output-15

    // Taking input in Java
        Scanner s=new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(num);
        /*Input-98  || Output-98 */

// Taking input from user and calculate the sum of 2 numbers
        int num1=s.nextInt();
        int num2=s.nextInt();
        int add=num1+num2;
        System.out.println("The sum of 2 numbers is " + add);
        s.close();
        /* Input=65,56 || Output=121 */ 
    }
}