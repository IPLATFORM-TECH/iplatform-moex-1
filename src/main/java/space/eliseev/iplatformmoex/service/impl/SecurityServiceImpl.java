package space.eliseev.iplatformmoex.service.impl;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import space.eliseev.iplatformmoex.client.SecurityClient;
import space.eliseev.iplatformmoex.model.enumeration.Engine;
import space.eliseev.iplatformmoex.model.enumeration.Market;
import space.eliseev.iplatformmoex.service.SecurityService;
import java.util.Optional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SecurityServiceImpl implements SecurityService {

    private final SecurityClient securityClient;
    
    @Override
    public Object getSecurities(String q, String lang, Engine engine, Integer isTrading, Market market,
                                String groupBy, String limit, String groupByFilter, Integer start) {

        String engineToString = Optional.ofNullable(engine).map(Engine::getName).orElse(StringUtils.EMPTY);
        String marketToString = Optional.ofNullable(market).map(Market::getName).orElse(StringUtils.EMPTY);

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

    @Override
    public List<Object> getSecurity(String security, String lang, Integer start) {
        return securityClient.getSecurity(security, lang, start);
    }
}
