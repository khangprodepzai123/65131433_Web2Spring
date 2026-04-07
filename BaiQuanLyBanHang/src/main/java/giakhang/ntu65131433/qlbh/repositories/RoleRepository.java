package giakhang.ntu65131433.qlbh.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import giakhang.ntu65131433.qlbh.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(String name);
}
