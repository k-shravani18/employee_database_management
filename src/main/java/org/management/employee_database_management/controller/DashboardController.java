package org.management.employee_database_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api/db")
public class DashboardController {

    @GetMapping("/dashboard")
    public ModelAndView showAdminForm() {
        return new ModelAndView("dashboard");
    }
    @GetMapping("/leave-tracker")
    public String showLeaveTrackerPage() {
        return "leave_tracker";
    }

    @GetMapping("/attendance")
    public String showAttendancePage() {
        return "attendance";
    }

    @GetMapping("/organization")
    public String showOrganizationPage() {
        return "organization";
    }

    @GetMapping("/compensation")
    public String showCompensationPage() {
        return "compensation";
    }

    @GetMapping("/self-service")
    public String showSelfServicePage() {
        return "self_service";
    }
}
