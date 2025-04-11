package com.practice.common.dto;

public record EmailVerificationEvent
        (
                String email,
                String token
        )
{}
