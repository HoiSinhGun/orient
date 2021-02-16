package com.c72g.exploring;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import picocli.CommandLine;

import java.util.Map;
import java.util.concurrent.Callable;

@Component
@CommandLine.Command(name = "tarotSpread")
public class TarotSpreadCmd implements Callable<Integer> {

    private final TarotSpreadService tarotSpreadService;

    private final ApplicationContext applicationContext;

    @CommandLine.Option(names = "--type", description = "Spread type (ONE_CARD, THREE_CARD, CELTIC,...). " +
            "Default: ${DEFAULT_VALUE}", required = false)
    TarotSpreadType spreadType = TarotSpreadType.ONE_CARD;

    @CommandLine.Option(names = "--outType", description = "Output type (CONSOLE, FILE, ALL). " +
            "Default: ALL", defaultValue = "ALL")
    OutputType outType = OutputType.ALL;

    public TarotSpreadCmd(TarotSpreadService tarotSpreadService, ApplicationContext applicationContext) {
        this.tarotSpreadService = tarotSpreadService;
        this.applicationContext = applicationContext;
    }

    @Override
    public Integer call() throws Exception {
        final TarotSpread tarotSpread =
                tarotSpreadService.spreadByType(spreadType);
        final Map<String, TarotResultHandler> tarotResultHandlerMap =
                applicationContext.getBeansOfType(TarotResultHandler.class);
        for (TarotResultHandler tarotResultHandler : tarotResultHandlerMap.values()) {
                if (tarotResultHandler.handles(outType)) {
                    tarotResultHandler.handle(tarotSpread);
            }
        }
        return 0;
    }
}
