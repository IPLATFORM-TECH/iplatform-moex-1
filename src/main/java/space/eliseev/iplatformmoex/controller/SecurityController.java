package space.eliseev.iplatformmoex.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import space.eliseev.iplatformmoex.model.dto.SecurityStats;
import space.eliseev.iplatformmoex.model.enumeration.Engine;
import space.eliseev.iplatformmoex.model.enumeration.Market;
import space.eliseev.iplatformmoex.service.client.SecurityClient;

@RestController
@RequestMapping("/security")
@RequiredArgsConstructor
public class SecurityController {
    private final SecurityClient securityClient;

    @GetMapping("/securityStats")
    public ResponseEntity<SecurityStats> getSecStats(@RequestParam("tradingsession") String tradingSession,
                                                     @RequestParam("securities") String securities,
                                                     @RequestParam("boardid") String boardId,
                                                     Engine engine, Market market) {
        System.out.println(1);
        return new ResponseEntity<>(securityClient.getSecStats(tradingSession, securities, boardId, engine, market), HttpStatus.OK);
    }
}
