package de.seuhd.campuscoffee.domain.ports;

import org.jspecify.annotations.NonNull;
import de.seuhd.campuscoffee.domain.model.User;
import de.seuhd.campuscoffee.domain.exceptions.DuplicationException;
import de.seuhd.campuscoffee.domain.exceptions.NotFoundException;

import java.util.List;

public interface UserService {
    //TODO: Define user service interface
    /** Clears all user data. */
    void clear();

    /** Retrieves all users.
     *
     * @return A list of all users.
     */
    @NonNull List<User> getAll();

    /** Retrieves a user by their ID.
     *
     * @param id The ID of the user.
     * @return The user with the specified ID.
     * @throws NotFoundException if the user is not found.
     */
    @NonNull User getById(@NonNull Long id);

    /** Retrieves a user by their login name.
     *
     * @param loginName The login name of the user.
     * @return The user with the specified login name.
     * @throws NotFoundException if the user is not found.
     */
    @NonNull User getByLoginName(@NonNull String loginName);

    /** Creates or updates a user.
     *
     * @param user The user to create or update.
     * @return The created or updated user.
     * @throws DuplicationException if a user with the same login name already exists.
     * @throws NotFoundException if updating a user that does not exist.
     */
    @NonNull User upsert(@NonNull User user);

    /** Deletes a user by their ID.
     *
     * @param id The ID of the user to delete.
     * @throws NotFoundException if the user is not found.
     */
    void delete(@NonNull Long id);


}
