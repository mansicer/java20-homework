import java.util.Scanner;

public class MySort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ����ĸ�����");
		int n = sc.nextInt();
		int item[] = new int[n];
		System.out.println("������" + n + "������");
		for (int i = 0; i < n; i++) {
			item[i] = sc.nextInt();
		}
		
		
		//ð������
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (item[j] > item[j + 1]) {
					int temp = item[j];
					item[j] = item[j + 1];
					item[j + 1] = temp;
				}
			}
		}
		
		
		System.out.println("������:");
		for (int i = 0; i < n; i++) {
			System.out.println(item[i]);
		}
	}
}
