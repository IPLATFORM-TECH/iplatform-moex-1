package space.eliseev.iplatformmoex.service;


import org.springframework.stereotype.Service;
import space.eliseev.iplatformmoex.model.entity.*;
import space.eliseev.iplatformmoex.model.enumeration.Board;
import space.eliseev.iplatformmoex.model.enumeration.Engine;

import java.util.List;

@Service
public interface IndexService {
    List<Engine> getEngines();
    List<Market> getMarkets();
    List<Board> getBoards();
    List<BoardGroup> getBoardGroups();
    List<Duration> getDurations();
    List<SecurityGroup> getSecurityGroups();
    List<SecurityCollection> getSecurityCollections();
}