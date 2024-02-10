package p1;

class Sample1
{
	static Sample1 demo1()
	{
		return new Sample1();
	}
	
	Sample12 demo2()
	{
		Sample12 obj=new Sample12();
		return obj;
	}
}

class Sample12
{
	void demo3()
	{
		System.out.println("Welcome to demo3 method execution!!!!!!!!!!");
	}
}

public class SampleDemo1 {

	public static void main(String[] args) {
		
		Sample1.demo1().demo2().demo3();
		
	}

}
