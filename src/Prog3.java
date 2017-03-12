/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
import java.util.regex.*;
/**
 *
 * @author kushal
 */
public class Prog3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
            BufferedWriter bw = new BufferedWriter(new FileWriter("/home/kushal/NetBeansProjects/Files/src/Removed.java"));
        
    String pattern ="";
    Scanner sc = new Scanner(System.in);
    String s ="",str="";
    System.out.println("Enter the path of java file");
    s = sc.nextLine();
    BufferedReader br = new BufferedReader(new FileReader(s));
//    File f = new File("/home/kushal/NetBeansProjects/Files/src/RemovedComments.java");
    while((str= br.readLine())!= null)
    {
        
        if(Pattern.matches(pattern, str)==false)
        {      System.out.println(str);
            bw.write(str);
        }
        }
    
    
    }
    
}
