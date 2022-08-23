package space.eliseev.iplatformmoex.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import space.eliseev.iplatformmoex.model.enumeration.Engine;
import space.eliseev.iplatformmoex.model.enumeration.Market;

@Service
@RequiredArgsConstructor
public class SecurityServiceImpl implements SecurityService {

    private final SecurityClient securityClient;

    @Override
    public Object getSecurity(String q, String lang, Engine engine, Integer isTrading, Market market,
                              String groupBy, Integer limit, Integer groupByFilter, Integer start) {
        return securityClient.getSecurity(q, lang, engine, isTrading,
                market, groupBy, limit, groupByFilter, start);
    }
}
