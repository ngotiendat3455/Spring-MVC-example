package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.responsitories.AuthorResponsitory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
    private final AuthorResponsitory authorResponsitory;

    public AuthorController(AuthorResponsitory authorResponsitory) {
        this.authorResponsitory = authorResponsitory;
    }
    @RequestMapping("/authors")
    public String getAuthors(Model model){
        model.addAttribute("authors", authorResponsitory.findAll());
        return "authors/lists";
    }
}
