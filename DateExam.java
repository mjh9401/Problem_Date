import java.util.*;

public class DateExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		String arr[][] = new String[t][1];
		
		for(int i=0;i<t;i++) {
			// 입력
			String temp = sc.next(); //20201015
			// 연도로 자름
			String year =temp.substring(0,4); 	// str.substrig(시작(시작인덱스), 끝(마지막인덱스+1))
			int years = Integer.parseInt(year);	// String - > Int로 형변환
			// 달로 자름
			String month = temp.substring(4, 6);
			int months = Integer.parseInt(month);
			// 일로 자름
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
