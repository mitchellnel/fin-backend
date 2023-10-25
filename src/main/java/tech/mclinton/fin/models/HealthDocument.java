package tech.mclinton.fin.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "health")
public class HealthDocument {
    @Id
    private String id;

    private String message;

    public HealthDocument() {}

    public HealthDocument(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
