package practical;

import java.util.Scanner;
import java.util.Arrays;


public class StudentMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("�л� ���� �Է��Ͻÿ�: ");
		int n = scan.nextInt();
		Student[] students = new Student[n];
		
		for (int i = 0; i < n; i++) {
			students[i] = new Student();
			System.out.print("\n�л��� �̸� �Է�: ");
			students[i].setName(scan.next());
			System.out.printf("%s�� �������� �Է�: ", students[i].getName());
			students[i].setMath(scan.nextInt());
			System.out.printf("%s�� �������� �Է�: ", students[i].getName());
			students[i].setEng(scan.nextInt());
			System.out.printf("%s�� �������� �Է�: ", students[i].getName());
			students[i].setSci(scan.nextInt());
			System.out.printf("%s�� ��ȸ���� �Է�: ", students[i].getName());
			students[i].setSoc(scan.nextInt());
			System.out.printf("%s�� �������� �Է�: ", students[i].getName());
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
		System.out.println("\n�б� ����: ");
		for(Student z : students) {
			System.out.printf("%d�� %s, ���� %d, ��� %.2f\n", r++, 
					z.getName(), z.getTotal(), z.getAvg());
			
		}
		
		scan.close();
	}
}
