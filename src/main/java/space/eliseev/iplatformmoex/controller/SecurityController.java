package space.eliseev.iplatformmoex.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import space.eliseev.iplatformmoex.model.enumeration.Engine;
import space.eliseev.iplatformmoex.model.enumeration.Market;
import space.eliseev.iplatformmoex.service.SecurityService;

@RestController
@RequiredArgsConstructor
@RequestMapping(value ="/security", produces = "application/json; charset=UTF-8")

public class SecurityController {
    private final SecurityService securityService;

    @GetMapping("/getSecurities")
    public ResponseEntity<Object> getSecurities(
            @RequestParam(value = "q", required = false) String q,
            @RequestParam(value = "lang", defaultValue = "ru", required = false) String lang,
            @RequestParam(value = "engine", required = false) Engine engine,
            @RequestParam(value = "is_trading", required = false) Integer isTrading,
            @RequestParam(value = "market", required = false) Market market,
            @RequestParam(value = "group_by", required = false) String groupBy,
            @RequestParam(value = "limit", defaultValue = "100", required = false) String limit,
            @RequestParam(value = "group_by_filter", required = false) String groupByFilter,
            @RequestParam(value = "start", defaultValue = "0", required = false) Integer start) {

        return new ResponseEntity<>(securityService.getSecurities(q, lang,
                engine.getName(), isTrading, market.getName(), groupBy, limit, groupByFilter, start), HttpStatus.OK);
    }

    @GetMapping("/getSecStats")
    public ResponseEntity<Object> getSecStats(@RequestParam(name = "tradingsession", required = false) String tradingSession,
                                                     @RequestParam(name = "securities", required = false) String securities,
                                                     @RequestParam(name = "boardid", required = false) String boardId,
                                                     Engine engine,
                                                     Market market) {
        return new ResponseEntity<>(securityService.getSecStats(tradingSession, securities, boardId, engine.getName(), market.getName()), HttpStatus.OK);
    }
}
