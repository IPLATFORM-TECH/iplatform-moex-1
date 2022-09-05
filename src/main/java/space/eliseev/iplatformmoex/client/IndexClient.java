package space.eliseev.iplatformmoex.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import space.eliseev.iplatformmoex.model.dto.IndexDto;

@FeignClient(name = "getGlobalDirectory", url = "https://iss.moex.com/iss/index.json?iss.meta=off")
public interface IndexClient {

    @GetMapping
    IndexDto getIndex();

}
