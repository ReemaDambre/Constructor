package Constructor_Java;

public class C_02_CoverloadingArugumentType {
	//constructor1
	public C_02_CoverloadingArugumentType(int a, int b) {
		int c =a+b;
		System.out.println("Summation is : "+c);
		
	}
// Constructor 2
	public C_02_CoverloadingArugumentType(double a,double b) 
	{
		double c= a+b;
		System.out.println("Summation is: "+c);
		
	}
	// method
	public void display() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C_02_CoverloadingArugumentType obj1 =new C_02_CoverloadingArugumentType(10,20);
		obj1.display();
		
		C_02_CoverloadingArugumentType obj2 =new C_02_CoverloadingArugumentType(20.55,20.51);
		obj2.display();
		
		

	}

}
