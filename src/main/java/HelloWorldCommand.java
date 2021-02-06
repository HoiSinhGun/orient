import picocli.CommandLine;

import java.util.concurrent.Callable;

@CommandLine.Command(name = "hello", mixinStandardHelpOptions = true, version = "3.33",
        description = "Prints Hello World!")
public class HelloWorldCommand implements Callable<Integer> {
    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine(new HelloWorldCommand());
        commandLine.execute(args);
    }

    @Override
    public Integer call() {
        System.out.println("Hello World!");
        return 0;
    }
}
