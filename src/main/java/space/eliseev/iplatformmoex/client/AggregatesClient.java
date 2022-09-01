package space.eliseev.iplatformmoex.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import space.eliseev.iplatformmoex.model.dto.AggregatesDto;

@FeignClient(name = "aggregates", url = "${client.post.baseUrl}")
public interface AggregatesClient {
    @GetMapping("/security/aggregates")
    AggregatesDto getSecurityAggregates(@RequestParam("security") String security,
                                        @RequestParam("lang") String lang,
                                        @RequestParam("date") String date);
}
