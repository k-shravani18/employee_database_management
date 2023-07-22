package org.management.employee_database_management.controller;

import org.management.employee_database_management.model.User;
import org.management.employee_database_management.repository.UserRepository;
import org.management.employee_database_management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.nio.charset.StandardCharsets;

@Controller
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("loginForm", new User());
        return "login";
}

    @GetMapping("/register")
    public String showRegistrationPage(@ModelAttribute("user") User user) {
        return "user_registration";
    }


    @PostMapping("/process_register")
    public String registerUser(@ModelAttribute("user") User user,Model model) {
        // Check if the username already exists
        User existingUser = userService.findByUnameAndPass(user.getUsername(),user.getPassword());
        if (existingUser != null) {
            // Handle the case where the username already exists
//            throw new IllegalStateException("Username already exists");
            model.addAttribute("error", "Username already exists");
            return "user_registration";
        }

        // Register the user
        userService.registerUser(user);
        return "redirect:/api/users/login";
    }
    @PostMapping("/processLogin")
    public ModelAndView processLoginForm(@ModelAttribute("login") User user, HttpServletRequest request) {
        User validUser = userService.findByUnameAndPass(user.getUsername(), user.getPassword());

        if (validUser != null) {
            String sourceCode = user.getUsername()+":"+user.getPassword();
            String encode = "Basic "+ Base64Utils.encodeToString(sourceCode.getBytes(StandardCharsets.UTF_8));
            HttpSession session = request.getSession();
            session.setAttribute("auth-token", encode);
            return new ModelAndView("redirect:/api/users/dashboard");
        } else {
            ModelAndView modelAndView = new ModelAndView("login");
            modelAndView.addObject("loginForm", user);
            modelAndView.addObject("error", "Invalid username or password");
            return modelAndView;
        }
    }


    @GetMapping("/dashboard")
    public ModelAndView showAdminForm() {
        return new ModelAndView("dashboard");
    }



    @GetMapping("/hr/details")
    public String hrDetails() {
        return "hr-details";
    }

    @GetMapping("/manager/details")
    public String managerDetails() {
        return "manager-details";
    }

    @GetMapping("/devops/details")
    public String devOpsDetails() {
        return "devops-details";
    }

    @GetMapping("/development/details")
    public String developmentDetails() {
        return "development-details";
    }

    @GetMapping("/infrastructure/details")
    public String infrastructureDetails() {
        return "infrastructure-details";
    }

    @GetMapping("/cto/details")
    public String ctoDetails() {
        return "cto-details";
    }

    @GetMapping("/appsupport/details")
    public String appSupportDetails() {
        return "appsupport-details";
    }

    @GetMapping("/accountant/details")
    public String accountantDetails() {
        return "accountant-details";
    }
}
