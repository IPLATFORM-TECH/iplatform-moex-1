package space.eliseev.iplatformmoex.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import space.eliseev.iplatformmoex.service.EngineService;


@RestController
@RequestMapping("/engine")
public class EngineController {

    private final EngineService engineService;

    public EngineController(EngineService engineService) {
        this.engineService = engineService;
    }
    @GetMapping("/getEngines")
    public ResponseEntity<Object> getEngines(@RequestParam(defaultValue = "en") String lang) {
        return ResponseEntity.ok().body(engineService.getEngines(lang));
    }

    @GetMapping("/getEngines/{engine}")
    public ResponseEntity<Object> getEngine(@PathVariable("engine") String engine,
                                            @RequestParam(defaultValue = "en") String lang,
                                            @RequestParam(value = "timetable.columns", required = false) String timetable,
                                            @RequestParam(value = "iss.meta", required = false) String meta) {
        return ResponseEntity.ok().body(engineService.getEngine(engine, lang, timetable, meta));
    }
}
