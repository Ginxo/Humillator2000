package es.eoi.humillator2000.data.repository;

import es.eoi.humillator2000.data.entity.ClubRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserGroupRoleRepository extends JpaRepository<ClubRole, Integer> {
}
