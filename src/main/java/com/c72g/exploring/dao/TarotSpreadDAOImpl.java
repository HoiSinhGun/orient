package com.c72g.exploring.dao;

import com.c72g.exploring.TarotSpread;
import com.google.common.collect.Lists;

import javax.annotation.Resource;
import java.util.List;

public class TarotSpreadDAOImpl implements TarotSpreadDAO {

    @Resource
    private TarotSpreadRepository tarotSpreadRepository;

    @Override
    public List<TarotSpread> findAll() {
        final Iterable<TarotSpread> all = tarotSpreadRepository.findAll();
        return Lists.newArrayList(all);
    }

    @Override
    public void save(TarotSpread tarotSpread) {
        tarotSpreadRepository.save(tarotSpread);
    }
}
