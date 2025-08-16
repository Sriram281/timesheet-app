package com.example.timesheet.dto;

public class TimesheetWorkInfoDTO {
	private String id;
	private String timesheetId;
	private String jobCode;
    private String location;
    private String workingHrs;
	private String overtime;

	 public TimesheetWorkInfoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	 public TimesheetWorkInfoDTO(String id, String timesheetId, String jobCode, String location, String workingHrs,
				String overtime) {
			super();
			this.id = id;
			this.timesheetId = timesheetId;
			this.jobCode = jobCode;
			this.location = location;
			this.workingHrs = workingHrs;
			this.overtime = overtime;
		}
	 
    // getters and setters
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
    public String getTimesheetId() {
		return timesheetId;
	}
	public void setTimesheetId(String timesheetId) {
		this.timesheetId = timesheetId;
	}
    public String getJobCode() { 
    	return jobCode; 
    }
    public void setJobCode(String jobCode) {
    	this.jobCode = jobCode; 
    }

    public String getLocation() { 
    	return location; 
    }
    public void setLocation(String location) { 
    	this.location = location; 
    }

    public String getWorkingHrs() { 
    	return workingHrs; 
    }
    public void setWorkingHrs(String workingHrs) {
    	this.workingHrs = workingHrs; 
    }

    public String getOvertime() { 
    	return overtime; 
    }
    public void setOvertime(String overtime) {
    	this.overtime = overtime; 
    }
}
