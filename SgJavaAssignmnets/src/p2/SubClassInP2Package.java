package p2;

import p1.Protection;
public class SubClassInP2Package extends Protection
{
	public SubClassInP2Package()
	{
		System.out.println("It is a protection class constructor");
		//  System.out.println("private: "+private_a);
			System.out.println("protected: "+protected_b);
		//	System.out.println("default: "+default_c);
			System.out.println("public: "+public_d);
			System.out.println("************************************");
	}
}
