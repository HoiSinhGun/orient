package com.c72g.exploring;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {

    public static final String PATH = System.getProperty("user.home") + File.separator + "tarotSpread";

   static  {
       final Path path = Paths.get(PATH);
       try {
           Files.createDirectories(path);
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
