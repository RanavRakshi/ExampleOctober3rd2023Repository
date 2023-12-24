package p1;

class Sample2
{
	static Sample2 Demo1()
	{
		return new Sample2();
	}
	
	Sample2 Demo2()
	{
		return new Sample2();
	}
	
	Sample21 Demo3()
	{
		Sample21 obj=new Sample21();
		return obj;
	}
}

class Sample21
{
	void Demo4()
	{
		System.out.println("Welcome to demo4 method execution!!!!!!!!!!");
	}
}

public class SampleDemo2 {

	public static void main(String[] args) {
		
		Sample2.Demo1().Demo2().Demo3().Demo4();
	}

}
