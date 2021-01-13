package org.mddarr.userrequestservice.user;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

//tag::class[]
public interface UserRepository extends CrudRepository<User, UserId>, UserRepositoryCustom {
    Optional<User> findByEmailIgnoreCase(String email);
}
//end::class[]
