package space.eliseev.iplatformmoex.service;

import space.eliseev.iplatformmoex.model.entity.*;

import java.util.List;

public interface IndexService {

    List<Engine> getEngines();
    List<Market> getMarkets();
    List<Board> getBoards();
    List<BoardGroup> getBoardGroups();
    List<Duration> getDurations();
    List<SecurityType> getSecurityTypes();
    List<SecurityGroup> getSecurityGroups();
    List<SecurityCollection> getSecurityCollections();
}
