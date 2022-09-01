package space.eliseev.iplatformmoex.service.impl;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import space.eliseev.iplatformmoex.client.SecurityClient;
import space.eliseev.iplatformmoex.model.enumeration.Engine;
import space.eliseev.iplatformmoex.model.enumeration.Market;
import space.eliseev.iplatformmoex.service.SecurityService;

@Service
@RequiredArgsConstructor
public class SecurityServiceImpl implements SecurityService {

    private final SecurityClient securityClient;

    @Override
    public Object getSecurities(String q, String lang, Engine engine, Integer isTrading, Market market,
                                String groupBy, String limit, String groupByFilter, Integer start) {
        String engineToString;
        String marketToString;

        if (engine == null) engineToString = "";
        else engineToString = engine.getName();

        if (market == null) marketToString = "";
        else marketToString = market.getName();

        return securityClient.getSecurities(q, lang, engineToString, isTrading,
                marketToString, groupBy, limit, groupByFilter, start);
    }

    @Override
    public Object getSecStats(String tradingSession,
                              String securities,
                              String boardId,
                              @NonNull Engine engine,
                              @NonNull Market market) {

        return securityClient.getSecStats(tradingSession, securities, boardId, engine.getName(), market.getName());
    }
}
