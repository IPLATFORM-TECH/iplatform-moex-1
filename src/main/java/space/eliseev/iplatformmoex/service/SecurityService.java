package space.eliseev.iplatformmoex.service;

import space.eliseev.iplatformmoex.model.dto.AggregatesDto;
import space.eliseev.iplatformmoex.model.enumeration.Engine;
import space.eliseev.iplatformmoex.model.enumeration.Market;

public interface SecurityService {
    Object getSecurity(String q, String lang, Engine engine, Integer isTrading, Market market,
                       String groupBy, Integer limit, String groupByFilter, Integer start);

    AggregatesDto getSecurityAggregates(String security, String lang, String date);
}

