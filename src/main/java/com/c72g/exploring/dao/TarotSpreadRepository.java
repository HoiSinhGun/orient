package com.c72g.exploring.dao;

import com.c72g.exploring.TarotSpread;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarotSpreadRepository  extends CrudRepository<TarotSpread, Long> {
}
