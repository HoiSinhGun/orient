package com.c72g.exploring;


import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.UUID;

@Entity
public class TarotSpread  {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String uuid = UUID.randomUUID().toString();
    private TarotSpreadType tarotSpreadType;
    @ElementCollection(targetClass = TarotCard.class, fetch = FetchType.EAGER)
    @CollectionTable
    @Enumerated(EnumType.STRING)
    private List<TarotCard> tarotCardList;

    public TarotSpread(TarotSpreadType tarotSpreadType, List<TarotCard> tarotCardList) {
        this.tarotSpreadType = tarotSpreadType;
        this.tarotCardList = tarotCardList;
    }

    public TarotSpread() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    public String toString() {
        return "TarotSpread{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", tarotSpreadType=" + tarotSpreadType +
                ", tarotCardList=" + tarotCardList +
                '}';
    }
}
