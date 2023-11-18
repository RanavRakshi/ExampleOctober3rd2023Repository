package p2;

import p1.Protection;

public class IndependentClassP2Package 
{
	Protection o=new Protection();
		public IndependentClassP2Package()
		{
				System.out.println("It is a Indipendent class ");
			//  System.out.println("private: "+o.private_a);
			//	System.out.println("protected: "+o.protected_b);
			//	System.out.println("default: "+o.default_c);
				System.out.println("public: "+o.public_d);
				System.out.println("************************************");
			
		}
	
}
