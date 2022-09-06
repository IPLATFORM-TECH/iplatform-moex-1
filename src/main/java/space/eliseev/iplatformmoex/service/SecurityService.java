package space.eliseev.iplatformmoex.service;

import org.springframework.web.bind.annotation.RequestParam;
import space.eliseev.iplatformmoex.model.enumeration.Engine;
import space.eliseev.iplatformmoex.model.enumeration.Market;

import java.util.List;

public interface SecurityService {
    Object getSecurities(String q, String lang, Engine engine, Integer isTrading, Market market,
                       String groupBy, Integer limit, String groupByFilter, Integer start);

    List<Object> getSecurity(String security, String lang, Integer start);
}
