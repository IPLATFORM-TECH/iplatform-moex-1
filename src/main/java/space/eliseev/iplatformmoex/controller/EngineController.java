package space.eliseev.iplatformmoex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import space.eliseev.iplatformmoex.model.entity.Engine;
import space.eliseev.iplatformmoex.util.EngineClient;

@RestController
public class EngineController {

    private final EngineClient engineClient:

    public EngineController(EngineClient engineClient) {
        this.engineClient = engineClient;
    }

    @GetMapping("/engines")
    public ResponseEntity<List<Engine>> getEngines(@RequestParam(name = "lang") String lang) {
        return new ResponseEntity<List<Engine>>(engineClient.getEngines(lang));
    }
}
