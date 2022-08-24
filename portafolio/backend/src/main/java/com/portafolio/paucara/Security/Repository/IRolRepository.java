package com.portafolio.paucara.Security.Repository;

import com.portafolio.paucara.Security.Entity.Rol;
import com.portafolio.paucara.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol,Integer>{
   Optional<Rol> findByRolNombre(RolNombre rolNombre);

    
}