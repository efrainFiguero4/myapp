package edu.webintegrado.myapp.controller;

import edu.webintegrado.myapp.domain.Contacto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactoController {

    @GetMapping("/contacto")
    public String contacto(Model model){
        Contacto contacto = new Contacto();
        contacto.setNombre("Soy el Controlador de Contacto");
        model.addAttribute("contacto", contacto);
        return "mypagina";
    }
}
