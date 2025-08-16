package com.example.timesheet.service;

import com.example.timesheet.dto.TimesheetDTO;
import com.example.timesheet.repository.TimesheetJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TimesheetService {

    @Autowired
    private TimesheetJdbcRepository repository;

    public int createTimesheets(List<TimesheetDTO> timesheets) {
        return repository.save(timesheets);
    }

    public int updateTimesheets(List<TimesheetDTO> timesheets) {
        return repository.update(timesheets);
    }

    public List<TimesheetDTO> getAllTimesheets() {
        return repository.findAll();
    }

    public TimesheetDTO getTimesheetById(Long id) {
        return repository.findById(id);
    }

    public int deleteTimesheet(Long id) {
        return repository.delete(id);
    }
    
    public List<Map<String, Object>> getPaginatedTimesheets(int page, int pageSize) {
        return repository.getPaginatedTimesheets(page, pageSize);
    }
}
