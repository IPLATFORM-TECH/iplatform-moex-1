package space.eliseev.iplatformmoex.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import space.eliseev.iplatformmoex.model.dto.SecurityStats;
import space.eliseev.iplatformmoex.model.enumeration.Engine;
import space.eliseev.iplatformmoex.model.enumeration.Market;

@FeignClient(name = "securityStats", url = "https://iss.moex.com/iss")
public interface SecurityClient {
    @GetMapping("/engines/{engine}/markets/{market}/secstats?tradingsession={tradingsession}&securities={securities}&boardid={boardid}")
    SecurityStats getSecStats(@PathVariable("tradingsession") String tradingSession,
                              @PathVariable("securities") String securities,
                              @PathVariable("boardid") String boardId,
                              @PathVariable("engine") Engine engine,
                              @PathVariable("market") Market market);
}
