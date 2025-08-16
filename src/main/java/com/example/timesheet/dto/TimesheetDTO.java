package com.example.timesheet.dto;

import java.util.List;

public class TimesheetDTO {
	private String id;
    private String date;
    private String status;
    private String fileName;
    private String fileType;
    private String assignTo;
    private String assignBy;
    private String empName;
    private String empBadgeNo;
    private String empID;
    private String empDept;
    private String inTime;
    private String outTime;
    private String totalInOut;
    private String allDayHrs;
    private String totalHrs;
    private String remarks;
    private String otTime;
    private String netMins;
    private String actualWorkHrs;
    private String normalWorkHrs;
    private String fidNo;
    private String companyName;
    private String trade;
    private String tradeCode;
    private String onAM;
    private String offAM;
    private String onPM;
    private String offPM;
    private String ctr;
    private String rec;
    private String avgDailyTD;
    private String highlightDayTG;
    private String aweSDN;
    private String totalNT;
    private String totalOT;
    private String totalNTOT;
//    private String empWorkInfo;
    private String fromDate;
    private String untilDate;
    private String location;
    private String mealAllow;
    private String verify;
    private String bpCompany;
    private String earliestEntryTime;
    private String latestEntryTime;
    private List<TimesheetWorkInfoDTO> empWorkInfo;
    
