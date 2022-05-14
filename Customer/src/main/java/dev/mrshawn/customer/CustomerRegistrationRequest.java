package dev.mrshawn.customer;

public record CustomerRegistrationRequest(
		String firstName,
		String lastName,
		String email
) { }
