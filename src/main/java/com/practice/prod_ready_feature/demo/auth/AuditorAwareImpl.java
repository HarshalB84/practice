package com.practice.prod_ready_feature.demo.auth;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        // Get Security Context
        // Get Authentication
        // Get the Principle
        // Get the Username
        return Optional.of("Harshal Bhoyar");
    }
}
