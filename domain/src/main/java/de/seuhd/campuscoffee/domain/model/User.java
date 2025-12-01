package de.seuhd.campuscoffee.domain.model;

import jakarta.annotation.Nullable;
import lombok.Builder;
import org.jspecify.annotations.NonNull;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Domain record that stores user metadata.
    * @param id unique identifier; null for new users
    * @param createdAt   timestamp set on creation
    * @param updatedAt   timestamp set on creation and update
    * @param loginName   unique login name
    * @param emailAddress unique email address
    * @param firstName   first name
    * @param lastName    last name
 */

@Builder(toBuilder = true)
public record User (
        @Nullable Long id,
        @Nullable LocalDateTime createdAt,
        @Nullable LocalDateTime updatedAt,
        @NonNull  String loginName,
        @NonNull  String emailAddress,
        @NonNull  String firstName,
        @NonNull  String lastName
        ) implements Serializable { // serializable to allow cloning (see TestFixtures class).
    @Serial
    private static final long serialVersionUID = 1L;
}
