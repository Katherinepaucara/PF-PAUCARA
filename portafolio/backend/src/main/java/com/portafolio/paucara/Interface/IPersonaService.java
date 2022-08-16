package com.portafolio.paucara.Interface;

import com.portafolio.paucara.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //llamar lista 
    public List<Persona> getPersona();
    //guardar dato 
    public void savePersona(Persona persona);
    //eliminar dato por id
    public void deletePersona(Long id);
    //buscar dato pot Id
    public Persona findPersona(Long id);
}