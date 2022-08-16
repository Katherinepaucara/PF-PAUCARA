package com.portafolio.paucara.Controller;

import com.portafolio.paucara.Entity.Persona;
import com.portafolio.paucara.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("personas/traer")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "la persona se creo";
    }
    @DeleteMapping("/personas/eliminar/{id}")
       public String deletePersona(@PathVariable Long id){
        ipersonaService.deletePersona(id);
        return "la persona se elimino";
    }
    @PutMapping("/persona/editar/{id}")
    public Persona editPersona(@PathVariable Long id, 
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoapellido,
            @RequestParam("img") String nuevoimg){
        
        Persona persona = ipersonaService.findPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoapellido);
        persona.setImg(nuevoimg);
        
        ipersonaService.savePersona(persona);
        return persona;
    }
}
