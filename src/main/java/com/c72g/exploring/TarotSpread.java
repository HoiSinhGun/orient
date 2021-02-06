package com.c72g.exploring;

import java.util.List;

public class TarotSpread {

    private TarotSpreadType tarotSpreadType;
    private List<TarotCard> tarotCardList;

    public TarotSpread(TarotSpreadType tarotSpreadType, List<TarotCard> tarotCardList) {
        this.tarotSpreadType = tarotSpreadType;
        this.tarotCardList = tarotCardList;
    }

    public TarotSpreadType getTarotSpreadType() {
        return tarotSpreadType;
    }

    public void setTarotSpreadType(TarotSpreadType tarotSpreadType) {
        this.tarotSpreadType = tarotSpreadType;
    }

    public List<TarotCard> getTarotCardList() {
        return tarotCardList;
    }

    public void setTarotCardList(List<TarotCard> tarotCardList) {
        this.tarotCardList = tarotCardList;
    }
}
