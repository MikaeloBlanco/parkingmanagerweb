package com.parkingmanager.parkingmanagerweb.user.domain;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 * Es un repositorio que permite la creación de usuarios dentro de una base de datos vinculada y esta unida a la clase User.
 * @author Miguel Blanco Fernández, Adolfo Burgos Belgrano
 * @version 0.0.1
 * @since 29/03/2023
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    
}
