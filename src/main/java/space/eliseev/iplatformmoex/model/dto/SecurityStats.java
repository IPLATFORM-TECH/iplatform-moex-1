package space.eliseev.iplatformmoex.model.dto;

import lombok.Getter;
import lombok.Setter;
import space.eliseev.iplatformmoex.model.entity.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class SecurityStats {
    private List<Board> boards = new ArrayList<>();
    private List<BoardGroup> boardGroups = new ArrayList<>();
    private List<Security> securities = new ArrayList<>();
    private List<MarketData> marketData = new ArrayList<>();
    private List<Trade> trades = new ArrayList<>();
    private OrderBook orderBook;
    private History history;
    private TradesHist tradesHist;
    private List<MarketDataYield> marketDataYields = new ArrayList<>();
    private List<TradeYield> tradeYields = new ArrayList<>();
    private List<HistoryYield> historyYields = new ArrayList<>();
}
