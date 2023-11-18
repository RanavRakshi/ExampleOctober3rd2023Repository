package p1;

public class IndependentClassP1Package 
{
	Protection o=new Protection();
	public IndependentClassP1Package()
	{
		System.out.println("It is a protection class constructor");
		//  System.out.println("private: "+o.private_a);
			System.out.println("protected: "+o.protected_b);
			System.out.println("default: "+o.default_c);
			System.out.println("public: "+o.public_d);
			System.out.println("************************************");
	}
}
