package org.shop.controller;

import lombok.RequiredArgsConstructor;
import org.shop.domain.CodeGroup;
import org.shop.service.CodeGroupService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

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

    @PostMapping("/register")
    public String register(CodeGroup codeGroup, RedirectAttributes rttr) throws Exception {

        service.register(codeGroup);

        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/codegroup/list";
    }

    @GetMapping("/list")
    public void list(Model model) throws Exception {

        List<CodeGroup> list = service.list();

        model.addAttribute("list", list);
    }

    @GetMapping("/read")
    public void read(String groupCode, Model model) throws Exception {

        CodeGroup read = service.read(groupCode);

        model.addAttribute(read);
    }
}
