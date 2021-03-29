package JavaBasics;

public class DataTypes {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		System.out.println(a+b);
		
		String x="Hello";
		String y="world";
        System.out.println(x+y);
		
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println((x+y+a)+b);
		System.out.println(a+b+x+y+a+x+b+y);
		
/*		int i=100;
		int j=200;
		int k=300;
		
		if(i>j & i>k) {
			
			System.out.println("i is biggest");
		}
		else if(j>k){
			
			System.out.println("j is biggest");
		}
		else
			System.out.println("k is biggest");
		
*/		
		int i[]= new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		
		for(int j=0; j<i.length; j++) {
			System.out.println(i[j]);
			
		}
	}
		
}


