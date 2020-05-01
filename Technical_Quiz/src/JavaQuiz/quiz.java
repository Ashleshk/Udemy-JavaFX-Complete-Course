package JavaQuiz;


public class quiz {
	
	
	static String[][] qpa = new String[10][5];
	static String[][] qpa1 = new String[10][5];
	static String[][] qpa2 = new String[10][5];
	

    public static String[][] setQuiz0()
	{
		 qpa[0][0]="What displays from the following statements? String word = abcde; \n for(int i=0; i<4; i+=2) System.out.print(word[i]);\n";
         qpa[0][1]="ab";
         qpa[0][2]="ac";
         qpa[0][3]="ace";
         qpa[0][4]="bd";

         qpa[1][0]="What is the default value of the local variables?";
         qpa[1][1]="Null";
         qpa[1][2]="0";
         qpa[1][3]="Depends on the data type";
         qpa[1][4]="No default value for local variables";
        
         qpa[2][0]="What is a loop?";
         qpa[2][1]="A new type of Applet";
         qpa[2][2]="A segment of code to be run a specified amount of times";
         qpa[2][3]="A segment of code to be run infinite times";
         qpa[2][4]="A segment of code to be run once";

         qpa[3][0]="Following code will result in: int a1 = 5; double a2 = (float)a1;";
         qpa[3][1]="Compilation error";
         qpa[3][2]="Runtime error";
         qpa[3][3]="No errors";
         qpa[3][4]="None of above";

         qpa[4][0]="What is the highest index value associated with the array the follows?\r\n" + 
         		"Byte[] values = new bytes[x];\r\n";
         qpa[4][1]="0";
         qpa[4][2]="x";
         qpa[4][3]="x-1";
         qpa[4][4]="x+1";

         qpa[5][0]="What is the only type of exception that is NOT checked?";
         qpa[5][1]="Class Exception";
         qpa[5][2]="Class RunTimeException and its subclasses";
         qpa[5][3]="Class IOException and its subclasses";
         qpa[5][4]="Class ArithmeticException only";

         qpa[6][0]="What method of an Exception object returns a message string?";
         qpa[6][1]="getError()";
         qpa[6][2]="getMessage()";
         qpa[6][3]="printMessage()";
         qpa[6][4]="traceMessage()";

         qpa[7][0]="What type of exception is thrown by parseInt() if it gets illegal data?";
         qpa[7][1]="ArithmeticException";
         qpa[7][2]="RunTimeException";
         qpa[7][3]="NumberFormatException";
         qpa[7][4]="NumberError";

         qpa[8][0]="When is a finally{} block executed?";
         qpa[8][1]="Only when an unhandled exception is thrown in a try{} block";
         qpa[8][2]="Only when any exception is thrown in a try{} block";
         qpa[8][3]="Always after execution has left a try{} block, no matter for what reason";
         qpa[8][4]="Always just as a method is about to finish";

         qpa[9][0]="Which of the following will not directly cause a thread to stop?";
         qpa[9][1]="notify()";
         qpa[9][2]="wait()";
         qpa[9][3]="InputStream access";
         qpa[9][4]="sleep()";
         
        
		 return qpa;
		
	}
	

