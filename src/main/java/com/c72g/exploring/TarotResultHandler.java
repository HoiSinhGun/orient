package com.c72g.exploring;

public interface TarotResultHandler {

    boolean handles(OutputType outputType);

    void handle(TarotSpread tarotSpread);
}
