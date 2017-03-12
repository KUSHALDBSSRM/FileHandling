/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
/**
 *
 * @author kushal
 */
public class Prog2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    String s="",str="",str1="",str2="";
    s = sc.nextLine();
    int f=0;
    str1 = s.substring(0,s.indexOf(':'));
    BufferedReader br = new BufferedReader(new FileReader("/home/kushal/NetBeansProjects/Files/src/prefix-urlfilter"));
    while((str=br.readLine())!= null)
    {
      str2 = str.substring(0,str.indexOf(':'));
      if(str1.equals(str2))
      {
          f=1;
          break;
      }
    
    }
    if(f==0)
            System.out.println("false");
    else
            System.out.println("true");
    
}
}