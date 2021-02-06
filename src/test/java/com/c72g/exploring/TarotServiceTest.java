package com.c72g.exploring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class TarotServiceTest {

    @Autowired
    private TarotService tarotService ;

    @Test
    void shouldDraw3Cards() {
        tarotService.randomCards(3);
    }
}
