package tech.mclinton.fin.api.health;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.mclinton.fin.service.HealthService;

@RestController("HealthController")
@CrossOrigin
@RequestMapping("/api/health")
public class HealthController {
    private final HealthService healthService;

    public HealthController(@Qualifier("healthDatabase") HealthService healthService) {
        this.healthService = healthService;
    }

    @GetMapping
    public ResponseEntity<String> HealthHandler() {
        return ResponseEntity.ok("Hello, Fin!");
    }

    @GetMapping("/mongo")
    public ResponseEntity<String> MongoHealthHandler() {
        String checkResponse = healthService.makeHealthCheck();

        if (checkResponse == null) {
            return ResponseEntity.internalServerError().build();
        }

        return ResponseEntity.ok(checkResponse);
    }
}
