package ru.gb.runov.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.runov.auth.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findByName(String name);

}
