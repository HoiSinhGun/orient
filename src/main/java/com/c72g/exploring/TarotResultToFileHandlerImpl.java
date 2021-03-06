package com.c72g.exploring;

import com.c72g.exploring.dao.TarotSpreadDAO;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class TarotResultToFileHandlerImpl implements TarotResultHandler {

    @Resource(name = "tarotSpreadDAOFile")
    private TarotSpreadDAO tarotSpreadDAOFile;

    @Override
    public boolean handles(OutputType outputType) {
        return OutputType.ALL.equals(outputType) ||
                OutputType.FILE.equals(outputType);
    }

    @Override
    public void handle(TarotSpread tarotSpread) {
        tarotSpreadDAOFile.save(tarotSpread);
        System.out.println();
        System.out.println("JSON File Content");
        for (TarotSpread spread : tarotSpreadDAOFile.findAll()) {
            System.out.println(spread);
        }
    }
}
