package space.eliseev.iplatformmoex.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import space.eliseev.iplatformmoex.model.enumeration.Engine;
import space.eliseev.iplatformmoex.model.enumeration.Market;
import space.eliseev.iplatformmoex.service.SecurityService;

@RestController
@RequiredArgsConstructor
public class SecurityController {

    private final SecurityService securityService;

    @GetMapping("/getSecurity")
    public ResponseEntity<Object> convertCurrencyFeign(
            @RequestParam(value = "q", required = false) String q,
            @RequestParam(value = "lang", required = false) String lang,
            @RequestParam(value = "engine", required = false) Engine engine,
            @RequestParam(value = "is_trading", required = false) Integer isTrading,
            @RequestParam(value = "market", required = false) Market market,
            @RequestParam(value = "group_by", required = false) String groupBy,
            @RequestParam(value = "limit", required = false) Integer limit,
            @RequestParam(value = "group_by_filter", required = false) Integer groupByFilter,
            @RequestParam(value = "start", required = false) Integer start) {

        return new ResponseEntity<>(securityService.getSecurity(q, lang,
                engine, isTrading, market, groupBy, limit, groupByFilter, start), HttpStatus.OK);
    }
}
