package asg.cliche.sample;

import asg.cliche.Command;
import asg.cliche.ShellFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.text.StyledEditorKit.BoldAction;

public class HelloWorld {
   private static String userName = null;

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
  private static  void Register()
	{
		
	}
	private static  boolean Login() 
	{
		boolean ret=false;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("username:");


        try {
           userName = br.readLine();
        } catch (IOException ioe) {
           System.out.println("IO error trying to read your name!");
           System.exit(1);
        }
        
        

   	System.out.println("password");
   	return ret;
	}
    public static void main(String[] args) throws IOException
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   	 String loginMode=null;
   	System.out.println("Welcome to Galaxy");
   	boolean login= false;
   		while (!login)
   	{
	    	System.out.println("type login to login or  Register to Register");
	        try {
	          loginMode = br.readLine();
	        } catch (IOException ioe) {
	           System.out.println("IO error trying to read your name!");
	           System.exit(1);
	        }
	        if (loginMode.equals("login"))
	        		Login();
	        else
	        	Register();
   	}
        System.out.println("Thanks for the name, " + userName);
        ShellFactory.createConsoleShell("galaxy", "", new HelloWorld())
            .commandLoop(); // and three.
    }
	
}