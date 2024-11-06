
import java.util.*;
public class CheckNegative {
    public static void main(String[] args){
        Scanner input1 = new Scanner ("38 4 19 -27 -15 -3 4 19 38");
        Scanner input2 = new Scanner ("14 7 -10 9 -18 -8 17 42 98");
        CheckNegativeSum(input1);
        System.out.println();
        CheckNegativeSum(input2);
        }

        public static void CheckNegativeSum(Scanner input){
            int sum = 0;
            while (input.hasNextInt()) {
                int next = input.nextInt();
                sum += next;
            }
            System.out.println("sum = " + sum);
        }
}
    








