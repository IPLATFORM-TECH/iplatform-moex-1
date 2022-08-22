package space.eliseev.iplatformmoex.model.dto;

import lombok.Getter;
import lombok.Setter;
import space.eliseev.iplatformmoex.model.entity.*;
import space.eliseev.iplatformmoex.model.enumeration.Board;
import space.eliseev.iplatformmoex.model.enumeration.Engine;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class IndexDto {
    private List<Engine> engines = new ArrayList<>();
    private List<Market> markets = new ArrayList<>();
    private List<Board> boards = new ArrayList<>();
    private List<BoardGroup> boardGroups = new ArrayList<>();
    private List<Duration> durations = new ArrayList<>();
    private List<SecurityGroup> securityGroups = new ArrayList<>();
    private List<SecurityCollection> securityCollections = new ArrayList<>();
}
