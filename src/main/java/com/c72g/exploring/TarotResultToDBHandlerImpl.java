package com.c72g.exploring;

import com.c72g.exploring.dao.TarotSpreadDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

public class TarotResultToDBHandlerImpl implements TarotResultHandler {

    @Resource(name = "tarotSpreadDAOImpl")
    private TarotSpreadDAO tarotSpreadDAOImpl;

    @Override
    public boolean handles(OutputType outputType) {
        return OutputType.ALL.equals(outputType) ||
                OutputType.DB.equals(outputType);
    }

    @Override
    public void handle(TarotSpread tarotSpread) {
        tarotSpreadDAOImpl.save(tarotSpread);
        System.out.println();
        System.out.println("DB content");
        for (TarotSpread spread : tarotSpreadDAOImpl.findAll()) {
            System.out.println(spread);
        }
    }
}
