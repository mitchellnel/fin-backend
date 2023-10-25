package tech.mclinton.fin.service;

import org.springframework.stereotype.Service;

import tech.mclinton.fin.models.HealthDocument;
import tech.mclinton.fin.repository.HealthRepository;

@Service("healthDatabase")
public class HealthService {
    private final HealthRepository healthRepository;

    public HealthService(HealthRepository healthRepository) {
        this.healthRepository = healthRepository;
    }

    public long count() {
        return healthRepository.count();
    }

    public String makeHealthCheck() {
        HealthDocument healthDocument = healthRepository.findByMessage("Hello, FinDB!");

        if (healthDocument == null) {
            return "";
        }

        return healthRepository.findByMessage("Hello, FinDB!").getMessage();
    }
}
