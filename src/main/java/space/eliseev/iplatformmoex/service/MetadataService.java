package space.eliseev.iplatformmoex.service;

import space.eliseev.iplatformmoex.model.entity.*;

import java.util.List;

public interface MetadataService {
    List<BoardGroup> getBoardGroup();
    List<Board> getBoard();
    List<Duration> getDuration();
    List<Engine> getEngine();
    List<Market> getMarket();
    List<SecurityCollection> getSecurityCollection();
    List<SecurityGroup> getSecurityGroup();
    List<SecurityType> getSecurityType();
}
