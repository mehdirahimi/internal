package ir.divan.internal.webservice;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping(value = "/web/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> webGet() {
        return ResponseEntity.ok("Hello");
    }

}
