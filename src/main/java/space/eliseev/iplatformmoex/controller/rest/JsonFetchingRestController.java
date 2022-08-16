package space.eliseev.iplatformmoex.controller.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
    public ResponseEntity<List<Engine>> getEngines() {
        return new ResponseEntity<>(jsonFetchingService.getJsonEntity().getEngines(),
                HttpStatus.OK);
    }

    @GetMapping("/getMarkets")
    public ResponseEntity<List<Market>> getMarkets() {
        return new ResponseEntity<>(jsonFetchingService.getJsonEntity().getMarkets(),
                HttpStatus.OK);
    }

    @GetMapping("/getBoards")
    public ResponseEntity<List<Board>> getBoards() {
        return new ResponseEntity<>(jsonFetchingService.getJsonEntity().getBoards(),
                HttpStatus.OK);
    }

    @GetMapping("/getBoardGroups")
    public ResponseEntity<List<BoardGroup>> getBoardGroups() {
        return new ResponseEntity<>(jsonFetchingService.getJsonEntity().getBoardGroups(),
                HttpStatus.OK);
    }

    @GetMapping("/getDurations")
    public ResponseEntity<List<Duration>> getDurations() {
        return new ResponseEntity<>(jsonFetchingService.getJsonEntity().getDurations(),
                HttpStatus.OK);
    }

    @GetMapping("/getSecurityGroups")
    public ResponseEntity<List<SecurityGroup>> getSecurityGroups() {
        return new ResponseEntity<>(jsonFetchingService.getJsonEntity().getSecurityGroups(),
                HttpStatus.OK);
    }

    @GetMapping("/getSecurityCollections")
    public ResponseEntity<List<SecurityCollection>> getSecurityCollections() {
        return new ResponseEntity<>(jsonFetchingService.getJsonEntity().getSecurityCollections(),
                HttpStatus.OK);
    }
}
