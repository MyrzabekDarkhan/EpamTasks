import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TaskSix {

    public static void main(String[] args) {
        findDistinct(fillArr(5));
    }


    public static int[] fillArr(int n) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }


    static void findDistinct(int arr[]) {
        System.out.println("Массив : " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            String num = "" + Math.abs(arr[i]);
            for (int j = 1; j < num.length(); j++) {
                if (num.charAt(j) != num.charAt(j-1)) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}