package dev.thuta.server.repo;

import dev.thuta.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server, Long> {

    Server findByIpAddress(String ipAddress);
    Server findByName(String name);

}
