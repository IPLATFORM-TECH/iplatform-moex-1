package space.eliseev.iplatformmoex.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import space.eliseev.iplatformmoex.model.enumeration.Engine;
import space.eliseev.iplatformmoex.model.enumeration.Market;


@FeignClient(name = "securities", url = "${client.post.baseUrl}")
public interface SecurityClient {
    @GetMapping(".json?q={q}&lang={lang}&engine={engine}&is_trading={is_trading}&market={market}" +
            "&group_by={group_by}&limit={limit}&group_by_filter={group_by_filter}&start={start}")
    Object getSecurities(@PathVariable("q") String q,
                         @PathVariable("lang") String lang,
                         @PathVariable("engine") Engine engine,
                         @PathVariable("is_trading") Integer isTrading,
                         @PathVariable("market") Market market,
                         @PathVariable("group_by") String groupBy,
                         @PathVariable("limit") Integer limit,
                         @PathVariable("group_by_filter") String groupByFilter,
                         @PathVariable("start") Integer start);

    @GetMapping("/security.json")
    Object getSecurity(@RequestParam("security") String security,
                             @RequestParam(value = "lang", required = false) String lang,
                             @RequestParam(value = "start", required = false) Integer start);

    @GetMapping(value = "/{security}/aggregates.json?lang={lang}&date={date}")
    Object getSecurityAggregates(@PathVariable("security") String security,
                                 @PathVariable("lang") String lang,
                                 @PathVariable("date") String date);
}
