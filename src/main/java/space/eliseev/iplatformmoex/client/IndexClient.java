package space.eliseev.iplatformmoex.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import space.eliseev.iplatformmoex.model.dto.IndexDto;
import space.eliseev.iplatformmoex.model.enumeration.Engine;
import space.eliseev.iplatformmoex.model.enumeration.SecurityGroup;

@FeignClient(name = "getGlobalDirectory", url = "https://iss.moex.com/iss/index")
public interface IndexClient {

    @GetMapping(".json?iss.meta=off")
    IndexDto getIndex(@RequestParam(defaultValue = "ru") String lang);

    @GetMapping("/getBoardGroups.json?iss.meta=off")
    IndexDto getBoardGroups(@RequestParam(defaultValue = "ru") String lang,
                            @RequestParam(value = "engine", required = false) Engine engine,
                            @RequestParam(defaultValue = "0", required = false) Integer isTraded);

    @GetMapping("/getSecurityTypes.json?iss.meta=off")
    IndexDto getSecurityTypes(@RequestParam(defaultValue = "ru") String lang,
                              @RequestParam(value = "engine", required = false) Engine engine);

    @GetMapping("/getSecurityGroups.json?iss.meta=off")
    IndexDto getBoardGroups(@RequestParam(defaultValue = "ru") String lang,
                            @RequestParam(value = "hide_inactive", defaultValue = "0", required = false) Integer hideInactive,
                            @RequestParam(value = "securitygroups", required = false) SecurityGroup securityGroup,
                            @RequestParam(value = "trade_engine", required = false) Integer tradeEngine);

}
