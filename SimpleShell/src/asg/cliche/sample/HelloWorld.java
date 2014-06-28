package asg.cliche.sample;

import asg.cliche.Command;
import asg.cliche.ShellFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {

    @Command//the start command
    public String hello() {
        return "welcome to Galaxy Game";
    }
    @Command 
    public void enter (String name) 
    {
    	
    }
    @Command 
    public void list (String name)
    {
    	
    }
    
    public static void main(String[] args) throws IOException
    {
    	System.out.println("Welcome to Galaxy");
    	System.out.print("username:");
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         String userName = null;

         //  read the username from the command-line; need to use try/catch with the
         //  readLine() method
         try {
            userName = br.readLine();
         } catch (IOException ioe) {
            System.out.println("IO error trying to read your name!");
            System.exit(1);
         }

         System.out.println("Thanks for the name, " + userName);

    	System.out.println("password");
        ShellFactory.createConsoleShell("galaxy", "", new HelloWorld())
            .commandLoop(); // and three.
    }
}