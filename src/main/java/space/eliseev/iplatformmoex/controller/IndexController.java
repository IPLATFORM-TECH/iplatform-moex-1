package space.eliseev.iplatformmoex.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "Index API", description = "Cервис получения индексов")
public class IndexController {

    private final IndexService indexService;

    @Operation(
            summary = "Gets all Engines",
            description = "Получить список всех Engines",
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
    public ResponseEntity<List<Engine>> getEngines() {
        return new ResponseEntity<>(indexService.getEngines(), HttpStatus.OK);
    }

    @Operation(
            summary = "Gets all Markets",
            description = "Получить список всех Markets",
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
    public ResponseEntity<List<Market>> getMarkets() {
        return new ResponseEntity<>(indexService.getMarkets(), HttpStatus.OK);
    }

    @Operation(
            summary = "Gets all Board",
            description = "Получить список всех Board",
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
    public ResponseEntity<List<Board>> getBoards() {
        return new ResponseEntity<>(indexService.getBoards(), HttpStatus.OK);
    }

    @Operation(
            summary = "Gets all BoardGroup",
            description = "Получить список всех BoardGroup",
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
    public ResponseEntity<List<BoardGroup>> getBoardGroups() {
        return new ResponseEntity<>(indexService.getBoardGroups(), HttpStatus.OK);
    }

    @Operation(
            summary = "Gets all Durations(",
            description = "Получить список всех Durations(",
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
    public ResponseEntity<List<Duration>> getDurations() {
        return new ResponseEntity<>(indexService.getDurations(), HttpStatus.OK);
    }

    @Operation(
            summary = "Gets all SecurityGroups",
            description = "Получить список всех SecurityGroups",
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
    public ResponseEntity<List<SecurityGroup>> getSecurityGroups() {
        return new ResponseEntity<>(indexService.getSecurityGroups(), HttpStatus.OK);
    }

    @Operation(
            summary = "Gets all SecurityCollections",
            description = "Получить список всех SecurityCollections",
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
    public ResponseEntity<List<SecurityCollection>> getSecurityCollections() {
        return new ResponseEntity<>(indexService.getSecurityCollections(), HttpStatus.OK);
    }
}
