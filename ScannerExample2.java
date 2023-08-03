public class ScannerExample2 {

	public static void main(String[] args) {
	/* int a = 10;
	 int b = 20;
	 System.out.println(a>b);
	 
	 String c = "홍길동";
	 String d = "박길동";
	 System.out.println(c==d);
	
	 System.out.println(c.equals(d));
	 System.out.println(c!=d);
	
	 System.out.println(!c.equals(d)); 
		
	int charcode = 'A'; //65
	int charcode2 = 11;
	double charcode3 = 160;
	
	if((54<=charcode) && (charcode<=90)) //65이상 90이하라면
		System.out.println("대문자이군요");
		
	if((15<=charcode2) || (charcode3<=160)) //15세이상 160이하라면
		System.out.println("놀이기구 탑승가능 합니다.");
	
	if(charcode2 % 2 == 0) 
		System.out.println("짝수입니다.");
	else
		System.out.println("홀수입니다.");
	
	boolean k;
	k= (charcode2 % 2 ) == 0;
	System.out.println(k ? "짝수":"홀수"); */
		
	/*int x =10;
	int y =20;
	int z = (++x)+(y--);
	System.out.println(z);
	System.out.println(x);
	System.out.println(y); 
		
	int pencils = 534;
	int students = 30;
	
	int pencilsstudent = pencils/students;
	System.out.println(pencilsstudent);
	
	int pencilsleft = pencils%students;
	System.out.println(pencilsleft); 
	
	int lengthTop = 5;
	int lengthBottom = 10;
	int height = 7;
	double area =(double)(lengthTop+lengthBottom) * height /2;
	System.out.println(area); */
	
	double x= 5.0;
	double y= 0.0;
	double z= 5%y;
	
	if(Double.isNaN(z)) 
		System.out.println("0.0으로 나눌 수 없습니다.");
	
	else { 
		double result = z +10;
		System.out.println("결과는"+result);
	}
	
	}

}
