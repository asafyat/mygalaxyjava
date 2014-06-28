package asg.cliche.sample;

import asg.cliche.Command;
import asg.cliche.ShellFactory;
import java.io.IOException;

public class HelloWorld {

    @Command // One,
    public String hello() {
        return "welcome to Galaxy Game";
    }
    @Command // two,
    public int add(int a, int b) {
        return a + b;
    }
   

   
    public static void main(String[] args) throws IOException {
        ShellFactory.createConsoleShell("galaxy", "", new HelloWorld())
            .commandLoop(); // and three.
    }
}