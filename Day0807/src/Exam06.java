import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {

//		int [][] a= {
//				{95,86},
//				{83,92,96},
//				{78,83,93,87,88}
//		};
//		
//		int [][] a1= new int[3][];
//		a1[0]= new int[2];
//		a1[1]= new int[3];
//		a1[2]= new int[5];
//		
//		a1[0][0]= 95;
//		a1[0][1]= 86;
//		a1[1][0]= 83;
//		a1[1][1]= 92;
//		a1[1][2]= 96;
//		a1[2][0]= 78;
//		a1[2][1]= 83;
//		a1[2][2]= 93;
//		a1[2][3]= 87;
//		a1[2][4]= 88;
//		
//		for(int i=0; i<a.length; i++) {
//			for(int j=0; j<a[i].length; j++) {
//				System.out.print(a1[i][j]+" ");
//			}
//			System.out.println("");
//		}
		
//		int [] a= {1, 5, 3, 8, 2};
//		int max= -1;
//		int min= 100;
		
//		for(int i=0; i<a.length; i++) {
//			if(max<a[i]) {
//				max= a[i];
//			}
//			else {
//				System.out.println(max);
//				
//			}
//		}
//		
//		for(int i=0; i<a.length; i++) {
//			max = Math.max(max, a[i]);
//		}
//		
//		for(int i=0; i<a.length; i++) {
//			min = Math.min(min, a[i]);
//		}
//		
//		System.out.println(max);
//		System.out.println(min);
			
//		int [][] a= {
//		{95,86},
//		{83,92,96},
//		{78,83,93,87,88}
//		};
		
//		int b=0; //합
//		double c=0; //평균
//		int count=0;
//		
//		int [][] a1= new int[3][];
//		a1[0]= new int[2];
//		a1[1]= new int[3];
//		a1[2]= new int[5];
//
//		a1[0][0]= 95;
//		a1[0][1]= 86;
//		a1[1][0]= 83;
//		a1[1][1]= 92;
//		a1[1][2]= 96;
//		a1[2][0]= 78;
//		a1[2][1]= 83;
//		a1[2][2]= 93;
//		a1[2][3]= 87;
//		a1[2][4]= 88;
//
//		for(int i=0; i<a1.length; i++) {
//			for(int j=0; j<a1[i].length; j++) {
//				b+=a1[i][j];
//				count++;
//			}
//			c = (double)b/count;
//		}
//		System.out.println("합="+b);
//		System.out.printf("평균:%4.1f", c);
		
		 boolean run = true;

		 int studentNum = 0;
		 int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		 while(run) {
		 System.out.println("--------------------------------------------------------------");
		 System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		 System.out.println("--------------------------------------------------------------");
		 System.out.print("선택> ");

		 int selectNo = scanner.nextInt();

		 if(selectNo == 1) {
		 System.out.print("학생수> ");
		 studentNum = scanner.nextInt();
		 scores = new int[studentNum];
		 } else if(selectNo == 2) {
			 for(int i=0; i<scores.length; i++) {
			 System.out.print("scores[" + i + "]> ");
			 scores[i] = scanner.nextInt();
			 }
		 } else if(selectNo == 3) {
			 for(int i=0; i<scores.length; i++) {
			 System.out.println("scores[" + i + "]: " + scores[i]);
			 }
		 } else if(selectNo == 4) {
			 int max = 0;
			 int sum = 0;
			 double avg = 0;
			 for(int i= 0; i<scores.length; i++) {
			 max = (max<scores[i])? scores[i] : max;
			 sum += scores[i];
			 }
			 avg = (double) sum / studentNum;
			 System.out.println("최고 점수: " + max);
			 System.out.println("평균 점수: " + avg);
		 } else if(selectNo == 5) {
			 run = false;
		 }
		}

		 System.out.println("프로그램 종료");
		
	}

}
