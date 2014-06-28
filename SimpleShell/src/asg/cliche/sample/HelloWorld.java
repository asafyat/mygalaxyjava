package asg.cliche.sample;

import asg.cliche.Command;
import asg.cliche.ShellFactory;
import java.io.IOException;

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
    
    

   
    public static void main(String[] args) throws IOException {
        ShellFactory.createConsoleShell("galaxy", "", new HelloWorld())
            .commandLoop(); // and three.
    }
}