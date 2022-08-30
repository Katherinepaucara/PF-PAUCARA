
package com.portafolio.paucara.Service;

import com.portafolio.paucara.Entity.Educacion;
import com.portafolio.paucara.Repository.REducacion;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Seducacion {
    @Autowired
    REducacion rEducacion;
    
     public List<Educacion> list(){
        return rEducacion.findAll();
    }
     
     public Optional<Educacion> getOne(int id){
        return rEducacion.findById(id);
    }
    
    public Optional<Educacion> getByNombreED(String nombreED){
        return rEducacion.findByNombreED(nombreED);
    }
    
    public void save(Educacion educacion){
        rEducacion.save(educacion);
    }
    
    public void delete(int id){
        rEducacion.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rEducacion.existsById(id);
    }
    
    public boolean existsByNombreED(String nombreED){
        return rEducacion.existsByNombreED(nombreED);
    }
}
