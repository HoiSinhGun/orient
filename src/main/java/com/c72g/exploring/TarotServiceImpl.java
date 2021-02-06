package com.c72g.exploring;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class TarotServiceImpl implements TarotService {

    @Override
    public List<TarotCard> randomCards(int count) {
        ArrayList<TarotCard> tarotCards = new ArrayList<>();

        Random random = new Random();
        while (tarotCards.size() < count) {
            int nextInt = random.nextInt(78);
            TarotCard tarotCard = TarotCard.valueOfId(nextInt);
            if(tarotCards.contains(tarotCard))
                continue;
            tarotCards.add(tarotCard);
        }
        return tarotCards;
    }
}
