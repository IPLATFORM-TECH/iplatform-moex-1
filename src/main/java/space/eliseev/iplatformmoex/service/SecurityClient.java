package space.eliseev.iplatformmoex.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import space.eliseev.iplatformmoex.model.enumeration.Engine;
import space.eliseev.iplatformmoex.model.enumeration.Market;

@FeignClient(name="securities", url="${client.post.baseUrl}")
public interface SecurityClient {
    @GetMapping("?q={q}&lang={lang}&engine={engine}&is_trading={is_trading}&market={market}" +
            "&group_by={group_by}&limit={limit}&group_by_filter={group_by_filter}&start={start}")
    Object getSecurity(@PathVariable("q") String q,
                       @PathVariable("lang") String lang,
                       @PathVariable("engine") Engine engine,
                       @PathVariable("is_trading") Integer isTrading,
                       @PathVariable("market") Market market,
                       @PathVariable("group_by") String groupBy,
                       @PathVariable("limit") Integer limit,
                       @PathVariable("group_by_filter") Integer groupByFilter,
                       @PathVariable("start") Integer start);
}
