package practical;

import java.util.Scanner;
import java.util.Arrays;


public class StudentMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("학생 수를 입력하시오: ");
		int n = scan.nextInt();
		Student[] students = new Student[n];
		
		for (int i = 0; i < n; i++) {
			students[i] = new Student();
			System.out.print("\n학생의 이름 입력: ");
			students[i].setName(scan.next());
			System.out.printf("%s의 수학점수 입력: ", students[i].getName());
			students[i].setMath(scan.nextInt());
			System.out.printf("%s의 영어점수 입력: ", students[i].getName());
			students[i].setEng(scan.nextInt());
			System.out.printf("%s의 과학점수 입력: ", students[i].getName());
			students[i].setSci(scan.nextInt());
			System.out.printf("%s의 사회점수 입력: ", students[i].getName());
			students[i].setSoc(scan.nextInt());
			System.out.printf("%s의 도덕점수 입력: ", students[i].getName());
			students[i].setEth(scan.nextInt());
		}
		
		Integer[] totals = new Integer[n];
		for (int i = 0; i < totals.length; i++) {
			totals[i] = students[i].getTotal();
		}
		
		Arrays.sort(totals, new Compares());

		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (totals[i] == students[j].getTotal()) {
					Student temp = students[i];
					students[i] = students[j];
					students[j] = temp;
				}
			}
		}
		
		int r = 1;
		System.out.println("\n학급 석차: ");
		for(Student z : students) {
			System.out.printf("%d등 %s, 총점 %d, 평균 %.2f\n", r++, 
					z.getName(), z.getTotal(), z.getAvg());
			
		}
		
		scan.close();
	}
}
