package Assignment2;

public class MainClass {

 static void overloadedMethod(TestA a)
	    {
	 System.out.println("ONE");
         }
	    static void overloadedMethod(TestB b)
	    {
	        System.out.println("TWO");
	    }
        static void overloadedMethod(Object obj)
	    {
	        System.out.println("THREE");
	    }
	    public static void main(String[] args)
	    {
	    	Testc c= new Testc();
             overloadedMethod(c);
             TestA b =  new TestB();
             overloadedMethod(b);
	    }

}

