package DSA_FOR_PLACEMENT.BIT_MANIPULATION.SINGLE_NUMBER_II;

public class Main {
    // FIND THE TWO NON REPEATING NUMBERS IN AN ARRAY WHERE EVERY OTHER ELEMENTS
    // REPEATS TWICE
    public static void main(String[] args) {
        // int a[] = {2,4,1,2,3,7,4,1};
        int a[] = { 52, 64, 31, 52, 43, 67, 64, 31 };

        int sum = 0, sum1 = 0, sum2 = 0;
        for (int num : a) {
            sum = sum ^ num;
        }
        // HERE THE VALUE OF SUM WILL BE THE XOR OF THE TWO NON REPEATING NUMBERS
        // System.out.print("Array 1 -> [");
        // for(int num : a){
        // System.out.printf(" %d,",num);
        // }
        // System.out.print("]\n");

        // System.out.println(sum);

        int temp = sum;
        int count = 0;
        while (temp != 0) {
            if ((temp & 1) == 1) {
                break;
            }
            ++count;
            temp = temp >> 1;
        }
        // COUNT = RIGHTMOST POSITION OF THE SET BIT

        // System.out.println("Count -> " + count);

        for (int num : a) {

            // System.out.printf("(%d >> %d) & 1 == %d\n", num, count, ((num >> (count)) &
            // 1));

            if (((num >> count) & 1) == 1) {
                sum1 = sum1 ^ num;
                System.out.println("1 -> " + num);
            } else {
                sum2 = sum2 ^ num;
                System.out.println("0 -> " + num);
            }
        }
        // System.out.println("Sum1 -> " + sum1 + " Sum2 -> " + sum2);
        if ((sum1 ^ sum2) == sum) {
            System.out.println("Num1 -> " + sum1 + " Num2 -> " + sum2);
        } else {
            System.out.println("Two single numbers not found");
        }
    }
}
