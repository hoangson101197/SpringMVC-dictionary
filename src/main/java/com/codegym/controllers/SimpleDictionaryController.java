package com.codegym.controllers;

import com.codegym.model.Dictionary;
import com.codegym.services.DictionaryServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SimpleDictionaryController {
    private DictionaryServiceImpl dictionaryService = new DictionaryServiceImpl();

    @GetMapping("/index")
    public String search() {
        return "index";
    }

    @PostMapping("/result")
    public String meaning(@RequestParam String search, Model model) {
        List<Dictionary> dictionaries = this.dictionaryService.findAll();
        for (int i = 0; i < dictionaries.size(); i++) {
            if (search.equalsIgnoreCase(dictionaries.get(i).getEn())) {
                model.addAttribute("word", dictionaries.get(i).getVi());
                return "meaning";
            }
        }
        return "meaning";
    }
}

