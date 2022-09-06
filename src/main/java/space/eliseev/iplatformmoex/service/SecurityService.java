package space.eliseev.iplatformmoex.service;

import lombok.NonNull;
import space.eliseev.iplatformmoex.model.enumeration.Engine;
import space.eliseev.iplatformmoex.model.enumeration.Market;
import java.util.List;

public interface SecurityService {

    Object getSecurities(String q,
                         String lang,
                         Engine engine,
                         Integer isTrading,
                         Market market,
                         String groupBy,
                         String limit,
                         String groupByFilter,
                         Integer start);
    
    Object getSecStats(String tradingSession,
                       String securities,
                       String boardId,
                       @NonNull Engine engine,
                       @NonNull Market market);

    List<Object> getSecurity(String security,
                             String lang,
                             Integer start);
}
