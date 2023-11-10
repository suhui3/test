import java.util.Scanner;
public class V1_Q3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();
        int temp = binary, current = 0, sum = 0, sumD = 0;

        for(int i =0; temp>0; i++) {
            current = temp % 10;
            if (current != 0 && current != 1){
                System.out.println("Wrong format. Program end.");
                break;
            }
            temp /= 10;
            sum ++;
        }
        toDecimal(binary, sum);
    }

    public static void toDecimal(int binary, int sum){
        int dec = 0;
        System.out.printf("Binary digit %d", binary);
        for(int i=sum-1; i>=0; i--){
            dec = (int) (dec + ((binary%10)*Math.pow(2,i)));
            binary /= 10;
        }
        System.out.println(" is equivalent to " + dec + " in decimal.");
    }
}
