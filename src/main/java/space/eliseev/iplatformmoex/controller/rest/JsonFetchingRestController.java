package space.eliseev.iplatformmoex.controller.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import space.eliseev.iplatformmoex.model.entity.*;
import space.eliseev.iplatformmoex.model.enumeration.Board;
import space.eliseev.iplatformmoex.model.enumeration.Engine;
import space.eliseev.iplatformmoex.service.JsonFetchingService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class JsonFetchingRestController {
    private JsonFetchingService jsonFetchingService;

    @GetMapping("/getEngines")
    public ResponseEntity<List<Engine>> getEngines(@RequestParam(value = "lang", defaultValue = "ru") String lang) {
        return new ResponseEntity<>(jsonFetchingService.getJsonEntity().getEngines(),
                HttpStatus.OK);
    }

    @GetMapping("/getMarkets")
    public ResponseEntity<List<Market>> getMarkets(@RequestParam(value = "lang", defaultValue = "ru") String lang) {
        return new ResponseEntity<>(jsonFetchingService.getJsonEntity().getMarkets(),
                HttpStatus.OK);
    }

    @GetMapping("/getBoards")
    public ResponseEntity<List<Board>> getBoards(@RequestParam(value = "lang", defaultValue = "ru") String lang) {
        return new ResponseEntity<>(jsonFetchingService.getJsonEntity().getBoards(),
                HttpStatus.OK);
    }

    @GetMapping("/getBoardGroups")
    public ResponseEntity<List<BoardGroup>> getBoardGroups(@RequestParam(value = "lang", defaultValue = "ru") String lang,
                                                           @RequestParam(value = "engine", defaultValue = "") Engine engine,
                                                           @RequestParam(value = "is_traded", defaultValue = "0") Integer is_traded) {
        return new ResponseEntity<>(jsonFetchingService.getJsonEntity().getBoardGroups(),
                HttpStatus.OK);
    }

    @GetMapping("/getDurations")
    public ResponseEntity<List<Duration>> getDurations(@RequestParam(value = "lang", defaultValue = "ru") String lang) {
        return new ResponseEntity<>(jsonFetchingService.getJsonEntity().getDurations(),
                HttpStatus.OK);
    }

    @GetMapping("/getSecurityTypes")
    public ResponseEntity<List<SecurityType>> getSecurityTypes(@RequestParam(value = "engine", defaultValue = "") Engine engine,
                                                               @RequestParam(value = "lang", defaultValue = "ru") String lang) {
        return new ResponseEntity<>(jsonFetchingService.getJsonEntity().getSecurityTypes(),
                HttpStatus.OK);
    }

    @GetMapping("/getSecurityGroups")
    public ResponseEntity<List<SecurityGroup>> getSecurityGroups(@RequestParam(value = "lang", defaultValue = "ru") String lang,
                                                                 @RequestParam(value = "hide_inactive", defaultValue = "0") Integer hide_inactive,
                                                                 @RequestParam(value = "securitygroups", defaultValue = "") SecurityGroup securityGroups,
                                                                 @RequestParam(value = "trade_engine", defaultValue = "") Integer trade_engine) {
        return new ResponseEntity<>(jsonFetchingService.getJsonEntity().getSecurityGroups(),
                HttpStatus.OK);
    }

    @GetMapping("/getSecurityCollections")
    public ResponseEntity<List<SecurityCollection>> getSecurityCollections(@RequestParam(value = "lang", defaultValue = "ru") String lang) {
        return new ResponseEntity<>(jsonFetchingService.getJsonEntity().getSecurityCollections(),
                HttpStatus.OK);
    }
}