    public TimesheetDTO() {}
    
//    Constructor
    public TimesheetDTO(String id, String date, String status, String fileName, String fileType, String assignTo,
			String assignBy, String empName, String empBadgeNo, String empID, String empDept, String inTime,
			String outTime, String totalInOut, String allDayHrs, String totalHrs, String remarks, String otTime,
			String netMins, String actualWorkHrs, String normalWorkHrs, String fidNo, String companyName, String trade,
			String tradeCode, String onAM, String offAM, String onPM, String offPM, String ctr, String rec,
			String avgDailyTD, String highlightDayTG, String aweSDN, String totalNT, String totalOT, String totalNTOT,
			String fromDate, String untilDate, String location, String mealAllow, String verify,
			String bpCompany, String earliestEntryTime, String latestEntryTime) {
		super();
		this.id = id;
		this.date = date;
		this.status = status;
		this.fileName = fileName;
		this.fileType = fileType;
		this.assignTo = assignTo;
		this.assignBy = assignBy;
		this.empName = empName;
		this.empBadgeNo = empBadgeNo;
		this.empID = empID;
		this.empDept = empDept;
		this.inTime = inTime;
		this.outTime = outTime;
		this.totalInOut = totalInOut;
		this.allDayHrs = allDayHrs;
		this.totalHrs = totalHrs;
		this.remarks = remarks;
		this.otTime = otTime;
		this.netMins = netMins;
		this.actualWorkHrs = actualWorkHrs;
		this.normalWorkHrs = normalWorkHrs;
		this.fidNo = fidNo;
		this.companyName = companyName;
		this.trade = trade;
		this.tradeCode = tradeCode;
		this.onAM = onAM;
		this.offAM = offAM;
		this.onPM = onPM;
		this.offPM = offPM;
		this.ctr = ctr;
		this.rec = rec;
		this.avgDailyTD = avgDailyTD;
		this.highlightDayTG = highlightDayTG;
		this.aweSDN = aweSDN;
		this.totalNT = totalNT;
		this.totalOT = totalOT;
		this.totalNTOT = totalNTOT;
//		this.empWorkInfo = empWorkInfo;
		this.fromDate = fromDate;
		this.untilDate = untilDate;
		this.location = location;
		this.mealAllow = mealAllow;
		this.verify = verify;
		this.bpCompany = bpCompany;
		this.earliestEntryTime = earliestEntryTime;
		this.latestEntryTime = latestEntryTime;
		
	}
    
//    Getter and Setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getAssignTo() {
		return assignTo;
	}

	public void setAssignTo(String assignTo) {
		this.assignTo = assignTo;
	}

	public String getAssignBy() {
		return assignBy;
	}

	public void setAssignBy(String assignBy) {
		this.assignBy = assignBy;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpBadgeNo() {
		return empBadgeNo;
	}

	public void setEmpBadgeNo(String empBadgeNo) {
		this.empBadgeNo = empBadgeNo;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getInTime() {
		return inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public String getOutTime() {
		return outTime;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	public String getTotalInOut() {
		return totalInOut;
	}

	public void setTotalInOut(String totalInOut) {
		this.totalInOut = totalInOut;
	}

	public String getAllDayHrs() {
		return allDayHrs;
	}

	public void setAllDayHrs(String allDayHrs) {
		this.allDayHrs = allDayHrs;
	}

	public String getTotalHrs() {
		return totalHrs;
	}

	public void setTotalHrs(String totalHrs) {
		this.totalHrs = totalHrs;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getOtTime() {
		return otTime;
	}

	public void setOtTime(String otTime) {
		this.otTime = otTime;
	}

	public String getNetMins() {
		return netMins;
	}

	public void setNetMins(String netMins) {
		this.netMins = netMins;
	}

	public String getActualWorkHrs() {
		return actualWorkHrs;
	}

	public void setActualWorkHrs(String actualWorkHrs) {
		this.actualWorkHrs = actualWorkHrs;
	}

	public String getNormalWorkHrs() {
		return normalWorkHrs;
	}

	public void setNormalWorkHrs(String normalWorkHrs) {
		this.normalWorkHrs = normalWorkHrs;
	}

	public String getFidNo() {
		return fidNo;
	}

	public void setFidNo(String fidNo) {
		this.fidNo = fidNo;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTrade() {
		return trade;
	}

	public void setTrade(String trade) {
		this.trade = trade;
	}

	public String getTradeCode() {
		return tradeCode;
	}

	public void setTradeCode(String tradeCode) {
		this.tradeCode = tradeCode;
	}

	public String getOnAM() {
		return onAM;
	}

	public void setOnAM(String onAM) {
		this.onAM = onAM;
	}

	public String getOffAM() {
		return offAM;
	}

	public void setOffAM(String offAM) {
		this.offAM = offAM;
	}

	public String getOnPM() {
		return onPM;
	}

	public void setOnPM(String onPM) {
		this.onPM = onPM;
	}

	public String getOffPM() {
		return offPM;
	}

	public void setOffPM(String offPM) {
		this.offPM = offPM;
	}

	public String getCtr() {
		return ctr;
	}

	public void setCtr(String ctr) {
		this.ctr = ctr;
	}

	public String getRec() {
		return rec;
	}

	public void setRec(String rec) {
		this.rec = rec;
	}

	public String getAvgDailyTD() {
		return avgDailyTD;
	}

	public void setAvgDailyTD(String avgDailyTD) {
		this.avgDailyTD = avgDailyTD;
	}

	public String getHighlightDayTG() {
		return highlightDayTG;
	}

	public void setHighlightDayTG(String highlightDayTG) {
		this.highlightDayTG = highlightDayTG;
	}

	public String getAweSDN() {
		return aweSDN;
	}

	public void setAweSDN(String aweSDN) {
		this.aweSDN = aweSDN;
	}

	public String getTotalNT() {
		return totalNT;
	}

	public void setTotalNT(String totalNT) {
		this.totalNT = totalNT;
	}

	public String getTotalOT() {
		return totalOT;
	}

	public void setTotalOT(String totalOT) {
		this.totalOT = totalOT;
	}

	public String getTotalNTOT() {
		return totalNTOT;
	}

	public void setTotalNTOT(String totalNTOT) {
		this.totalNTOT = totalNTOT;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getUntilDate() {
		return untilDate;
	}

	public void setUntilDate(String untilDate) {
		this.untilDate = untilDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMealAllow() {
		return mealAllow;
	}

	public void setMealAllow(String mealAllow) {
		this.mealAllow = mealAllow;
	}

	public String getVerify() {
		return verify;
	}

	public void setVerify(String verify) {
		this.verify = verify;
	}

	public String getBpCompany() {
		return bpCompany;
	}

	public void setBpCompany(String bpCompany) {
		this.bpCompany = bpCompany;
	}

	public String getEarliestEntryTime() {
		return earliestEntryTime;
	}

	public void setEarliestEntryTime(String earliestEntryTime) {
		this.earliestEntryTime = earliestEntryTime;
	}

	public String getLatestEntryTime() {
		return latestEntryTime;
	}

	public void setLatestEntryTime(String latestEntryTime) {
		this.latestEntryTime = latestEntryTime;
	}
	
	 public List<TimesheetWorkInfoDTO> getEmpWorkInfo() {
		return empWorkInfo; 
	}
	 
	 public void setEmpWorkInfo(List<TimesheetWorkInfoDTO> empWorkInfo) {
		this.empWorkInfo = empWorkInfo; 
	}
	

	
}