package com.codigofacilito.proyecto.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

@Controller
public class IndexController {

    @GetMapping("/")  /* Indica que el método index responderá a las solicitudes GET en la ruta "/" */
    public String index(Model model) {
        model.addAttribute("titulo", "Page");
        model.addAttribute("saludo", "Hola Daniel");
        model.addAttribute("show", false);
        List<String> series = null;//List.of("Dexter","Game of Thrones", "Vikings");
        model.addAttribute("series", series);

        return "index";
    }

    @PostMapping("/index-post-mapping")
    public String indexPostMapping() {
        return "index";
    }
}

