package giakhang.ntu65131433.qlbh.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import giakhang.ntu65131433.qlbh.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);
}