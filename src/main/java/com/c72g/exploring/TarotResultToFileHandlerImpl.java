package com.c72g.exploring;

import com.c72g.exploring.dao.TarotSpreadDAO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.IOException;

public class TarotResultToFileHandlerImpl implements TarotResultHandler {

    @Autowired
    private TarotSpreadDAO tarotSpreadDAO;

    @Override
    public boolean handles(OutputType outputType) {
        return OutputType.ALL.equals(outputType) ||
                OutputType.FILE.equals(outputType);
    }

    @Override
    public void handle(TarotSpread tarotSpread) {
        tarotSpreadDAO.save(tarotSpread);
        System.out.println(tarotSpread);
    }
}
