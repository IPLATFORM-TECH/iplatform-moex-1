package space.eliseev.iplatformmoex.service;

public interface SecurityService {
    Object getSecurities(String q, String lang, String engine, Integer isTrading, String market,
                       String groupBy, String limit, String groupByFilter, Integer start);


    Object getSecStats(String tradingSession,
                       String securities,
                       String boardId,
                       String engine,
                       String market);
}
