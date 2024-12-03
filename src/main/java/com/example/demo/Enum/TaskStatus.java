package com.example.demo.Enum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TaskStatus {
    PENDING,
    IN_PROGRESS,
    COMPLETED;

    @JsonCreator
    public static TaskStatus fromString(String value) {
        for (TaskStatus status : TaskStatus.values()) {
            if (status.name().equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid Task Status: " + value);
    }

    @JsonValue
    public String toValue() {
        return name();
    }
}
