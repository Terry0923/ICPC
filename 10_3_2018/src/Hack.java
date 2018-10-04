import java.util.Arrays;
import java.util.Scanner;

public class Hack {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] arr = new String[n*2];
		
		for (int i = 0; i < arr.length; i++)
			arr[i] = input.next();
		
		double[] arr2 = new double[n];
		for (int i = 0; i < arr2.length; i++)
			arr2[i] = Double.parseDouble(arr[2*i+1]);
		
		Arrays.sort(arr2);
		double sum = 0;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
			sum += (i+1) * arr2[arr2.length - 1 - i];
		}
		System.out.println(sum);
	}

}
