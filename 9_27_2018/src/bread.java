import java.util.Scanner;

public class bread {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int[] start = new int[x];
        int[] ideal = new int[x];
        for (int i = 0; i < x; i++)
            start[i] = input.nextInt();
        for (int j = 0; j < x; j++)
            ideal[j] = input.nextInt();


    }
}
