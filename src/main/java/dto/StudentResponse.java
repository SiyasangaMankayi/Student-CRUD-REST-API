package com.example.senddatabase.dto;

    public record StudentResponse(
            Long id,
            String firstName,
            String lastName,
            String email
    ) {
    }

