import java.util.*;

public class DateExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		String arr[][] = new String[t][1];
		
		for(int i=0;i<t;i++) {
			// �Է�
			String temp = sc.next(); //20201015
			// ������ �ڸ�
			String year =temp.substring(0,4); 	// str.substrig(����(�����ε���), ��(�������ε���+1))
			int years = Integer.parseInt(year);	// String - > Int�� ����ȯ
			// �޷� �ڸ�
			String month = temp.substring(4, 6);
			int months = Integer.parseInt(month);
			// �Ϸ� �ڸ�
			String day = temp.substring(6, 8);
			int days = Integer.parseInt(day);
			
			if(years >= 0 && months >=1 && months <=12 && days < 32) {
				if(months == 1 && days < 32) {
					String result = year+"/"+month+"/"+day;
					arr[i][0] = result;
				}
				else if(months == 2 && days < 29) {
					String result = year+"/"+month+"/"+day;
					arr[i][0] = result;
				}
				else if(months == 3 && days < 32) {
					String result = year+"/"+month+"/"+day;
					arr[i][0] = result;
				}
				else if(months == 4 && days < 31) {
					String result = year+"/"+month+"/"+day;
					arr[i][0] = result;
				}
				else if(months == 5 && days < 32) {
					String result = year+"/"+month+"/"+day;
					arr[i][0] = result;
				}
				else if(months == 6 && days < 31) {
					String result = year+"/"+month+"/"+day;
					arr[i][0] = result;
				}
				else if(months == 7 && days < 32) {
					String result = year+"/"+month+"/"+day;
					arr[i][0] = result;
				}
				else if(months == 8 && days < 32) {
					String result = year+"/"+month+"/"+day;
					arr[i][0] = result;
				}
				else if(months == 9 && days < 31) {
					String result = year+"/"+month+"/"+day;
					arr[i][0] = result;
				}
				else if(months == 10 && days < 32) {
					String result = year+"/"+month+"/"+day;
					arr[i][0] = result;
				}
				else if(months == 11 && days < 31) {
					String result = year+"/"+month+"/"+day;
					arr[i][0] = result;
				}
				else if(months == 12 && days < 32) {
					String result = year+"/"+month+"/"+day;
					arr[i][0] = result;
				}
				else {
					arr[i][0] = "-1";
				}
			}
			else {
				arr[i][0] = "-1";
			}
			
			System.out.println("#"+(i+1)+" "+arr[i][0]);
		}
	}
}
