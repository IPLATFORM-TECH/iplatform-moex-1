package space.eliseev.iplatformmoex.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "engines", url = "https://iss.moex.com/iss/engines")
public interface EngineClient {

    @GetMapping("/engines")
    public ResponseEntity<List<Engine>> getEngines(@RequestParam("lang") String lang);
}