    public static String[][] setQuiz1()
	{
		 qpa1[0][0]="What is the size of a Char in Java?";
         qpa1[0][1]="4 bits";
         qpa1[0][2]="7 bits";
         qpa1[0][3]="8 bits";
         qpa1[0][4]="16 bits";

         qpa1[1][0]="Java runs on -------";
         qpa1[1][1]="Windows";
         qpa1[1][2]="Unix/Linux";
         qpa1[1][3]="Mac";
         qpa1[1][4]="All of the above";
        
         qpa1[2][0]="Following code will result in: int num = 6.7;";
         qpa1[2][1]="Compilation error";
         qpa1[2][2]="Runtime error";
         qpa1[2][3]="Num being 6.7";
         qpa1[2][4]="Num beging 6";

         qpa1[3][0]="What will be the ouput of the following code? Int[] arr = new int[9]; \n System.out.println(arr[0]);";
         qpa1[3][1]="0";
         qpa1[3][2]="Some Junk Value";
         qpa1[3][3]="Error because array is not initialized ";
         qpa1[3][4]="Error because index must be greater than 0";

         qpa1[4][0]="The length of the following array is int[] grades = new int[4];";
         qpa1[4][1]="0";
         qpa1[4][2]="3";
         qpa1[4][3]="4";
         qpa1[4][4]="5";

         qpa1[5][0]="Keyword which is used to access the method or member variables from the \n superclass";
         qpa1[5][1]="super";
         qpa1[5][2]="using";
         qpa1[5][3]="is_a";
         qpa1[5][4]="has_a";

         qpa1[6][0]="Constructors are used to";
         qpa1[6][1]="To build a user interface";
         qpa1[6][2]="Free memory";
         qpa1[6][3]="Initialize a newly created object";
         qpa1[6][4]="To create a sub class";

         qpa1[7][0]="What method of an Exception object prints a list of methods that were called \n before the exception was thrown?";
         qpa1[7][1]="printErrors()";
         qpa1[7][2]="getMessage()";
         qpa1[7][3]="printStackTrace()";
         qpa1[7][4]="traceStack()";

         qpa1[8][0]="What happens during execution if an negative value is used for an array \n index?";
         qpa1[8][1]="An IndexOutOfBoundsException is thrown";
         qpa1[8][2]="A NumberFormatException is thrown";
         qpa1[8][3]="The first slot of the array is used";
         qpa1[8][4]="This is an Error, so the program immediately terminates no matter what";

         qpa1[9][0]="When is a finally{} block executed?";
         qpa1[9][1]="Only when an unhandled exception is thrown in a try{} block";
         qpa1[9][2]="Only when any exception is thrown in a try{} block";
         qpa1[9][3]="Always after execution has left a try{} block, no matter for what reason";
         qpa1[9][4]="Always just as a method is about to finish";
		
        
		return qpa1;
		
	}
	

    public static String[][] setQuiz2()
	{
		qpa2[0][0]="What is the default value of the local variables?";
        qpa2[0][1]="Null";
        qpa2[0][2]="0";
        qpa2[0][3]="Depends on the data type";
        qpa2[0][4]="No default value for local variables";

        qpa2[1][0]="Following code will result in: int num = 6.7;";
        qpa2[1][1]="Compilation error";
        qpa2[1][2]="Runtime error";
        qpa2[1][3]="Num being 6.7";
        qpa2[1][4]="Num beging 6";
       
        qpa2[2][0]="What is the highest index value associated with the array the follows?\r\n" + 
        		   "Byte[] values = new bytes[x];\r\n";
        qpa2[2][1]="0";
        qpa2[2][2]="x";
        qpa2[2][3]="x-1";
        qpa2[2][4]="x+1";

        qpa2[3][0]="Constructors are used to";
        qpa2[3][1]="To build a user interface";
        qpa2[3][2]="Free memory";
        qpa2[3][3]="Initialize a newly created object";
        qpa2[3][4]="To create a sub class";

        qpa2[4][0]="What happens during execution if an negative value is used for an array \n index?";
        qpa2[4][1]="An IndexOutOfBoundsException is thrown";
        qpa2[4][2]="A NumberFormatException is thrown";
        qpa2[4][3]="The first slot of the array is used";
        qpa2[4][4]="This is an Error, so the program immediately terminates no matter what";


        qpa2[5][0]="Which class or interface defines the wait(), notify(),and notifyAll() methods?";
        qpa2[5][1]="Object";
        qpa2[5][2]="Thread";
        qpa2[5][3]="Runnable";
        qpa2[5][4]="Class";

        qpa2[6][0]="What is the size of a Char in Java?";
        qpa2[6][1]="4 bits";
        qpa2[6][2]="7 bits";
        qpa2[6][3]="8 bits";
        qpa2[6][4]="16 bits";

        qpa2[7][0]="What is the difference between private and public functions ?";
        qpa2[7][1]="Public functions are free, you have to buy private ones";
        qpa2[7][2]="Public functions are the only ones you can download";
        qpa2[7][3]="Public functions can be used by anyone,private can only be used by other code in the class";
        qpa2[7][4]="Public functions can�t be used";

        qpa2[8][0]="How many JDBC driver types does Sun define?";
        qpa2[8][1]="1";
        qpa2[8][2]="2";
        qpa2[8][3]="3";
        qpa2[8][4]="4";

        qpa2[9][0]="________ is an open source DBMS product that runs on UNIX, Linux and \n Windows";
        qpa2[9][1]="MySQL";
        qpa2[9][2]="JSP/SQL";
        qpa2[9][3]="JDBC/SQL";
        qpa2[9][4]="Sun ACCESS";
		
        
	    return qpa2;
	}
	
	
}
