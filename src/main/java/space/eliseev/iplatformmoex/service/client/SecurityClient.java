package space.eliseev.iplatformmoex.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "securitiesClient", url = "https://iss.moex.com/iss/securities")
public interface SecurityClient {

    @GetMapping("/security")
    List<Object> getSecurity(@RequestParam("security") String security,
                              @RequestParam(value = "lang", required = false) String lang,
                              @RequestParam(value = "start", required = false) Integer start);
}
