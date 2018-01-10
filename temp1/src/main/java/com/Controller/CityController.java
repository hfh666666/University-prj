package com.Controller;

import com.Bean.City;
import com.Services.CityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/api/v1")
public class CityController {
    @Autowired
    private CityServices cityServices;

    @RequestMapping("/Citys")
    public String findAll(@PageableDefault(size = 3,sort = {"id"},direction = Sort.Direction.ASC) Pageable pageable,
                          Model model){
        Page<City> list=cityServices.findAllByPage(pageable);
        model.addAttribute("City",list);
        return "index";

    }
}
