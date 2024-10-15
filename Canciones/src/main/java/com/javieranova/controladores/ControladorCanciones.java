package com.javieranova.controladores;

import java.util.List;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.javieranova.modelos.Cancion;
import com.javieranova.servicios.ServicioCanciones;

@Controller
public class ControladorCanciones {
    
    @Autowired
    private ServicioCanciones servicioCanciones;

    @GetMapping("/canciones")
    public String desplegarCanciones(Model model) {
        List<Cancion> listaCanciones = servicioCanciones.obtenerTodasLasCanciones();
        model.addAttribute("canciones", listaCanciones);
        return "canciones.jsp";
    }

    @GetMapping("/canciones/detalle/{idCancion}")
    public String desplegarDetalleCancion(@PathVariable("idCancion") Long idCancion, Model model) {
        Cancion cancion = servicioCanciones.obtenerCancionPorId(idCancion);
        
        if (cancion != null) {
            model.addAttribute("cancion", cancion);
        } else {
            return "redirect:/canciones";
        }

        return "detalleCancion.jsp";
    }

    @GetMapping("/canciones/formulario/agregar")
    public String formularioAgregarCancion(Model model) {
        model.addAttribute("cancion", new Cancion()); 
        return "agregarCancion.jsp"; 
    }

    @PostMapping("/canciones/procesa/agregar")
    public String procesarAgregarCancion(@Valid @ModelAttribute("cancion") Cancion cancion, 
    									 BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "agregarCancion.jsp"; 
        }

        servicioCanciones.agregarCancion(cancion);
        return "redirect:/canciones";
    }
}
