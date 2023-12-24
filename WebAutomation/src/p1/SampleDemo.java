package p1;

class Sample
{
	private Sample() {
		
	}
	
	static Sample method1(int x,int y)
	{
		return new Sample();
	}
	
	void method2(int x,int y)
	{
		int res=(x*y);
		System.out.println("Welcome to coding practice: "+res);
	}
}

public class SampleDemo {

	public static void main(String[] args) {
		int a=2; int b=5;
		Sample.method1(a, b).method2(a,b);

	}

}
