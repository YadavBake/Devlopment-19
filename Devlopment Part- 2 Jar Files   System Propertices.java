
										Devlopment Part- 2||Jar Files || System Propertices
									=========================================================


 -> All third party software plugings are by default available in the form of JAR file only.

	Ex. 
	
		- To develop a servlet all dependend classes are available in Servlet-api.jar
		  we have to place this JAR in classpath to compile a servlet program.
		  
 -> To run a JDBC program all dependend classes ar available in OJDBC14.jar.
 
	Ex. 
		- To run JDBC program we have to place this jar file in classpath.
		

 -> To use log4j in our application dependend classes are available in log4j.jar.
 
	
	Ex.
	
		- We have to place this jar in the classpath then only log4j based application can run.
		
-------------------
 Various commands 
-------------------

 1. To create a Jar file (Zip file ) :

	 - jar -cvf durgacalc.jar  Test.class 
	 
	 - jar -cvf durgacalc.jar A.class B.class C.class 
	 
	 - jar -cvf durgacalc.jar *.class 
	 
	 - jar -cvf durgacalc.jar *.*
	 
 2. To extract a jar file (unZip file)

	- Jar - xvf durgacalc.jar 
	

 3. To display table of contents:

	- Jar -tvf durgacalc.jar 
	
 
 
 
  Service Provider role:							  Clients Role    
                                                      
	public class DurgaColorFullCalc                   He downloaded jar file and he placed in D: of clients machine
	{                                                 
		public static void add(int x, int y)          	class Bakara 
		{                                             	{
			System.out.println(x*y);                  		public static void main(String args[])
		}                                             		{
		                                              			DurgaColorFullCalc.add(10,20);
		public static void multiply(int x, int y)     			DurgaColorFullCalc.multiply(10,20);
		{                                             		}
			System.out.println(2*x*y);                	}
		}                                             	
	}                                                 		C:\durga-class> javac Bakar.java // invalid CE: 
	                                                  		
		javac DurgaColorFullCalc.java                 		C:\durga-class> javac -cp D: Bakara.java //invalid CE: 
		                                              		
		Jar -cvf durgaCalc.jar DurgaColorFullCalc.clas		C:\durga-class> javac -cp D:\durgaCalc.jar Bakara.java s 
                                                      		
                                                      		C:\durga-class> java Bakara // invalid RE: NoClassDefFoundError:DurgaColorFullCalc
                                                      
                                                      		C:\durga-class> java -cp D: Bakara // RE :NoClassDefFoundError: Bakara 
                                                      		
                                                      		C:\durga-class> java -cp .;D: Bakara // RE: NoClassDefFoundError: DurgaColorFullCalc
                                                      		
                                                      		C:\durga-class> java -cp .;D:\durgaCalc.jar Bakara
                                                      		
                                                      						200
                                                      						400

 Note: 
 
	- To place .class file in classpath just location is enough but to make jar file available in classpath location 
	  is not enough compulsory we have to include name of the jar file also.
	  
----------------------------------------------	  
 Shortcut way to place Jar file in classpath
----------------------------------------------

 -> IF we place jar file the following location then all classes and interfaces prasent in the jar file by default 
    available to java compiler and JVM we are not required to set classpath explicitly.

		JDK
		 |-JRE 
			|-lib 
			   |-ext 
				  |-*.jar place in this location.

----------------------
  System properties 
----------------------
 
 -> For system some persistance information will be maintaine in the form of system properties.	
 
 -> This include name of the OS, java version , JVM vendor, user Contry etc. 
 
 -> Demo program to print System properties.

	import java.util.*;
	class Test 
	{
		public static void main(String args[])
		{
			Properties p = System.getProperties();
			p.list(System.out);
		}
	}
		
 -> We can set system property explicitly from the command prompt by using -D option 
 
	java -D (To set system properties)
	
						|-->property value 
	java -D     durga=ocjp Test 						== java -Ddurga=ocjp Test 
		  |		  |	
		To set   property	
		system	 name 
		property

 -> The main advantage of setting system property is we can customize behavior of java program.
 
	class Test 
	{
		public static void main(String args[])
		{
			String course = System.getProperty("course");
			if(course.equals("scjp"))
			{
				System.out.println("scjp information");
			}
			else 
			{
				System.out.println("Other course information");
			}
		}
	}

	D:\java_note_Durga_sir\Devlopment - 19>java -Dcourse=scjp Test1
			
			scjp information

	D:\java_note_Durga_sir\Devlopment - 19>java -Dcourse=scwcd Test1
			
			Other course information



























 
 


















 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 