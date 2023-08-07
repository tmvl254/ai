
public class Arraytest1 {

	public static void main(String[] args) {
		//배열을 이용하여 10개의 정수를 저장하고 평균을 구하라.
		
		//1.배열선언
		int [] a;
		
		//2. 배열초기화
		a= new int[10];
		
		//3. 명시적 초기화
		a[0]= 82;
		a[1]= 84;
		
		//4. 배열선언과 초기화 동시에
		int[] b = {84,58,78,54,12,89,88,65,74,54};
		
		//5. 원소의 값으 꺼내서 합산 후 배열 갯수로 나눈다.
		for(int i=0; i<10; i++){
			System.out.print(b[i]+" ");
		}
		System.out.println();
		
		int sum= 0;
		for(int i=0; i<10; i++){
			sum= sum + b[i];
		}
		System.out.println("평균:"+sum / b.length);
		
		b[4]=80; //수정
		
		for(int i=0; i<10; i++){
			System.out.print(b[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<10; i++){
			sum= sum + b[i];
		}
		System.out.println("평균:"+sum / b.length);
		
	}

}
