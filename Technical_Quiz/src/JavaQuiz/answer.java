package JavaQuiz;


public class answer {

	static String[][] qca = new String[15][2];
    static String[][] qca1 = new String[15][2];
    static String[][] qca2 = new String[15][2];
    static String[][] qca3= new String[15][2];
    static String[][] qca4= new String[15][2];
    static String[][] qca5= new String[15][2];
    static String[][] qca6= new String[15][2];

    public static String[][] getAnswerqca()
	{
		        
         qca[0][0]="What displays from the following statements? String word = �abcde�; \n for(int i=0; i<4; i+=2) System.out.print(word[i]);\n";
         qca[0][1]="ac";

         qca[1][0]="What is the default value of the local variables?";
         qca[1][1]="No default value for local variables";

         qca[2][0]="What is a loop?";
         qca[2][1]="A segment of code to be run a specified amount of times";

         qca[3][0]="Following code will result in: int a1 = 5; double a2 = (float)a1;";
         qca[3][1]="No errors";

         qca[4][0]="What is the highest index value associated with the array the follows?\r\n" + 
          		"Byte[] values = new bytes[x];\r\n";
         qca[4][1]="x-1";

         qca[5][0]="What is the only type of exception that is NOT checked?";
         qca[5][1]="Class RunTimeException and its subclasses";

         qca[6][0]="What method of an Exception object returns a message string?";
         qca[6][1]="getMessage()";
        
         qca[7][0]="What type of exception is thrown by parseInt() if it gets illegal data?";
         qca[7][1]="NumberFormatException";
        
         qca[8][0]="When is a finally{} block executed?";
         qca[8][1]="Always after execution has left a try{} block, no matter for what reason";

         qca[9][0]="Which of the following will not directly cause a thread to stop?";
         qca[9][1]="notify()";
         
         qca[10][0]="Which tag of DD maps internal name of servlet to public URL pattern?";
         qca[10][1]="servlet-mapping";
         
         qca[11][0]="Which life cycle metod is called once in servlet life?";
         qca[11][1]="init()";
         
         qca[12][0]="Which http method is idempotent?";
         qca[12][1]="get";
         
         qca[13][0]="Which of these life-cycle method you can over-ride in your class?";
         qca[13][1]="All of these";
         
         qca[14][0]="Which statements is not true about ServletConfig?";
         qca[14][1]="There is one servlet config per one application";
         
         
		
		return qca;
		
	}
	

    public static String[][] getAnswerqca1()
	{
		        
         qca1[0][0]="What is the size of a Char in Java?";
         qca1[0][1]="16 bits";

         qca1[1][0]="Java runs on -------";
         qca1[1][1]="All of the above";

         qca1[2][0]="Following code will result in: int num = 6.7;";
         qca1[2][1]="Compilation error";

         qca1[3][0]="What will be the ouput of the following code?\r\n" + 
         		   "Int[] arr = new int[9]; System.out.println(arr[0]);\r\n";
         qca1[3][1]="0";

         qca1[4][0]="The length of the following array is int[] grades = new int[4];";
         qca1[4][1]="4";

         qca1[5][0]="Keyword which is used to access the method or member variables from the superclass";
         qca1[5][1]="super";

         qca1[6][0]="Constructors are used to";
         qca1[6][1]="Initialize a newly created object";
        
         qca1[7][0]="What method of an Exception object prints a list of methods that were called before the exception was thrown?";
         qca1[7][1]="printStackTrace()";
        
         qca1[8][0]="What happens during execution if an negative value is used for an array index?";
         qca1[8][1]="An IndexOutOfBoundsException is thrown";

         qca1[9][0]="When is a finally{} block executed?";
         qca1[9][1]="Always after execution has left a try{} block, no matter for what reason";
		
         qca1[10][0]="What is the meaning of response.setIntHeader(\"xyz\" ,67); ?";
         qca1[10][1]="Replace the value to integer to existing header or Add a new header with integer value";
         
         qca1[11][0]="Which method shows the client what server is receiving?";
         qca1[11][1]="doTrace";
         
         qca1[12][0]="Which of these is not a Application Server?";
         qca1[12][1]="Apache HTTP Server";
         
         qca1[13][0]="In which folder we can put web.xml?";
         qca1[13][1]="WEB-INF";
         
         qca1[14][0]="Which of these is not webserver?";
         qca1[14][1]="glassfish";
         
		return qca1;
		
	}
	

