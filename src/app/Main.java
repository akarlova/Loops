package app;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6};
        int count = 0;
        int sum = 0;

        for (int i = 0; i < numbers.length; ++i) {
            int num = numbers[i];
            sum += num;
            ++count;
            System.out.println("" + count + ") Num is " + num + ", Sum is " + sum);
        }
        String separate = "----------------------";
        System.out.println(separate + "\nSum of numbers is " + sum);
    }
}
