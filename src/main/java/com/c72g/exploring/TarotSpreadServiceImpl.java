package com.c72g.exploring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class TarotSpreadServiceImpl implements TarotSpreadService {

    @Autowired
    private TarotService tarotService;

    @Override
    public TarotSpread spreadByType(TarotSpreadType tarotSpreadType) {
        int how_many_cards = tarotSpreadType.getCardCount();
        if (how_many_cards == 0)
            return null;
        List<TarotCard> tarotCardList = tarotService.randomCards(how_many_cards);
        return new TarotSpread(tarotSpreadType, tarotCardList);
    }
}
