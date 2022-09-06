package repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import movies.entities.*;

public interface UserMovieRepository extends JpaRepository<EntityUserMovie, Integer>{
	Optional<EntityUserMovie> findByUserId(Integer userid, Integer movieid);
}
	