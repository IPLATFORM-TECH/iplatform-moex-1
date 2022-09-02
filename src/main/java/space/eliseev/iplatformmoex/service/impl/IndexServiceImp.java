package space.eliseev.iplatformmoex.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import space.eliseev.iplatformmoex.model.dto.IndexDto;
import space.eliseev.iplatformmoex.model.entity.*;
import space.eliseev.iplatformmoex.model.enumeration.Board;
import space.eliseev.iplatformmoex.model.enumeration.Engine;
import space.eliseev.iplatformmoex.service.IndexService;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.logging.Logger;

@Service
public class IndexServiceImp implements IndexService {
    private static final String INDEX_URL = "https://iss.moex.com/iss/index.json";

    private IndexDto index;
    private Logger logger;

    private IndexDto getIndex() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            index = mapper.readValue(new URL(INDEX_URL), IndexDto.class);
        } catch (IOException e) {
            logger.warning("Не удалось присвоить значение для index");
        }
        return index;
    }


    @Override
    public List<Engine> getEngines() {
        return getIndex().getEngines();
    }

    @Override
    public List<Market> getMarkets() {
        return getIndex().getMarkets();
    }

    @Override
    public List<Board> getBoards() {
        return getIndex().getBoards();
    }

    @Override
    public List<BoardGroup> getBoardGroups() {
        return getIndex().getBoardGroups();
    }

    @Override
    public List<Duration> getDurations() {
        return getIndex().getDurations();
    }

    @Override
    public List<SecurityGroup> getSecurityGroups() {
        return getIndex().getSecurityGroups();
    }

    @Override
    public List<SecurityCollection> getSecurityCollections() {
        return getIndex().getSecurityCollections();
    }
}
