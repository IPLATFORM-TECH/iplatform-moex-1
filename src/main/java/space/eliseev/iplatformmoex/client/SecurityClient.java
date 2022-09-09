package space.eliseev.iplatformmoex.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;


@FeignClient(name = "securities", url = "${client.post.baseUrl}")
public interface SecurityClient {

    @GetMapping("/securities.json")
    Object getSecurities(@RequestParam("q") String q,
                       @RequestParam("lang") String lang,
                       @RequestParam("engine") String engine,
                       @RequestParam("is_trading") Integer isTrading,
                       @RequestParam("market") String market,
                       @RequestParam("group_by") String groupBy,
                       @RequestParam("limit") String limit,
                       @RequestParam("group_by_filter") String groupByFilter,
                       @RequestParam("start") Integer start);

    @GetMapping("/engines/{engine}/markets/{market}/secstats.json")
    Object getSecStats(@RequestParam("tradingsession") String tradingSession,
                              @RequestParam("securities") String securities,
                              @RequestParam("boardid") String boardId,
                              @PathVariable("engine") String engine,
                              @PathVariable("market") String market);

    @GetMapping("/{security}")
    Object getSecurity(@PathVariable("security") String security,
                       @RequestParam(value = "lang", required = false) String lang,
                       @RequestParam(value = "start", required = false) Integer start);

    @GetMapping("/{security}/aggregates.json")
    Object getSecurityAggregates(@PathVariable("security") String security,
                                 @RequestParam("lang") String lang,
                                 @RequestParam("date") String date);
}