    public static String[][] getAnswerqca2()
	{
		        
         qca2[0][0]="What is the default value of the local variables?";
         qca2[0][1]="No default value for local variables";

         qca2[1][0]="Following code will result in: int num = 6.7;";
         qca2[1][1]="Compilation error";

         qca2[2][0]="What is the highest index value associated with the array the follows?\r\n" + 
      		        "Byte[] values = new bytes[x];\r\n";
         qca2[2][1]="x-1";

         qca2[3][0]="Constructors are used to";
         qca2[3][1]="Initialize a newly created object";

         qca2[4][0]="What happens during execution if an negative value is used for an array index?";
         qca2[4][1]="An IndexOutOfBoundsException is thrown";

         qca2[5][0]="Which class or interface defines the wait(), notify(),and notifyAll() methods?";
         qca2[5][1]="Object";

         qca2[6][0]="What is the size of a Char in Java?";
         qca2[6][1]="16 bits";
        
         qca2[7][0]="What is the difference between private and public functions ?";
         qca2[7][1]="Public functions can be used by anyone,private can only be used by other code in the class";
        
         qca2[8][0]="How many JDBC driver types does Sun define?";
         qca2[8][1]="4";

         qca2[9][0]="________ is an open source DBMS product that runs on UNIX, Linux and Windows";
         qca2[9][1]="MySQL";
		
         qca2[10][0]="Which statement is not true about ServletContext?";
         qca2[10][1]="There is one ServletContext per one servlet";
         
         qca2[11][0]="Which interface contain servlet life-cycle methods?";
         qca2[11][1]="Servlet";
         
         qca2[12][0]="Which life-cycle method make ready the servlet for garbage collection?";
         qca2[12][1]="destroy";
         
         qca2[13][0]="Which method does not exists in HttpServlet Class?";
         qca2[13][1]="init";
         
         qca2[14][0]="Which method is called when client request come?";
         qca2[14][1]="service()";
         
		return qca2;
		
	}
	

    public static String[][] getAnswerqca3()
	{
		        
         qca3[0][0]="Following code will result in: int a1 = 5; double a2 = (float)a1;";
         qca3[0][1]="No errors";

         qca3[1][0]="What is the highest index value associated with the array the follows?\r\n" + 
   		            "Byte[] values = new bytes[x];\r\n";
         qca3[1][1]="x-1";

         qca3[2][0]="An object that has more than one form is referred to as";
         qca3[2][1]="polymorphism";

         qca3[3][0]="What happens during execution if an negative value is used for an array index?";
         qca3[3][1]="An IndexOutOfBoundsException is thrown";

         qca3[4][0]="How many finally{} blocks may there be in a try/catch structure?";
         qca3[4][1]="There can be zero or one, following the last catch{} block";

         qca3[5][0]="Which cannot directly cause a thread to stop executing?";
         qca3[5][1]="Calling notify() method on an object";

         qca3[6][0]="What displays from the following statements? String word = �abcde�;  for(int i=0; i<4; i+=2)\r\n" + 
      		        "System.out.print(word[i]);\r\n";
         qca3[6][1]="ac";
        
         qca3[7][0]="What is the name of the method used to start a thread execution?";
         qca3[7][1]="start();";
        
         qca3[8][0]="Which method must be defined by a class implementing the java.lang.Runnableinterface?";
         qca3[8][1]="public void run()";

         qca3[9][0]="What happens if a FileWriter constructor is given an illegal file name?";
         qca3[9][1]="An IOException is thrown";
		
         qca3[10][0]="What is the meaning of response.setHeader(\"xyz\", \"abc\");";
         qca3[10][1]="Add a new header and value or add an additional value to exiting header";
         
         qca3[11][0]="Who does controll life-cycle of a servlet?";
         qca3[11][1]="container";
         
         qca3[12][0]="Which tag of DD maps internal name of servlet to fully qualified class name?";
         qca3[12][1]="servlet";
         
         qca3[13][0]="Which tag does not belongs to web.xml?";
         qca3[13][1]="servlet-mappings";
         
         qca3[14][0]="Where we can put jar file?";
         qca3[14][1]="lib";
         
		return qca3;
		
	}
	

    public static String[][] getAnswerqca4()
	{
		        
         qca4[0][0]="What method of an Exception object prints a list of methods that were called before the exception was thrown?";
         qca4[0][1]="printStackTrace()";

         qca4[1][0]="What type of exception is thrown by parseInt() if it gets illegal data?";
         qca4[1][1]="NumberFormatException";

         qca4[2][0]="The length of the following array is int[] grades = new int[4];";
         qca4[2][1]="4";

         qca4[3][0]="What is the only type of exception that is NOT checked?";
         qca4[3][1]="Class RunTimeException and its subclasses";

         qca4[4][0]="Both class Error and class Exception are children of this parent:";
         qca4[4][1]="Throwable";

         qca4[5][0]="What is the name of the method used to start a thread execution?";
         qca4[5][1]="start();";

         qca4[6][0]="Which method must be defined by a class implementing the java.lang.Runnableinterface?";
         qca4[6][1]="public void run()";
        
         qca4[7][0]="Which of the following will directly stop the execution of a Thread?";
         qca4[7][1]="wait()";
        
         qca4[8][0]="When a file is opened for appending where does write() put new text?";
         qca4[8][1]="At the end of the file";

         qca4[9][0]="A program uses the FileWriter constructor with the string newFile.txt. What happens if newFile.txt already exists?";
         qca4[9][1]="The existing file is erased and replace with a new, empty one";
		
         qca4[10][0]="Which tag of DD maps internal name of servlet to public URL pattern?";
         qca4[10][1]="servlet-mapping";
         
         qca4[11][0]="Which life cycle metod is called once in servlet life?";
         qca4[11][1]="init()";
         
         qca4[12][0]="Which http method is idempotent?";
         qca4[12][1]="get";
         
         qca4[13][0]="Which of these life-cycle method you can over-ride in your class?";
         qca4[13][1]="All of these";
         
         qca4[14][0]="Which statements is not true about ServletConfig?";
         qca4[14][1]="There is one servlet config per one application";
         
		return qca4;
		
	}

