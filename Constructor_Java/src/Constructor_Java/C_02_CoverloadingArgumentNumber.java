package Constructor_Java;

public class C_02_CoverloadingArgumentNumber {
	// constructor 
	public C_02_CoverloadingArgumentNumber(int a,int b) {
		int c =a+b;
		System.out.println("the summation is "+c);
		
		
	}
	//Constructor
	public C_02_CoverloadingArgumentNumber(int a,int b, int c) {
		int d =a+b+c;
		System.out.println("the summation is "+d);
		
			
		}
	//method
	public void display () {
		System.out.println("Constructor overloading is working successfully");
		
	}

	public static void main(String[] args) {
		C_02_CoverloadingArgumentNumber obj = new C_02_CoverloadingArgumentNumber(10,20);
		obj.display ();
		
		C_02_CoverloadingArgumentNumber obj2 = new C_02_CoverloadingArgumentNumber(10,20,30);
		obj.display ();
		

	}

}
