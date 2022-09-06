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
import org.springframework.web.bind.annotation.RestController;
import space.eliseev.iplatformmoex.model.entity.*;
import space.eliseev.iplatformmoex.service.MetadataService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value ="/metadata", produces = "application/json; charset=UTF-8")
@Tag(name = "Metadata API", description = "Cервис получения метаданных (справочников)")
public class MetadataController {

    private final MetadataService metadataService;

    @Operation(
            summary = "Gets all BoardGroup",
            description = "Получить список всех BoardGroup",
            tags = {"Metadata API"})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = BoardGroup.class))),
                    description = "Successful operation")
    })
    @GetMapping(value = "/getBoardGroup")
    public ResponseEntity<List<BoardGroup>> getBoardGroup() {
        return new ResponseEntity<>(metadataService.getBoardGroup(), HttpStatus.OK);
    }

    @Operation(
            summary = "Gets all BoardGroup",
            description = "Получить список всех BoardGroup",
            tags = {"Metadata API"})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Board.class))),
                    description = "Successful operation")
    })
    @GetMapping(value = "/getBoard")
    public ResponseEntity<List<Board>> getBoard() {
        return new ResponseEntity<>(metadataService.getBoard(), HttpStatus.OK);
    }

    @Operation(
            summary = "Gets all Duration",
            description = "Получить список всех Duration",
            tags = {"Metadata API"})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Duration.class))),
                    description = "Successful operation")
    })
    @GetMapping(value = "/getDuration")
    public ResponseEntity<List<Duration>> getDuration() {
        return new ResponseEntity<>(metadataService.getDuration(), HttpStatus.OK);
    }

    @Operation(
            summary = "Gets all Engine",
            description = "Получить список всех Engine",
            tags = {"Metadata API"})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Engine.class))),
                    description = "Successful operation")
    })
    @GetMapping(value = "/getEngine")
    public ResponseEntity<List<Engine>> getEngine() {
        return new ResponseEntity<>(metadataService.getEngine(), HttpStatus.OK);
    }

    @Operation(
            summary = "Gets all Market",
            description = "Получить список всех Market",
            tags = {"Metadata API"})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Market.class))),
                    description = "Successful operation")
    })
    @GetMapping(value = "/getMarket")
    public ResponseEntity<List<Market>> getMarket() {
        return new ResponseEntity<>(metadataService.getMarket(), HttpStatus.OK);
    }

    @Operation(
            summary = "Gets all SecurityCollection",
            description = "Получить список всех SecurityCollection",
            tags = {"Metadata API"})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = SecurityCollection.class))),
                    description = "Successful operation")
    })
    @GetMapping(value = "/getSecurityCollection")
    public ResponseEntity<List<SecurityCollection>> getSecurityCollection() {
        return new ResponseEntity<>(metadataService.getSecurityCollection(), HttpStatus.OK);
    }

    @Operation(
            summary = "Gets all SecurityGroup",
            description = "Получить список всех SecurityGroup",
            tags = {"Metadata API"})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = SecurityGroup.class))),
                    description = "Successful operation")
    })
    @GetMapping(value = "/getSecurityGroup")
    public ResponseEntity<List<SecurityGroup>> getSecurityGroup() {
        return new ResponseEntity<>(metadataService.getSecurityGroup(), HttpStatus.OK);
    }

    @Operation(
            summary = "Gets all SecurityType",
            description = "Получить список всех SecurityType",
            tags = {"Metadata API"})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = SecurityType.class))),
                    description = "Successful operation")
    })
    @GetMapping(value = "/getSecurityType")
    public ResponseEntity<List<SecurityType>> getSecurityType() {
        return new ResponseEntity<>(metadataService.getSecurityType(), HttpStatus.OK);
    }
}
