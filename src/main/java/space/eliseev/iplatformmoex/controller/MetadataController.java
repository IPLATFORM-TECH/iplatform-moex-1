package space.eliseev.iplatformmoex.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import space.eliseev.iplatformmoex.model.entity.*;
import space.eliseev.iplatformmoex.service.MetadataService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value ="/metadata", produces = "application/json; charset=UTF-8")
public class  MetadataController {

    private final MetadataService metadataService;

    @GetMapping(value = "/getBoardGroup")
    public ResponseEntity<List<BoardGroup>> getBoardGroup() {
        return new ResponseEntity<>(metadataService.getBoardGroup(), HttpStatus.OK);
    }

    @GetMapping(value = "/getBoard")
    public ResponseEntity<List<Board>> getBoard() {
        return new ResponseEntity<>(metadataService.getBoard(), HttpStatus.OK);
    }

    @GetMapping(value = "/getDuration")
    public ResponseEntity<List<Duration>> getDuration() {
        return new ResponseEntity<>(metadataService.getDuration(), HttpStatus.OK);
    }

    @GetMapping(value = "/getEngine")
    public ResponseEntity<List<Engine>> getEngine() {
        return new ResponseEntity<>(metadataService.getEngine(), HttpStatus.OK);
    }

    @GetMapping(value = "/getMarket")
    public ResponseEntity<List<Market>> getMarket() {
        return new ResponseEntity<>(metadataService.getMarket(), HttpStatus.OK);
    }

    @GetMapping(value = "/getSecurityCollection")
    public ResponseEntity<List<SecurityCollection>> getSecurityCollection() {
        return new ResponseEntity<>(metadataService.getSecurityCollection(), HttpStatus.OK);
    }

    @GetMapping(value = "/getSecurityGroup")
    public ResponseEntity<List<SecurityGroup>> getSecurityGroup() {
        return new ResponseEntity<>(metadataService.getSecurityGroup(), HttpStatus.OK);
    }

    @GetMapping(value = "/getSecurityType")
    public ResponseEntity<List<SecurityType>> getSecurityType() {
        return new ResponseEntity<>(metadataService.getSecurityType(), HttpStatus.OK);
    }
}
