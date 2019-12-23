package com.codelean.controler;

import com.codelean.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("employee/")
public class EmployeeController {
    @GetMapping("create")
    public String create(ModelMap model){
        model.addAttribute("employee", new Employee("id", "name","contactnumber"));
        return "employee/create";
    }

    @PostMapping("addEmployee")
    public ModelAndView addEmployee(@ModelAttribute("employee")Employee employee,
                         BindingResult result, ModelMap model) {
        ModelAndView modelAndView;
        if (result.hasErrors()) {
            modelAndView = new ModelAndView("employee/error", "employee", employee);
            return modelAndView;
        }

        modelAndView = new ModelAndView("employee/info", "employee", employee);
        return modelAndView;
    }
}
