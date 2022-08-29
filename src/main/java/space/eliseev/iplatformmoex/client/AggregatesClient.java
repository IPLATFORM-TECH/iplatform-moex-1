package space.eliseev.iplatformmoex.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="aggregates", url="https:/iss/securities/[security]/aggregates")
public interface AggregatesClient {
    @GetMapping("lang={lang}&date={date}")
    Object getSecurityAggregates(@PathVariable("lang") String lang,
                                 @PathVariable("date") String date);
}
