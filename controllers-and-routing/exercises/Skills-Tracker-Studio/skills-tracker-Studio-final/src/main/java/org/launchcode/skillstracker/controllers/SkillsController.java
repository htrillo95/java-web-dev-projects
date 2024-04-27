package org.launchcode.skillstracker.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam; // Import @RequestParam annotation


@Controller
public class SkillsController {

@GetMapping
public String index(Model model) {
    // Add programming languages to the model
    model.addAttribute("languages", new String[]{"Java", "Python", "JavaScript"});
    return "index"; // Return the name of the HTML template to render
}

    @GetMapping("form")
    public String form() {
        return "form"; // Return the name of the HTML template to render
    }

    @PostMapping("form")
    public String processForm(@RequestParam String name,
                              @RequestParam String favoriteLanguage,
                              @RequestParam String secondFavoriteLanguage,
                              @RequestParam String thirdFavoriteLanguage,
                              Model model) {
        // Update model with user's data
        model.addAttribute("name", name);
        model.addAttribute("favoriteLanguage", favoriteLanguage);
        model.addAttribute("secondFavoriteLanguage", secondFavoriteLanguage);
        model.addAttribute("thirdFavoriteLanguage", thirdFavoriteLanguage);
        return "submission"; // Return the name of the HTML template to render
    }

}
