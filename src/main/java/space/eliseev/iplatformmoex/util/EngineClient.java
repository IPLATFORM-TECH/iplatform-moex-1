package space.eliseev.iplatformmoex.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import space.eliseev.iplatformmoex.model.entity.Engine;

import java.util.List;

@FeignClient(name = "enginesClient", url = "https://iss.moex.com/iss/engines")
public interface EngineClient {

    @GetMapping("/engines")
    List<Engine> getEngines(@RequestParam("lang") String lang);
}