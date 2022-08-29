package space.eliseev.iplatformmoex.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import space.eliseev.iplatformmoex.model.enumeration.Engine;
import space.eliseev.iplatformmoex.model.enumeration.Market;

@FeignClient(name="securities", url="${client.post.baseUrl}")
public interface SecurityClient {
    @GetMapping("/securities")
    Object getSecurities(@RequestParam("q") String q,
                       @RequestParam("lang") String lang,
                       @RequestParam("engine") Engine engine,
                       @RequestParam("is_trading") Integer isTrading,
                       @RequestParam("market") Market market,
                       @RequestParam("group_by") String groupBy,
                       @RequestParam("limit") String limit,
                       @RequestParam("group_by_filter") String groupByFilter,
                       @RequestParam("start") Integer start);

    @GetMapping("/engines/{engine}/markets/{market}/secstats")
    Object getSecStats(@RequestParam("tradingsession") String tradingSession,
                              @RequestParam("securities") String securities,
                              @RequestParam("boardid") String boardId,
                              @PathVariable("engine") Engine engine,
                              @PathVariable("market") Market market);
}
