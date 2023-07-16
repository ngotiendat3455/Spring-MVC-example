package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.responsitories.BookResponsitory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    private final BookResponsitory bookResponsitory;

    public BookController(BookResponsitory bookResponsitory) {
        this.bookResponsitory = bookResponsitory;
    }
    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books", bookResponsitory.findAll());
        return "books/lists";
    }

}
