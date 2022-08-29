package space.eliseev.iplatformmoex.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import space.eliseev.iplatformmoex.service.client.SecurityClient;
import space.eliseev.iplatformmoex.model.enumeration.Engine;
import space.eliseev.iplatformmoex.model.enumeration.Market;

@Service
@RequiredArgsConstructor
public class SecurityServiceImpl implements SecurityService {

    private final SecurityClient securityClient;

    @Override
    public Object getSecurities(String q, String lang, Engine engine, Integer isTrading, Market market,
                              String groupBy, String limit, String groupByFilter, Integer start) {
        return securityClient.getSecurities(q, lang, engine, isTrading,
                market, groupBy, limit, groupByFilter, start);
    }
    @Override
    public Object getSecStats(String tradingSession,
                              String securities,
                              String boardId,
                              Engine engine,
                              Market market) {
        return securityClient.getSecStats(tradingSession, securities, boardId, engine, market);
    }
}
