package space.eliseev.iplatformmoex.service;

import space.eliseev.iplatformmoex.model.enumeration.Engine;
import space.eliseev.iplatformmoex.model.enumeration.Market;


public interface SecurityService {
    Object getSecurities(String q, String lang, Engine engine, Integer isTrading, Market market,
                         String groupBy, Integer limit, String groupByFilter, Integer start);

    Object getSecurity(String security, String lang, Integer start);

    Object getSecurityAggregates(String security, String lang, String date);


}
