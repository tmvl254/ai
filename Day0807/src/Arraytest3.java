
public class Arraytest3 {

	public static void main(String[] args) {
		//이차원 배열		
		//행열구조(표구조)
		//2X3구조
		
		int [][] a=new int [2][3]; 
	
		//  [0][0]	[0][1]	[0][2]		
		//  [1][0]	[1][1]	[1][2]		
		
		a [0][0]= 20;
		a [0][1]= 30;
		a [0][2]= 25;
		a [1][0]= 10;
		a [1][1]= 45;
		a [1][2]= 35;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.println("a["+i+"]"+"["+j+"]="+a[i][j]+" ");
				
			}

		}
	
	}

}
