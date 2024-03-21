
												Devlopment Part- 3||Jar vs war vs var||JDK vs JRE VS JVM
											==============================================================

  1. Jar vs war vs ear:
 =======================

----------------------
  Jar(Java Archieve : 
----------------------

  -> It containes a group of .class file.
  
 --------------------------
  War (Web Archieve) file 
 --------------------------
 
  -> A war file reprasents one web application which containes servlets JSP's HTML pages javaScript file etc. The main 
	 advantage of maintaining Web application in the form of war file is project deployment project delivery and project
	 traspotation it will become easy.
	 
  
 -------------------------------
  Ear File Enterprice Archieve 
 -------------------------------
 
  -> An EAR file reprasents one Enterprice Application which containes servlets, JSP's EJB's JMS component etc.
  
  
 Note:

	In general EAR file reprasents a group of WAR files and JAR files.
	

---------------------------------------------
  Web Application vs Enterprice Application	
---------------------------------------------

 -> A web Application can be developed only Web related technologies like Servlets, JSP's , HTML, CSS files, javaScript
	etc.
	
	 EX. 
	 
		Online LibraryManagement System 
		
		Online Shoping cart.
		
 -> An Enterprice Application can be developed by any technology from java|J2EE like servlets, JSP's EJB's JMS component 
	etc.

	Ex. 
	
	
		Baking Application 
		
		Telecome based projects.
		
		
 Note: 
 
	- J2EE or JEE compatable application is Enterprice application.
	

----------------------------------
 Web Server vs Application Server 
----------------------------------

 -> Web Server provides environment to run Web application.

 -> Web Server provides support for web related technologies like Servlets, JSP's HTML ect. 

		Ex .
		
			TOMCAT.
			
 -> Application Server provides environment to run Enterprice Applications
 
 -> Application Server can provide support for any technology like from Java j2EE like servlets, JSP's EJB's JMS component 
	etc.
 
		Ex. 
		
			WebLogic, WebSpear, JBOss ect. 
			
 
 Note: 
 
	- Every Application Server containes In-Build Web Server to provide support for Web related technologies.
	
	- J2EE compatable server is application server. 
	

-------------------------------------	
  How to create executable jar file:
-------------------------------------

 -> 
 
	import java.awt.*;
	import java.awt.event.*;
	public class JarDemo 
	{
		public static void main(String args[])
		{
			Frame f = new Frame();
			f.addWindowListener(new WindowAdapter()
			{
				public void WindowClosing(WindowEvent e)
				{
					for (int i = 0; i<=10; i++)
					{
						System.out.println("I am closing window : "+ i);
						System.exit(0);
					}
				}
			});
			f.add(new Label("I can Create Executable Jar File "));
			f.setSize(500,500);
			f.setVisible(true);
		}
	}
	

				javac 
				  |
		-----------------------		  
		|					  |
	JarDemo.class	   JarDemo$1.class 
	
		
		jar -cvfm demo8.jar Maifest.MF JarDemo.class JarDemo$1.class 
		
		java -jar demo8.jar 


 -> Even we can run jar file by double clicking.


 --------------------------------------
   How many way to run a java program 
 --------------------------------------

	1. From command prompt we can run .class file with java command 
	
		java JarDemo 
		
	2. From command prompt we ca run .jar file with java command.
	
		java -jar demo8.jar 
		
	3. By double clicking jar file 
	
	4. By double clicking a batch file 


 -> A batch file containes a group of commands whenever we double click a batch file then all command will executed one by 
	one in the sequance 
	
	
		----------------------------------
		|								 |	
		|java -cp C:\durga-class JarDemo |
		|                                |
		|                                |
		|                                |
		|                                |
		|                                |
		|                                |
        |                                |
        |                                |
        |                                |
        |                                |
		----------------------------------
					abc.bat 
				
------------------------------------------
  Difference between Path and classpath 
------------------------------------------

  classpath :

		1. classpath describes the location where required .class files available are available.
		
		2. Java compiler and JVM will use classpath to locate required class files if we are not setting classpath then 
		   our program may not compile and may not run.
		   
   Path :-

		1. Path describes the location where required binary executable are available.
		
		2. If we are not setting path then javac and java commands won't work.
		
		
			Set path=C:\Program Files\java\jdk1.6.011\bin
			
--------------------------------------	
 Difference between JDK, JRE, and JVM 
--------------------------------------


  JDK(Java Development Kit :-

		1. JDK provide environment to develop and run java applications.
		
  JRE(Java Runtime environment) :-
  
		1. JRE provides environment to run java application.
		
  JVM(Java Virtual Machine):-
  
  
		1. JVM is responsible to run java program line by line hence it is an Interpritor.




											    JDK 
							------------------------------------------------
							|											   |	
							|			  JRE                              |
							|	 -----------------------                   |
                            |    |				       |                   |
                            |    |				       |                   |
                            |    |  ---------          |                   |	JDK = JRE+Development tools 	
                            |    |  |       |          |                   |	JRE = JVM+library classes 
                            |    |  |  JVM  |+Library  |                   |
                            |    |  |       | classes  | + Development     |
                            |    |  ---------          |	 tools 	       |
                            |    |                     |                   |
                            |    |                     |                   |
                            |    |                     |				   |			
                            |    |                     |                   |
                            |    |                     |                   |
                            |    -----------------------                   |
                            |                                              |
                            ------------------------------------------------
                            
		2. JVM is the part of JRE where as JRE is a part of JDK 


  Note: 

	-> On the Developers machine we have to install JDK where as on the client machine we have to install JRE.


---------------------------------------------
  Difference between Java, Javaw and Javaws 
----------------------------------------------

   java :-
   
	 1. We can use java command to run a java class file where SOP's will be executed and currsponding output will be 
		to the console 
		
		
   javaW(java Without console output):-

	 1. We can use javaw command to run a java class file where SOP's will be executed but the currsponding output won't 
		be display to the console.
		
	 2. In general we can use javaw command to run GUI based applications.

	 
				import java.io.*;
				class Test 
				{
					public static void main(String args[])throws IOException
					{
						System.out.println("Console Output");
						PrintWriter pw = new PrintWriter("abc.txt");
						pw.println("File output");
						pw.flush();
					}
				}
	
	javaws (java Web start utility ):-
	
	 1. We can use javaws to download a java application from the web and to start it's execution.
	 
	 2. We can use javaws command as follows 
	 
			javaws jnlp_url
	  
	 3. It downloads the application from the specified URL and starts execution.

	 4. The main advantage in this approach is every end user will get updated version and Inhancement will become easy 
		because of centralized crontroll.







  