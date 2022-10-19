package org.shop.controller;

import lombok.RequiredArgsConstructor;
import org.shop.domain.CodeGroup;
import org.shop.service.CodeGroupService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/codegroup")
public class CodeGroupController {

    private final CodeGroupService service;

    @GetMapping("/register")
    public void registerForm(Model model) throws Exception {

        CodeGroup codeGroup = new CodeGroup();

        model.addAttribute(codeGroup);
    }
}