    public static String[][] getAnswerqca5()
	{
		        
         qca5[0][0]="Following code will result in: int a1 = 5; double a2 = (float)a1;";
         qca5[0][1]="No errors";

         qca5[1][0]="The length of the following array is int[] grades = new int[4];";
         qca5[1][1]="4";

         qca5[2][0]="What class should be used to buffer the characters sent to a FileWriter stream?";
         qca5[2][1]="BufferedWriter";

         qca5[3][0]="What method of File is used to test if a file or directory exists?";
         qca5[3][1]="exists()";

         qca5[4][0]="Which character is used to represent an input parameter in a CallableStatement?";
         qca5[4][1]="?";

         qca5[5][0]="JDBC stands for:";
         qca5[5][1]="Java Database Connectivity";

         qca5[6][0]="What File method is used to remove a file?";
         qca5[6][1]="delete()";
        
         qca5[7][0]="What package holds the File class?";
         qca5[7][1]="java.io";
        
         qca5[8][0]="When a file is opened for appending where does write() put new text?";
         qca5[8][1]="At the end of the file";

         qca5[9][0]="Which of the following will directly stop the execution of a Thread?";
         qca5[9][1]="wait()";
		
         qca5[10][0]="Which statement is not true about ServletContext?";
         qca5[10][1]="There is one ServletContext per one servlet";
         
         qca5[11][0]="Which interface contain servlet life-cycle methods?";
         qca5[11][1]="Servlet";
         
         qca5[12][0]="Which life-cycle method make ready the servlet for garbage collection?";
         qca5[12][1]="destroy";
         
         qca5[13][0]="Which method does not exists in HttpServlet Class?";
         qca5[13][1]="init";
         
         qca5[14][0]="Which method is called when client request come?";
         qca5[14][1]="service()";
         
		return qca5;
		
	}
	

    public static String[][] getAnswerqca6()
	{
		        
         qca6[0][0]="Keyword which is used to access the method or member variables from the superclass";
         qca6[0][1]="super";

         qca6[1][0]="Following code will result in: int a1 = 5; double a2 = (float)a1;";
         qca6[1][1]="No errors";

         qca6[2][0]="What method of an Exception object prints a list of methods that were called before the exception was thrown?";
         qca6[2][1]="printStackTrace()";

         qca6[3][0]="What happens during execution if an negative value is used for an array index?";
         qca6[3][1]="An IndexOutOfBoundsException is thrown";

         qca6[4][0]="Both class Error and class Exception are children of this parent:";
         qca6[4][1]="Throwable";

         qca6[5][0]="Which of the following will not directly cause a thread to stop?";
         qca6[5][1]="notify()";

         qca6[6][0]="Which method must be defined by a class implementing the java.lang.Runnableinterface?";
         qca6[6][1]="public void run()";
        
         qca6[7][0]="What happens if a FileWriter constructor is given an illegal file name?";
         qca6[7][1]="An IOException is thrown";
        
         qca6[8][0]="What package holds the File class?";
         qca6[8][1]="java.io";

         qca6[9][0]="What method of File is used to test if a file or directory exists?";
         qca6[9][1]="exists()";
		
         qca6[10][0]="What is the meaning of response.setHeader(\"xyz\", \"abc\");";
         qca6[10][1]="Add a new header and value or add an additional value to exiting header";
         
         qca6[11][0]="Who does controll life-cycle of a servlet?";
         qca6[11][1]="container";
         
         qca6[12][0]="Which tag of DD maps internal name of servlet to fully qualified class name?";
         qca6[12][1]="servlet";
         
         qca6[13][0]="Which tag does not belongs to web.xml?";
         qca6[13][1]="servlet-mappings";
         
         qca6[14][0]="Where we can put jar file?";
         qca6[14][1]="lib";
         
		return qca6;
		
	}
	
	
}
