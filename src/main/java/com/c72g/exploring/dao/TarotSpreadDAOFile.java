package com.c72g.exploring.dao;

import com.c72g.exploring.FileUtils;
import com.c72g.exploring.TarotSpread;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TarotSpreadDAOFile implements TarotSpreadDAO {

    private final String entityName = "tarotSpread";

    @Override
    public List<TarotSpread> findAll() {
        final File entityFile = getEntityFile();
        if (!entityFile.exists() || entityFile.length() == 0)
            return new ArrayList<>();
        final ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(
                    entityFile, new TypeReference<List<TarotSpread>>() {
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private File getEntityFile() {
        final String file =
                FileUtils.PATH + File.separator + entityName + ".json";
        return new File((file));
    }

    @Override
    public void save(TarotSpread tarotSpread) {
        final List<TarotSpread> tarotSpreadList = findAll();
        tarotSpreadList.add(tarotSpread);
        final ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(getEntityFile(), tarotSpreadList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
