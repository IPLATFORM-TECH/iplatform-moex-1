package space.eliseev.iplatformmoex.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import space.eliseev.iplatformmoex.model.entity.*;
import space.eliseev.iplatformmoex.service.IndexService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/index")
@Tag(name = "Index API", description = "Cервис получения индексов")
public class IndexController {

    private final IndexService indexService;

    @Operation(
            summary = "Gets all Engines",
            description = "Получить список всех Engines (язык результата: ru или en)",
            tags = {"Index API"})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Engine.class))),
                    description = "Successful operation")
    })
    @GetMapping("/getEngines")
    public ResponseEntity<List<Engine>> getEngines(@RequestParam(defaultValue = "ru") String lang) {
        return new ResponseEntity<>(indexService.getEngines(lang), HttpStatus.OK);
    }

    @Operation(
            summary = "Gets all Markets",
            description = "Получить список всех Markets (язык результата: ru или en)",
            tags = {"Index API"})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Market.class))),
                    description = "Successful operation")
    })
    @GetMapping("/getMarkets")
    public ResponseEntity<List<Market>> getMarkets(@RequestParam(defaultValue = "ru") String lang) {
        return new ResponseEntity<>(indexService.getMarkets(lang), HttpStatus.OK);
    }

    @Operation(
            summary = "Gets all Board",
            description = "Получить список всех Board (язык результата: ru или en)",
            tags = {"Index API"})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Board.class))),
                    description = "Successful operation")
    })
    @GetMapping("/getBoards")
    public ResponseEntity<List<Board>> getBoards(@RequestParam(defaultValue = "ru") String lang) {
        return new ResponseEntity<>(indexService.getBoards(lang), HttpStatus.OK);
    }

    @Operation(
            summary = "Gets  BoardGroupsr (seach by arguments)",
            description = "Получить список BoardGroups (язык результата: ru или en)",
            tags = {"Index API"})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = BoardGroup.class))),
                    description = "Successful operation")
    })
    @GetMapping("/getBoardGroups")
    public ResponseEntity<List<BoardGroup>> getBoardGroups(@RequestParam(defaultValue = "ru") String lang,
                                                           @RequestParam(value = "engine")
                                                           space.eliseev.iplatformmoex.model.enumeration.Engine engine,
                                                           @RequestParam(defaultValue = "0", required = false) Integer isTraded) {
        return new ResponseEntity<>(indexService.getBoardGroups(lang, engine, isTraded), HttpStatus.OK);
    }

    @Operation(
            summary = "Gets all Durations",
            description = "Получить список всех Durations (язык результата: ru или en)",
            tags = {"Index API"})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Duration.class))),
                    description = "Successful operation")
    })
    @GetMapping("/getDurations")
    public ResponseEntity<List<Duration>> getDurations(@RequestParam(defaultValue = "ru") String lang) {
        return new ResponseEntity<>(indexService.getDurations(lang), HttpStatus.OK);
    }

    @Operation(
            summary = "Gets SecurityTypes (seach by arguments)",
            description = "Получить список SecurityTypes (язык результата: ru или en)",
            tags = {"Index API"})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = SecurityGroup.class))),
                    description = "Successful operation")
    })
    @GetMapping("/getSecurityTipes")
    public ResponseEntity<List<SecurityType>> getSecurityTypes(@RequestParam(defaultValue = "ru") String lang,
                                                               @RequestParam(value = "engine")
                                                               space.eliseev.iplatformmoex.model.enumeration.Engine engine) {
        return new ResponseEntity<>(indexService.getSecurityTypes(lang, engine), HttpStatus.OK);
    }


    @Operation(
            summary = "Gets SecurityGroups (seach by arguments)",
            description = "Получить список SecurityGroups (язык результата: ru или en)",
            tags = {"Index API"})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = SecurityGroup.class))),
                    description = "Successful operation")
    })
    @GetMapping("/getSecurityGroups")
    public ResponseEntity<List<SecurityGroup>> getSecurityGroups(@RequestParam(defaultValue = "ru") String lang,
                                                                 @RequestParam(value = "hide_inactive", defaultValue = "0") Integer hideInactive,
                                                                 @RequestParam(value = "securitygroups")
                                                                 space.eliseev.iplatformmoex.model.enumeration.SecurityGroup securityGroup,
                                                                 @RequestParam(value = "trade_engine", required = false) Integer tradeEngine) {
        return new ResponseEntity<>(indexService.getSecurityGroups(lang, hideInactive, securityGroup, tradeEngine), HttpStatus.OK);
    }

    @Operation(
            summary = "Gets all SecurityCollections",
            description = "Получить список всех SecurityCollections (язык результата: ru или en)",
            tags = {"Index API"})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = SecurityCollection.class))),
                    description = "Successful operation")
    })
    @GetMapping("/getSecurityCollections")
    public ResponseEntity<List<SecurityCollection>> getSecurityCollections(@RequestParam(defaultValue = "ru") String lang) {
        return new ResponseEntity<>(indexService.getSecurityCollections(lang), HttpStatus.OK);
    }
}
