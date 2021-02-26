import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random()*n);
        }

       //без перехода на новую строку
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        //с переходом на новую строку
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
