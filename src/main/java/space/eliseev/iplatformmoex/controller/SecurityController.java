package space.eliseev.iplatformmoex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/security")
    public Object getSecurity() {
    return new Object();
    }
}
