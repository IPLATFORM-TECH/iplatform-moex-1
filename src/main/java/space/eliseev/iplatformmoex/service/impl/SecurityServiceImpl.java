package space.eliseev.iplatformmoex.service.impl;

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
    public Object getSecurity(String q, String lang, Engine engine, Integer isTrading, Market market,
                              String groupBy, Integer limit, String groupByFilter, Integer start) {
        return securityClient.getSecurity(q, lang, engine, isTrading,
                market, groupBy, limit, groupByFilter, start);
    }
}
