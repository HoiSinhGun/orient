package com.c72g.exploring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;
import picocli.CommandLine;

@Component
public class TarotRunner implements CommandLineRunner, ExitCodeGenerator {

    private TarotSpreadCmd tarotSpreadCmd;
    private CommandLine.IFactory factory;
    private int exitCode;

    // constructor injection
    TarotRunner(CommandLine.IFactory factory, TarotSpreadCmd tarotSpreadCmd) {
        this.factory = factory;
        this.tarotSpreadCmd = tarotSpreadCmd;
    }

    @Override
    public void run(String... args) {
        // initialize
        // ...
        // let picocli parse command line args and run the business logic
        exitCode = new CommandLine(tarotSpreadCmd, factory).execute(args);
    }

    @Override
    public int getExitCode() {
        return exitCode;
    }


}
