package P1;

import java.io.FileReader;

// Throws Keyword in to the java is used to hnadle the Exception Throws Keyword is Applied on to the Methods Its Doesnot Applied on
// to the Class , Variable And Only Applicible on to the MEthods And if Any Exceptoin occurs in to the Methods than throws Keyword handover that 
// Exceptoin to the Calling Statement of the Methods and After the Surrounding that Calling Statement with to the try and catch block 
// We will be handel the Exception in to the jAVa 
public class A {
	
	public static void main(String[] args) throws Exception {
		
		A a1 = new A ();
		
			a1.test();
		
		
	}
	public void test()  throws Exception{
		
		FileReader fr = new FileReader("C:///files Concepts"); // Compiler time Exception 
		
		
		
		
	}

}
