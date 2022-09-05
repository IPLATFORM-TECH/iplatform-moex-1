package space.eliseev.iplatformmoex.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import space.eliseev.iplatformmoex.model.entity.*;
import space.eliseev.iplatformmoex.service.IndexService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/index")
public class IndexController {

    private final IndexService indexService;

    @GetMapping("/getEngines")
    public ResponseEntity<List<Engine>> getEngines() {
        return new ResponseEntity<>(indexService.getEngines(), HttpStatus.OK);
    }

    @GetMapping("/getMarkets")
    public ResponseEntity<List<Market>> getMarkets() {
        return new ResponseEntity<>(indexService.getMarkets(), HttpStatus.OK);
    }

    @GetMapping("/getBoards")
    public ResponseEntity<List<Board>> getBoards() {
        return new ResponseEntity<>(indexService.getBoards(), HttpStatus.OK);
    }

    @GetMapping("/getBoardGroups")
    public ResponseEntity<List<BoardGroup>> getBoardGroups() {
        return new ResponseEntity<>(indexService.getBoardGroups(), HttpStatus.OK);
    }

    @GetMapping("/getDurations")
    public ResponseEntity<List<Duration>> getDurations() {
        return new ResponseEntity<>(indexService.getDurations(), HttpStatus.OK);
    }

    @GetMapping("/getSecurityGroups")
    public ResponseEntity<List<SecurityGroup>> getSecurityGroups() {
        return new ResponseEntity<>(indexService.getSecurityGroups(), HttpStatus.OK);
    }

    @GetMapping("/getSecurityCollections")
    public ResponseEntity<List<SecurityCollection>> getSecurityCollections() {
        return new ResponseEntity<>(indexService.getSecurityCollections(), HttpStatus.OK);
    }
}
