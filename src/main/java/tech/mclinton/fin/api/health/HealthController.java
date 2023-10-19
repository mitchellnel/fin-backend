package tech.mclinton.fin.api.health;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("HealthController")
@CrossOrigin
@RequestMapping("/api/health")
public class HealthController {
    @GetMapping
    public ResponseEntity<String> HealthHandler() {
        return ResponseEntity.ok("Hello, Fin!");
    }
}
