# FileHandling Programming Assignments

Q1. Write a java program to read a file named input.txt and store each line of a file as string in ArrayList ignore the lines which are started with # character and empty lines?
	Example: Let file input.txt contains the following contents: 
			aaaaa
			abababa
			#acdef
			cabef
			#a
		
	Output : ArrayList contains only the following data
			aaaaa
			abababa
			cabef

Q2:  Write a java program to check whether the string prefix matches the any one of the prefixes mentioned in the file prefix-urlfilter.txt?
	
	Note : The format of this file is one URL prefix per line.    
		Let File contents are 	
		http://
		https://
		ftp://
		file://
	Input1:  http://www.example.com/
	Output1: true
	Input2: https://www.example.com/
	Output2: true
       	Input3:  ftp://www.example.com/
	Output3: true	      
	Input4: file://www.example.com/
	Output4: true
       	Input5 : abcd://www.example.com/
	Output5: false

Q3: Write a java program to read any .java file and remove comments in it?
	Example: Sample java file
				 /**
				* The HelloWorld program implements an application that
				* simply displays "Hello World!" to the standard output.
				*
				* @author  Zara Ali
				* @version 1.0
				* @since   2014-03-31 
				*/
				public class HelloWorld {

				   public static void main(String[] args) {
				      // Prints Hello, World! on standard output.
				      System.out.println("Hello World!");
				   }
				}

	Output : 		
				public class HelloWorld {

				   public static void main(String[] args) {
				      System.out.println("Hello World!");
				   }
				}
		
	
