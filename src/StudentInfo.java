import java.util.Scanner;

public class StudentInfo {
	public static void main(String[] args) {	// 프로그램의 시작과 끝
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 이름 : ");
		String name = sc.nextLine();
		
		System.out.println("학번 : ");
		String code = sc.nextLine();
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.println("이름:  " + name);
		System.out.println("학번 : " + code);
		System.out.println("주소 : " + address);
	}
}
