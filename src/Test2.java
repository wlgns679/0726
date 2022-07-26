import java.util.Scanner;
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		String ch = sc.nextLine();		// "A"
		char ch1 = ch.charAt(0);
		
		System.out.printf("문자 %c의 코드값은 %d입니다. " ,ch1 ,(int)(ch1));

	}

}
