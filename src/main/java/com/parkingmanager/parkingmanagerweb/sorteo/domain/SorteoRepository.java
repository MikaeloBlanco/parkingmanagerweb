package  com.parkingmanager.parkingmanagerweb.sorteo.domain;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 * @author Miguel Blanco Fernández
 * @author Adolfo Burgos Belgrano
 * @version 0.0.1
 * @since 12/04/2023
 */
@Repository
public interface SorteoRepository extends CrudRepository<Sorteo, Long> {
    /**
     * 
     */
}


