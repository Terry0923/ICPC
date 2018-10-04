import java.util.Scanner;

public class Bumper {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		String a = "";
		for (int i = 1; i <= z; i++){
		    a = "";
		    if (i%x==0)
		    a+="Fizz";
		    if (i%y==0)
		    a+="Buzz";
		    if(a.length()==0) {
		    System.out.println(i);
		    continue;
		    }
		    System.out.println(a);
		  }
	}

}
