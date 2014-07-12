package asg.cliche.sample;

import asg.cliche.Command;
import asg.cliche.ShellFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.text.StyledEditorKit.BoldAction;

public class loginOrRegister {
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
	  String Id;
	  String name;
	  String password;
	  System.out.println("enter your mail");
	  Id=InputText();
	  System.out.println("enter your name");
	  name=InputText();
	  System.out.println("enter your password");
	  password=InputText();
	}
	private static  boolean Login() 
	{	
		String Id;
		String password;

		
		boolean ret=false;
		System.out.println("enter your mail");
       Id=InputText();
		System.out.println("enter your password");
				password=InputText();
   	
   	
   	
   	return ret;
	}
	private static  String InputText()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input= null;
		try {
			input = br.readLine();
      } catch (IOException ioe) {
         System.out.println("IO error trying to read your name!");
         System.exit(1);
         
      }
		return input;
  }
    public static void main(String[] args) throws IOException
    {
   	 String loginMode=null;
   	System.out.println("Welcome to Galaxy");
   	System.out.println("write Login to Login or Register to Register");
   	boolean login= false;
   	while (!login)
   	{
   			loginMode=InputText();
	        
	        if (loginMode.equals("login"))
	        		Login();
	        else
	        	Register();
   	}
    
        System.out.println("Thanks for the name, " + userName);
        ShellFactory.createConsoleShell("galaxy", "", new loginOrRegister())
            .commandLoop(); // and three.
    }
	
}