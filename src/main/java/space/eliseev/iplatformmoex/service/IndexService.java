package space.eliseev.iplatformmoex.service;

import space.eliseev.iplatformmoex.model.entity.*;
import space.eliseev.iplatformmoex.model.enumeration.Board;
import space.eliseev.iplatformmoex.model.enumeration.Engine;

import java.util.List;

public interface IndexService {
    List<Engine> getEngines();
    List<Market> getMarkets();
    List<Board> getBoards();
    List<BoardGroup> getBoardGroups();
    List<Duration> getDurations();
    List<SecurityGroup> getSecurityGroups();
    List<SecurityCollection> getSecurityCollections();
}
