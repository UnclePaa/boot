package by.tms.boot.repo;

import by.tms.boot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegUserRepository extends JpaRepository<User, Long> {
}