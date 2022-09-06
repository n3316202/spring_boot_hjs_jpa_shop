package edu.hi.shop.controller;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MainController {

    //private final ItemService itemService;

    @GetMapping(value = "/")
    public String main(){

		/*
		 * Pageable pageable = PageRequest.of(page.isPresent() ? page.get() : 0, 6);
		 * Page<MainItemDto> items = itemService.getMainItemPage(itemSearchDto,
		 * pageable);
		 * 
		 * model.addAttribute("items", items); model.addAttribute("itemSearchDto",
		 * itemSearchDto); model.addAttribute("maxPage", 5);
		 */

        return "main";
    }

}