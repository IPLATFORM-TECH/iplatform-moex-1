package space.eliseev.iplatformmoex.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import space.eliseev.iplatformmoex.model.entity.Engine;
import space.eliseev.iplatformmoex.service.EngineService;

import javax.websocket.server.PathParam;


@RestController
@RequestMapping("/engine")
@Tag(name = "Engine API", description = "Сервис получения доступных торговых систем")
public class EngineController {

    private final EngineService engineService;

    public EngineController(EngineService engineService) {
        this.engineService = engineService;
    }

    @Operation(
            summary = "Get all Engines",
            description = "Получить список всех доступных торговых систем",
            tags = "Engine API"
    )
    @Parameter(description = "Язык описания", required = false, name = "lang")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    content = @Content(mediaType = "application/json"),
                    description = "Successful operation")
    })
    @GetMapping("/getEngines")
    public ResponseEntity<Object> getEngines(@RequestParam(defaultValue = "en") String lang) {
        return ResponseEntity.ok().body(engineService.getEngines(lang));
    }

    @Operation(
            summary = "Get Engine",
            description = "Получить информацию по выбранной торговой системе",
            tags = "Engine API"
    )
    @Parameter(description = "Выбранная торговая система", required = true, name = "engine")
    @Parameter(description = "Язык описания", required = false, name = "lang")
    @Parameter(description = "Состав полей в ответе", required = false, name = "timetable.columns")
    @Parameter(description = "Включить metadata в ответ", required = false, name = "iss.meta")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    content = @Content(mediaType = "application/json"),
                    description = "Successful operation")
    })
    @GetMapping("/getEngines/{engine}")
    public ResponseEntity<Object> getEngine(@PathVariable("engine") String engine,
                                            @RequestParam(defaultValue = "en") String lang,
                                            @RequestParam(value = "timetable.columns", required = false) String timetable,
                                            @RequestParam(value = "iss.meta", required = false) String meta) {
        return ResponseEntity.ok().body(engineService.getEngine(engine, lang, timetable, meta));
    }
}
