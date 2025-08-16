package com.example.timesheet.controller;

import com.example.timesheet.dto.TimesheetDTO;
import com.example.timesheet.service.TimesheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/timesheet")
public class TimesheetController {

    @Autowired
    private TimesheetService service;

    // Create multiple records
    @PostMapping("/create")
    public String create(@RequestBody List<TimesheetDTO> timesheets) {
        int rows = service.createTimesheets(timesheets);
        return rows + " record(s) inserted successfully";
    }

    // Update multiple records
    @PutMapping("/update")
    public String update(@RequestBody List<TimesheetDTO> timesheets) {
        int rows = service.updateTimesheets(timesheets);
        return rows + " record(s) updated successfully";
    }

    @GetMapping
    public List<TimesheetDTO> getAll() {
        return service.getAllTimesheets();
    }

    @GetMapping("/{id}")
    public TimesheetDTO getById(@PathVariable Long id) {
        return service.getTimesheetById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteTimesheet(id);
        return "Timesheet deleted successfully";
    }
    
    // GET: /api/timesheets?page=1&pageSize=20
    @GetMapping("/paginated")
    public List<Map<String, Object>> getPaginatedTimesheets(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "500") int pageSize) {
    	
    	System.out.println("page : "+page);
    	System.out.println("pageSize : "+pageSize);
    	
        return service.getPaginatedTimesheets(page, pageSize);
    }
}
