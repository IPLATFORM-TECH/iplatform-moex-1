package space.eliseev.iplatformmoex.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import space.eliseev.iplatformmoex.service.EngineService;


@RestController
public class EngineController {

    private final EngineService engineService;

    public EngineController(EngineService engineService) {
        this.engineService = engineService;
    }

    @GetMapping("/engines")
    public ResponseEntity<Object> getEngines(@RequestParam(defaultValue = "en") String lang) {
        return ResponseEntity.ok().body(engineService.getEngine(lang));
    }
}
