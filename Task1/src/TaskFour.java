import java.util.Scanner;

public class TaskFour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько итераций вы хотите");
        int numOf = scanner.nextInt();
        int i,number=0,sum=0;
        int mult=1;

            System.out.println("Введи n чисел: ");


        for (i=0;i<numOf;i++)
        {

            number = scanner.nextInt();

            sum+=number;
            mult*=number;
        }
        System.out.println("Сумма  "+ sum);
        System.out.println("Произвидение "+ mult);
    }
}
