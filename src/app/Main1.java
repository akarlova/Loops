package app;

public class Main1 {

    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6};
        int count = 0;
        int sum = 0;

        for (int num: numbers) {
            sum += num;
            ++count;
            System.out.println("" + count + ") Num is " + num + ", Sum is " + sum);
        }
        String separate = "----------------------";
        System.out.println(separate + "\nSum of numbers is " + sum);
    }
}
