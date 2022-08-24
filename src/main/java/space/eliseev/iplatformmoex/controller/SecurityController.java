package space.eliseev.iplatformmoex.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import space.eliseev.iplatformmoex.service.client.AggregatesClient;

@RestController
@RequiredArgsConstructor
public class SecurityController {

    private final AggregatesClient aggregatesClient;

    @GetMapping("/aggregates")
    public ResponseEntity<Object> getSecurityAggregates(
            @RequestParam(defaultValue ="ru") String lang,
            @RequestParam(defaultValue = "last") String date) {

        return new ResponseEntity<>(aggregatesClient.getSecurityAggregates(lang, date), HttpStatus.OK);
    }
}