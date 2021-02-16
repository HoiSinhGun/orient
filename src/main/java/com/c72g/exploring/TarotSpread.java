package com.c72g.exploring;

import com.c72g.exploring.info.I_Information;
import com.c72g.exploring.info.Information;
import com.c72g.exploring.info.InformationBuilder;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.UUID;

public class TarotSpread  implements I_Information {

    private String uuid = UUID.randomUUID().toString();
    private TarotSpreadType tarotSpreadType;
    private List<TarotCard> tarotCardList;

    public TarotSpread(TarotSpreadType tarotSpreadType, List<TarotCard> tarotCardList) {
        this.tarotSpreadType = tarotSpreadType;
        this.tarotCardList = tarotCardList;
    }

    public TarotSpread() {
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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

    @Override
    public Information toInformation() {
        return new InformationBuilder().header(tarotSpreadType.name()).
                content(tarotCardList.toString()).toInformation();
    }
}
