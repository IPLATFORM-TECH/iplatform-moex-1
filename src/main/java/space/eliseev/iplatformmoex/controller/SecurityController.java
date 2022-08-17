package space.eliseev.iplatformmoex.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import space.eliseev.iplatformmoex.service.SecurityService;

@RestController
@RequiredArgsConstructor
public class SecurityController {

    private final SecurityService securityService;

    @GetMapping("/getss/{q}/{lang}/{is_trading}/{market}/{group_by}/{limit}/{start}")
    public ResponseEntity<Object> convertCurrencyFeign(@PathVariable("q") String q,
                                                       @PathVariable("lang") String lang,
                                                       @PathVariable("is_trading") int is_trading,
                                                       @PathVariable("market") String market,
                                                       @PathVariable("group_by") String group_by,
                                                       @PathVariable("limit") int limit,
                                                       @PathVariable("start") int start) {

        return new ResponseEntity<>(securityService.retrieveExchangeValue(q, lang, is_trading, market,
                group_by, limit, start), HttpStatus.OK);
    }
}
