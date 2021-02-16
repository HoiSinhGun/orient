package com.c72g.exploring;

public class TarotResultToConsoleHandlerImpl implements TarotResultHandler {
    @Override
    public boolean handles(OutputType outputType) {
        return OutputType.ALL.equals(outputType) ||
                OutputType.CONSOLE.equals(outputType);
    }

    @Override
    public void handle(TarotSpread tarotSpread) {
        System.out.println(tarotSpread.getTarotSpreadType());
        System.out.println((tarotSpread.getTarotCardList()));
    }
}
