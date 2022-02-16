package web.kata.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.kata.demo.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
