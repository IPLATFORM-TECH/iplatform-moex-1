package space.eliseev.iplatformmoex.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(name="securities", url="https://iss.moex.com/iss/securities.json")
public interface SecurityService {
    @GetMapping("?q={q}&lang={lang}&is_trading={is_trading}&market={market}" +
            "&group_by={group_by}&limit={limit}&start={start}")
    Object retrieveExchangeValue(@PathVariable("q") String q,
                                 @PathVariable("lang") String lang,
                                 @PathVariable("is_trading") int is_trading,
                                 @PathVariable("market") String market,
                                 @PathVariable("group_by") String group_by,
                                 @PathVariable("limit") int limit,
                                 @PathVariable("start") int start);
}
