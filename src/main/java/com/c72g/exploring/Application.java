package com.c72g.exploring;

import com.c72g.exploring.dao.TarotSpreadDAO;
import com.c72g.exploring.dao.TarotSpreadDAOFile;
import com.c72g.exploring.dao.TarotSpreadDAOImpl;
import com.c72g.exploring.dao.TarotSpreadRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {
        "com.c72g.exploring.dao"
})
public class Application {


    public static void main(String[] args) {
        // let Spring instantiate and inject dependencies
        System.exit(SpringApplication.exit(SpringApplication.run(Application.class, args)));
        // SpringApplication.run(Application.class, args);
    }

//    @Bean
//    public CommandLine.IFactory picocliSpringFactory(ApplicationContext applicationContext) {
//        return CommandLine.defaultFactory();// PicocliSpringFactory(applicationContext);
//    }

    @Bean
    public TarotSpreadDAO tarotSpreadDAOFile() {
        return new TarotSpreadDAOFile();
    }

    @Bean
    public TarotSpreadDAO tarotSpreadDAOImpl() {
        return new TarotSpreadDAOImpl();
    }

    @Bean
    public TarotService tarotService() {
        return new TarotServiceImpl();
    }

    @Bean
    public TarotResultHandler tarotResultToConsoleHandler() {
        return new TarotResultToConsoleHandlerImpl();
    }

    @Bean
    public TarotResultHandler tarotResultToDBHandler() {
        return new TarotResultToDBHandlerImpl();
    }

    @Bean
    public TarotResultHandler tarotResultToFileHandler() {
        return new TarotResultToFileHandlerImpl();
    }

    @Bean
    public TarotSpreadService tarotSpreadService() {
        return new TarotSpreadServiceImpl();
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//            if(args.length > 0) {
//                final TarotSpreadType tarotSpreadType =
//                        TarotSpreadType.valueOf(args[0]);
//                if (tarotSpreadType != null) {
//                    /**
//                     * get the bean from the context
//                     */
//                    final TarotSpreadService tarotSpreadService = ctx.getBean(TarotSpreadService.class);
//                    final TarotSpread tarotSpread =
//                            tarotSpreadService.spreadByType(tarotSpreadType);
//                    System.out.println(tarotSpread.getTarotSpreadType());
//                    System.out.println((tarotSpread.getTarotCardList()));
//                    // System.getProperty("user.home"
//                    /*
//                     String filename = "<//Enter the location you want the file//>";
//        FileWriter fstream;
//
//        try {
//            fstream = new FileWriter(filename);
//            BufferedWriter out = new BufferedWriter(fstream);
//            out.write("My Name is Bobby Bob");
//            out.newLine();
//            out.flush();
//            out.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//      }
//                     */
//                }
//            }
//        };
//    }

}