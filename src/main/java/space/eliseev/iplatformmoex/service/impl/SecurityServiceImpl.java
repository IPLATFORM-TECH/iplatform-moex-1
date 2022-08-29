package space.eliseev.iplatformmoex.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import space.eliseev.iplatformmoex.client.SecurityClient;
import space.eliseev.iplatformmoex.service.SecurityService;

@Service
@RequiredArgsConstructor
public class SecurityServiceImpl implements SecurityService {

    private final SecurityClient securityClient;

    @Override
    public Object getSecurities(String q, String lang, String engine, Integer isTrading, String market,
                              String groupBy, String limit, String groupByFilter, Integer start) {
        return securityClient.getSecurities(q, lang, engine, isTrading,
                market, groupBy, limit, groupByFilter, start);
    }
    @Override
    public Object getSecStats(String tradingSession,
                              String securities,
                              String boardId,
                              String engine,
                              String market) {
        return securityClient.getSecStats(tradingSession, securities, boardId, engine, market);
    }
}
