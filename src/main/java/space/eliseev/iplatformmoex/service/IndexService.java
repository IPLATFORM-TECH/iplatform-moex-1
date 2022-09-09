package space.eliseev.iplatformmoex.service;

import space.eliseev.iplatformmoex.model.entity.*;

import java.util.List;

public interface IndexService {

    List<Engine> getEngines(String lang);

    List<Market> getMarkets(String lang);

    List<Board> getBoards(String lang);

    List<BoardGroup> getBoardGroups(String lang, space.eliseev.iplatformmoex.model.enumeration.Engine engine, Integer isTraded);

    List<Duration> getDurations(String lang);

    List<SecurityType> getSecurityTypes(String lang, space.eliseev.iplatformmoex.model.enumeration.Engine engine);

    List<SecurityGroup> getSecurityGroups(String lang, Integer hideInactive, space.eliseev.iplatformmoex.model.enumeration.SecurityGroup securityGroup, Integer tradeEngine);

    List<SecurityCollection> getSecurityCollections(String lang);

}
