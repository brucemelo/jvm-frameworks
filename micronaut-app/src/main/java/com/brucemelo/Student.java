package com.brucemelo;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record Student(String name) {
}
