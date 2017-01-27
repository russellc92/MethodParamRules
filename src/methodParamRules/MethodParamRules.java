package methodParamRules;

public class MethodParamRules {

	//void probe(int... x){ System.out.println("In ..."); } // 1
	
	//void probe(Integer x){ System.out.println("In Integer"); } // 2
	
	void probe(long x){ System.out.println("In long"); } // 3
	
	//void probe(Long x){ System.out.println("In LONG"); } // 4
	
	public static void main(String[] args) {

		Integer a = 15;
		
		new MethodParamRules().probe(a);
		
		int b = 10;
		
		new MethodParamRules().probe(b);
		
		
		
		
		
		int counter = 0;
		
		do {
			//System.out.println(counter);
			counter++;
		} while(counter != 0);
		
		B bb=new B();
		B bbb=new B();
		System.out.println(B.temp);
		

	}
}
