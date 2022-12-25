import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] array = new int[input];

        for(int i = 0; i<input; i++){
            int num = random.nextInt(1000-900);
            array[i] = num;
        }
        System.out.println("Old Array: " + Arrays.toString(array));
        bubbleSort bubbleSort = new bubbleSort();
                bubbleSort.bubbleSort(array);

    }
}