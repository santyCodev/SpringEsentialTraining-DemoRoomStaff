package com.santicodev.springessentialtraining.data;

public enum Position {

    HOUSEKEEPING, FRONT_DESK, SECURITY, CONCIERGE;

    public String toString() {
        switch (this) {
            case CONCIERGE:
                return "Concierge";
            case SECURITY:
                return "Security";
            case FRONT_DESK:
                return "Front Desk";
            case HOUSEKEEPING:
                return "Housekeeping";
        }
        return "";
    }
}
