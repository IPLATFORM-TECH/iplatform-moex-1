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
    public Object getSecurities(String q, String lang, Engine engine, Integer isTrading, Market market,
                                String groupBy, Integer limit, String groupByFilter, Integer start) {
        return securityClient.getSecurities(q, lang, engine, isTrading,
                market, groupBy, limit, groupByFilter, start);
    }

    @Override
    public Object getSecurity(String security, String lang, Integer start) {
        return securityClient.getSecurity(security, lang, start);
    }

    @Override
    public Object getSecurityAggregates(String security, String lang, String date) {
        return securityClient.getSecurityAggregates(security, lang, date);

    }
}