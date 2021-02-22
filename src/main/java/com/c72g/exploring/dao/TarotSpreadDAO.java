package com.c72g.exploring.dao;

import com.c72g.exploring.TarotSpread;

import java.util.List;

public interface TarotSpreadDAO {

    List<TarotSpread> findAll();

    void save(TarotSpread tarotSpread);
}
