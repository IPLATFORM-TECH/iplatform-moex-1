package space.eliseev.iplatformmoex.service;

import space.eliseev.iplatformmoex.model.enumeration.Engine;
import space.eliseev.iplatformmoex.model.enumeration.Market;

public interface SecurityService {
    Object getSecurity(String q, String lang, Engine engine, Integer isTrading, Market market,
                       String groupBy, Integer limit, Integer groupByFilter, Integer start);
}
