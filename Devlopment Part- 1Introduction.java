
													Devlopment Part- 1||Introduction
												======================================

 
----------------
  javac command 
----------------

 -> We can use javac command to compile single or group of java source files.

		javac [option ] Test.java 
		javac [option ] A.java B.java C.java
		javac [option ] *.java 
				 |
			  -version 
			  -d 
			  -source
			  -classPath|-CP
			  
----------------			  
  java Command 	
----------------  

 -> We can use java command to run a single class file.
 
 

		java 		[option]		Test 		A 	B   C 
					   	 |							---------
				     -version 						  |	
				     -d 						command-line argument   
                     -ea|-esa|-dsa|-da
                     -classPath|-CP


 Note:

	- We can compile any number of source at a time but we can run only .class file at a time.
	
	
--------------
  ClassPath 
--------------

 -> ClassPath descripes the location where required .class file are avilable.

 -> Java compiler and JVM will use class path to locate required .class file.

 -> By default JVM will always searched in current working directory for the required .class file.

 -> If we set class path explicitly then JVM will search in our specified class path location and JVM won't search in 
	current working directory.
	
 -> We can set the class path in the following three ways:
 
	1. By using Environment variable class Path.
	
		 - This way of setting class path is parmanet and will be preserved across Systems restarts.
		 
	 	 - Whenever we are installing a parmanet software in our system then this approach is recomanded.
	
	2. At command prompt level by using set command.
		
		------------------------------------
		|set classpath  = c:\durga_classes.|
		------------------------------------
		
		- This way of setting classpath we will preserved only for perticular command prompt. once command prompt closes 
		  automatically classpath lost.
		  
	3. At command level by using -cp option:
	
		--------------------------------
		|java -cp c:\durga_classes Test|
		--------------------------------
			
		- This way of setting classpath will be preserved only for particular command. Once command execution completes 
		  automatically classpath will be lost.


 Note: 

	- Among three ways of setting classpath, Setting classpath at command level is recomanded because depended classes 
	  are different from command to command.
	  
	- Once we set the classpath we can run our program from any location.	  
	
	- Once we set classpath JVM won't search in current working directory and it will always in the specified classpath
	  location only.
	  
	class Test 
	{
		public static void main(String args[])
		{
			System.out.println("ClassPath Demo");
		}
	}
	
	C:\durga_class > javac Test.java 			D:\> java -cp C:\durga_class Test 
	                                            
	C:\durga_class > java Test                  	Class Path Demo 
	                                            	
		Class Path Demo                         E:\> java -cp C:\durga_class Test 
                                                
	C:\> java Test                              	Class Path Demo 
	                                            	
		RE: NoClassDefFoundError: Test          C:\durga_class> java -cp E: Test 
		                                        
	C:\> java -cp C:\durga_class Test           		RE: NoClassDefFoundError:Test
	                                            		
		Class Path Demo                         C:\durga_class> java -cp .;E: Test 
		                                        
	                                            	Class Path Demo 

	
			C:															D: 
			
	public class AStudent										public class ItIndustry 
	{                                                           {
		public void m1()                                        	
		{                                                       	public static void main(String args[])
			System.out.println("I want job Immediatly");        	{
		}                                                       		AStudent a1 = new AStudent();
	}                                                           		a1.m1();
	                                                            		System.out.println("You will get soon");
	                                                            	}
	                                                            }
	
	
	C:\> javac AStudent.java 					D:\> java ItIndustry
	                                            
	D:\ > javac ItIndustry.java                 	RE: NoClassDefFoundError:AStudent
		                                        
	  CE: cannot find symbol                    D:\> java -cp C: ItIndustry
	  Symbol: class AStudent                    
	  location: class ItIndustry                	RE: NoClassDefFoundError: ItIndustry
	                                            	
	D:\> javac -cp C: ItIndustry.java           D:\> java -cp .;C: ItIndustry
	                                            
	                                            E:\> java -cp D:;C: ItIndustry	
	
	
	
			C:												D:						
	        |-pack1											|-pack3
				|-pack2											|-pack4
					|-Kareena.class									|-Saif.class 	
	package pack1.pack2;                            package pack3.pack4;
													import pack1.pack2.Kareena;
	public class Kareena                            public class Saif 
	{                                               {
		public void m1()                            	public void m2()
		{                                           	{
			System.out.println("Hello Saif,Can"     
			+"u plz set hello tune");               	 Kareena k = new Kareena();
		}                                           	 k.m1();
	}                                               	 System.out.println("No possible because i m in SCJP class");
	                                                	}
	                                                }
	                                                		
									E:			
									|-Durga.class 
									
	                        import pack3.pack4.Saif;
	                        public class Durga
	                        {
	                        	public static void main(String args[])
	                        	{
	                        		Saif f = new Saif();
	                        		s.m2();
	                        		System.out.println("Hello kareen Can i help you");
	                        	}
	                        }
	
	
	
	C:\> javac -d . Kareena.java						E:\> javac -cp D: Durga.java 
	                                                    	
	D:\> javac -d . Saif.java                           E:\> java Durga 
		                                                
		CE: cannot find Symbol                            RE: NoClassDefFoundError:pack3.pack4.Saif
		Symbol: class Kareena                             
		Location: class pack3.pack4.saif                E:\> java -cp .;D: Durga;
		                                                
	D:\> javac -d . -cp C: Saif.java                      RE: NoClassDefFoundError:pack1.pack2.Kareena
                                                          
	E:\> javac Durga.java                               E:\> java -cp .;D:;C: Durga
                                                        
		CE: Cannot find Symbol                          F:\> java -cp E:;D:;C: Durga 	
		Symbol: class Saif
		Location: class Durga 
		
----------------	
  Conclusion 	
----------------

	- If any location created because of package statement that location should be resolved by using import statement.
	  And base package location we have to update in classpath.
	
	- Compiler will check only one level dependency where as JVM will check all levels of dependency.
	
	- In classpath the order of location is important and JVM will always considard from left to right until required 
	  match available.
	
		
		C: 											
		                                            	D:
	public class Naga                               	
	{                                               public class Naga 
		public static void main(String args[])      {
		{                                           	public static void main(String args[])
			System.out.println("C: Naga");          	{
		}                                           		System.out.println("D: Naga");
	}                                               	}
	                                                }
	
		E: 
		
	public class Naga 
	{														java -cp D:;C:;E: Naga 
		public static void main(String args[])              
		{                                                   	D: Naga 
			System.out.println("E: Naga");                  	
		}                                                   java -cp E:;D:;C: Naga 
	}	                                                    
	                                                        	E: Naga 
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
	
	
	
	