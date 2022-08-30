
package com.portafolio.paucara.Repository;

import com.portafolio.paucara.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository<Educacion, Integer>{
     public Optional<Educacion> findByNombreED(String nombreED);
    public boolean existsByNombreED(String nombreED);
    
}
