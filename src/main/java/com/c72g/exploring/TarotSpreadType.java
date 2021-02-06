package com.c72g.exploring;

public enum TarotSpreadType {

    ONE_CARD(1),
    THREE_CARD(3),
    YES_NO(4),
    CELTIC(10);

    private final int cardCount;

    TarotSpreadType(int cardCount) {
        this.cardCount = cardCount;
    }

    public int getCardCount() {
        return cardCount;
    }
}
