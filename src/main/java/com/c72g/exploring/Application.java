package com.c72g.exploring;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public TarotService tarotService(){
        return new TarotServiceImpl();
    }

    @Bean
    public TarotSpreadService tarotSpreadService() {
        return new TarotSpreadServiceImpl();
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            if(args.length > 0) {
                final TarotSpreadType tarotSpreadType =
                        TarotSpreadType.valueOf(args[0]);
                if (tarotSpreadType != null) {
                    final TarotSpread tarotSpread =
                            tarotSpreadService().spreadByType(tarotSpreadType);
                    System.out.println(tarotSpread.getTarotSpreadType());
                    System.out.println((tarotSpread.getTarotCardList()));
                    // System.getProperty("user.home"
                    /*
                     String filename = "<//Enter the location you want the file//>";
        FileWriter fstream;

        try {
            fstream = new FileWriter(filename);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write("My Name is Bobby Bob");
            out.newLine();
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
      }
                     */
                }
            }
        };
    }

}