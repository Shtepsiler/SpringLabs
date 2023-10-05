package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.model.Employee;

@Controller
public class MainController {
    @Autowired
    private EmployeeDAO employeeDAO;
        @RequestMapping("/")
    public String handleRequest(Model model) {
        List<Employee> employees = employeeDAO.getEmployees();
        model.addAttribute("employees", employees);
        return "employee";
    }
}