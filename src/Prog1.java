/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kushal
 */
import java.io.*;
import java.util.*;
public class Prog1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
    String str="";
    ArrayList <String>a = new ArrayList<String>();
    BufferedReader br = new BufferedReader(new FileReader("/home/kushal/NetBeansProjects/Files/src/input"));
    while((str=br.readLine())!= null)
    {
        if(str.charAt(0)!='#')
         a.add(str);
            }
    System.out.println(a);
    
    }
    
}
