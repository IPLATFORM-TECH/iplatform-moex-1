package space.eliseev.iplatformmoex.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import space.eliseev.iplatformmoex.client.IndexClient;
import space.eliseev.iplatformmoex.model.dto.IndexDto;
import space.eliseev.iplatformmoex.model.entity.*;
import space.eliseev.iplatformmoex.service.IndexService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class IndexServiceImp implements IndexService {

    final IndexClient indexClient;

    @Override
    public List<Engine> getEngines(String lang) {
        List<Engine> engines = new ArrayList<>();
        IndexDto indexDto = indexClient.getIndex(lang);

        for (List<String> data : indexDto.getEngines().getData()) {
            engines.add(new Engine(
                    Integer.valueOf(data.get(0)),
                    data.get(1),
                    data.get(2)));
        }
        return engines;
    }

    @Override
    public List<Market> getMarkets(String lang) {
        List<Market> markets = new ArrayList<>();
        IndexDto indexDto = indexClient.getIndex(lang);

        for (List<String> data : indexDto.getMarkets().getData()) {
            markets.add(new Market(
                    Integer.valueOf(data.get(0)),
                    Integer.valueOf(data.get(1)),
                    data.get(2),
                    data.get(3),
                    data.get(4),
                    data.get(5),
                    Integer.valueOf(data.get(6)),
                    data.get(7),
                    Integer.valueOf(data.get(8)),
                    Integer.valueOf(data.get(9)),
                    Integer.valueOf(data.get(10)),
                    Integer.valueOf(data.get(11)),
                    Integer.valueOf(data.get(12))));
        }
        return markets;
    }

    @Override
    public List<Board> getBoards(String lang) {
        List<Board> boards = new ArrayList<>();
        IndexDto indexDto = indexClient.getIndex(lang);

        for (List<String> data : indexDto.getBoards().getData()) {
            boards.add(new Board(
                    Integer.valueOf(data.get(0)),
                    Integer.valueOf(data.get(1)),
                    Integer.valueOf(data.get(2)),
                    Integer.valueOf(data.get(3)),
                    data.get(4),
                    data.get(5),
                    Integer.valueOf(data.get(6)),
                    Integer.valueOf(data.get(7)),
                    Integer.valueOf(data.get(8))));
        }
        return boards;
    }

    @Override
    public List<BoardGroup> getBoardGroups(String lang, space.eliseev.iplatformmoex.model.enumeration.Engine engine, Integer isTraded) {
        List<BoardGroup> boardGroups = new ArrayList<>();
        IndexDto indexDto = indexClient.getIndex(lang);

        for (List<String> data : indexDto.getBoardgroups().getData()) {
            if ((Objects.equals(data.get(2), engine.getName())) && (Objects.equals(data.get(10), isTraded.toString()))) {
                boardGroups.add(new BoardGroup(
                        Integer.valueOf(data.get(0)),
                        Integer.valueOf(data.get(1)),
                        data.get(2),
                        data.get(3),
                        Integer.valueOf(data.get(4)),
                        data.get(5),
                        data.get(6),
                        data.get(7),
                        Integer.valueOf(data.get(8)),
                        Integer.valueOf(data.get(9)),
                        Integer.valueOf(data.get(10)),
                        (data.get(11) == null ? null : Integer.valueOf(data.get(11))),
                        data.get(12)));
            } else {
                continue;
            }
        }
        return boardGroups;
    }


    @Override
    public List<Duration> getDurations(String lang) {
        List<Duration> durations = new ArrayList<>();
        IndexDto indexDto = indexClient.getIndex(lang);

        for (List<String> data : indexDto.getDurations().getData()) {
            durations.add(new Duration(
                    Integer.valueOf(data.get(0)),
                    Integer.valueOf(data.get(1)),
                    (data.get(2) == null ? null : Integer.valueOf(data.get(2))),
                    data.get(3),
                    data.get(4)));
        }
        return durations;
    }

    @Override
    public List<SecurityType> getSecurityTypes(String lang, space.eliseev.iplatformmoex.model.enumeration.Engine engine) {
        List<SecurityType> securityTypes = new ArrayList<>();
        IndexDto indexDto = indexClient.getIndex(lang);

        for (List<String> data : indexDto.getSecuritytypes().getData()) {
            if (Objects.equals(data.get(2), engine.getName())) {
                securityTypes.add(new SecurityType(
                        Integer.valueOf(data.get(0)),
                        Integer.valueOf(data.get(1)),
                        data.get(2),
                        data.get(3),
                        data.get(4),
                        data.get(5),
                        data.get(6)));
            } else {
                continue;
            }
        }
        return securityTypes;
    }

    @Override
    public List<SecurityGroup> getSecurityGroups(String lang, Integer hideInactive,
                                                 space.eliseev.iplatformmoex.model.enumeration.SecurityGroup securityGroup, Integer tradeEngine) {
        List<SecurityGroup> securityGroups = new ArrayList<>();
        IndexDto indexDto = indexClient.getIndex(lang);

        for (List<String> data : indexDto.getSecuritygroups().getData()) {
            if ((Objects.equals(data.get(1), securityGroup.getName())) && (Objects.equals(data.get(3), hideInactive.toString()))) {
                securityGroups.add(new SecurityGroup(
                        Integer.valueOf(data.get(0)),
                        data.get(1),
                        data.get(2),
                        Integer.valueOf(data.get(3))));
            } else {
                continue;
            }
        }
        return securityGroups;
    }

    @Override
    public List<SecurityCollection> getSecurityCollections(String lang) {
        List<SecurityCollection> securityCollections = new ArrayList<>();
        IndexDto indexDto = indexClient.getIndex(lang);

        for (List<String> data : indexDto.getSecuritycollections().getData()) {
            securityCollections.add(new SecurityCollection(
                    Integer.valueOf(data.get(0)),
                    data.get(1),
                    data.get(2),
                    Integer.valueOf(data.get(3))));
        }
        return securityCollections;
    }

}
