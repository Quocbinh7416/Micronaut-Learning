package com.example;

import io.micronaut.core.annotation.Introspected;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Introspected
public class Book {
    @NotNull
    @NotBlank
    private final String isbn;

    @NotNull
    @NotBlank
    private final String name;

    public Book(@NotNull @NotBlank String isbn,
                @NotNull @NotBlank String name) {
        this.isbn = isbn;
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, name);
    }
}
