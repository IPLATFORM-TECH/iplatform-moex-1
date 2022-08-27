package space.eliseev.iplatformmoex.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import space.eliseev.iplatformmoex.service.client.SecurityClient;

import java.util.List;

@RestController
@RequestMapping("/security")
public class SecurityController {

    private SecurityClient securityClient;

    public SecurityController(SecurityClient securityClient) {
        this.securityClient = securityClient;
    }


    @GetMapping("/getSecurity")
    public ResponseEntity<List<Object>> getSecurity(@RequestParam("security") String security,
                                                    @RequestParam(value = "lang", required = false) String lang,
                                                    @RequestParam(value = "start", required = false) Integer start) {

        return ResponseEntity.ok().body(securityClient.getSecurities(security, lang, start));
    }
}
