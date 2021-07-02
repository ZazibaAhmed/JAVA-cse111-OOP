/*
ID: annajiat
LANG: JAVA
TASK: test //wrote program name here, for your lab task, it is ride
*/

// above 5 lines are necessary, their program reads your comments and finds out about you, language and question name

import java.io.*;
import java.util.*;


// Do not write public. class and file name is same as TASK/PROG name.
class test { 
    public static void main (String [] args) throws Exception {


	//instead of your own Scanner, use the following scanner to take input
	
        // Use BufferedReader rather than RandomAccessFile; it's much faster
        Scanner sc=new Scanner(new BufferedReader(new FileReader("test.in")));     // change file name to the name told in the question
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));   // change file name to the name told in the question
        





	// your work starts here
        int i1 = f.nextInt(); // first integer
        int i2 = f.nextInt(); // second integer
	// your work ends here








	//do not use System.out, write use just out.
        out.println(i1+i2); // output result

	
	//must write following two lines
        out.close(); // close the output file
        System.exit(0); // don't omit this!
    }
}