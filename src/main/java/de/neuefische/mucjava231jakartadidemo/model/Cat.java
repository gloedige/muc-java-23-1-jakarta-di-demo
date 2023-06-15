package de.neuefische.mucjava231jakartadidemo.model;

import jakarta.validation.constraints.*;

public record Cat(
        @NotNull(message = "ID darf nicht null sein")
        @Pattern(regexp = "[0-9a-zA-Z]+", message = "ID darf nur aus 0-9, a-z und A-Z bestehen")
        String id,
        @NotNull(message = "Name darf nicht null sein")
        @NotBlank(message = "Name ist leer oder besteht nur aus Leerzeichen")
        @Size(min = 2, max = 20, message = "Minimum 2, maximal 20 Buchstaben")
        @Pattern(regexp = "[a-zA-Z]+", message = "Name darf nur aus Buchstaben bestehen")
        String name
) {
}
