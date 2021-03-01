public class TaskSeven {

    public static void main(String[] args) {
        sortByK(2, fillArrRand(3,1,10));
    }

    public static int[][] fillArrRand(int n,int max,int min) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int)(Math.random() * (max-min)+min);
            }
        }

        System.out.println("Начальный массив:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return arr;
    }



    public static int[][] sortByK(int x, int arr[][]) {
        x--;
        for (int i = 0; i < arr.length; i++)
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i][x] > arr[k][x]) {
                    for (int j = 0; j < arr.length; j++) {
                        int temp = arr[i][j];
                        arr[i][j] = arr[k][j];
                        arr[k][j] = temp;
                    }
                }
            }



        System.out.println("Сортированный массив:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr;
    }

}