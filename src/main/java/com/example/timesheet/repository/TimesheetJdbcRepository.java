package com.example.timesheet.repository;

import com.example.timesheet.dto.TimesheetDTO;
import com.example.timesheet.dto.TimesheetWorkInfoDTO;
import com.example.timesheet.util.TimesheetUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Repository
public class TimesheetJdbcRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Row Mapper
    private TimesheetDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        TimesheetDTO dto = new TimesheetDTO();
        dto.setId(rs.getString("id"));
        dto.setFidNo(rs.getString("fidNo"));
        dto.setDate(rs.getString("date"));
        dto.setEmpName(rs.getString("empName"));
        dto.setFileName(rs.getString("fileName"));
        dto.setFileType(rs.getString("fileType"));
        dto.setTotalNT(rs.getString("totalNT"));
        dto.setTotalOT(rs.getString("totalOT"));
        dto.setTotalNTOT(rs.getString("totalNTOT"));
        dto.setLocation(rs.getString("location"));
        dto.setStatus(rs.getString("status"));
        dto.setRemarks(rs.getString("remarks"));
        return dto;
    }

    // CREATE - Insert multiple records
    public int save(List<TimesheetDTO> timesheets) {
        String insertTimesheetSql = "INSERT INTO timesheet (id, fidNo, date, empName, fileName, fileType, totalNT, totalOT, totalNTOT, location, status, remarks) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//        String insertWorkInfoSql = "INSERT INTO timesheetWorkInfo (id, timesheetId, jobCode, location, workingHrs, overtime) VALUES (?, ?, ?, ?, ?, ?)";

        int totalRows = 0;

        for (TimesheetDTO ts : timesheets) {
            // Generate random ID for timesheet
            String timesheetId = TimesheetUtil.generateId(15);
            ts.setId(timesheetId);

            jdbcTemplate.update(insertTimesheetSql,
                timesheetId,
                ts.getFidNo(),
                ts.getDate(),
                ts.getEmpName(),
                ts.getFileName(),
                ts.getFileType(),
                ts.getTotalNT(),
                ts.getTotalOT(),
                ts.getTotalNTOT(),
                ts.getLocation(),
                ts.getStatus(),
                ts.getRemarks()
            );
            totalRows++;

            // Insert children with their own random IDs
//            if (ts.getEmpWorkInfo() != null) {
//                for (TimesheetWorkInfoDTO wi : ts.getEmpWorkInfo()) {
//                    String workInfoId = TimesheetUtil.generateId(15);
//                    jdbcTemplate.update(insertWorkInfoSql,
//                        workInfoId,
//                        timesheetId,
//                        wi.getJobCode(),
//                        wi.getLocation(),
//                        wi.getWorkingHrs(),
//                        wi.getOvertime()
//                    );
//                    totalRows++;
//                }
//            }
        }
        return totalRows;
    }


//    Update
    public int update(List<TimesheetDTO> timesheets) {
    	 String updateTimesheetSql = "UPDATE timesheet SET status = ?, remarks = ? WHERE id = ?";
    	 String insertWorkInfoSql = "INSERT INTO timesheetWorkInfo (id, timesheetId, jobCode, location, workingHrs, overtime) VALUES (?, ?, ?, ?, ?, ?)";
   

        int totalRows = 0;

        for (TimesheetDTO ts : timesheets) {
            // Generate random ID for timesheet
            
            String timesheetId = ts.getId();
            jdbcTemplate.update(updateTimesheetSql,
                ts.getStatus(),
                ts.getRemarks(),
                ts.getId()
            );
            totalRows++;

            // Insert children with their own random IDs
            if (ts.getEmpWorkInfo() != null) {
                for (TimesheetWorkInfoDTO wi : ts.getEmpWorkInfo()) {
                    String workInfoId = TimesheetUtil.generateId(15);
                    jdbcTemplate.update(insertWorkInfoSql,
                        workInfoId,
                        timesheetId,
                        wi.getJobCode(),
                        wi.getLocation(),
                        wi.getWorkingHrs(),
                        wi.getOvertime()
                    );
                    totalRows++;
                }
            }
        }
        return totalRows;
    }
    
    
    public List<Map<String, Object>> getPaginatedTimesheets(int page, int pageSize) {
        int offset = (page - 1) * pageSize;
        String sql = "SELECT m.id, m.fidNo, m.date, m.empName, m.fileName, m.fileType, " +
                     "m.totalNT, m.totalOT, m.totalNTOT, m.status, m.remarks, " +
                     "d.id AS empWorkInfoId, d.jobCode, d.location, d.workingHrs, d.overtime " +
                     "FROM timesheet m " +
                     "LEFT JOIN timesheetWorkInfo d ON m.id = d.timesheetId " +
                     "ORDER BY m.id DESC " +
                     "LIMIT ? OFFSET ?";
        return jdbcTemplate.queryForList(sql, pageSize, offset);
    }
    // UPDATE - Update multiple records
//    public int update(List<TimesheetDTO> timesheets) {
//        String sql = "UPDATE timesheet SET status = ?, remarks = ? WHERE id = ?";
//        int rowsAffected = 0;
//
//        for (TimesheetDTO ts : timesheets) {
//            rowsAffected += jdbcTemplate.update(sql,
//                ts.getStatus(),
//                ts.getRemarks(),
//                ts.getId()
//            );
//        }
//        return rowsAffected;
//    }

    public List<TimesheetDTO> findAll() {
        String sql = "SELECT id, fidNo, date, empName, fileName, fileType, totalNT, totalOT, totalNTOT, location, status, remarks FROM timesheet ORDER BY id DESC";
        return jdbcTemplate.query(sql, this::mapRow);
    }

    public TimesheetDTO findById(Long id) {
        String sql = "SELECT id, fidNo, date, empName, fileName, fileType, totalNT, totalOT, totalNTOT, location, status, remarks FROM timesheet WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, this::mapRow, id);
    }

    public int delete(Long id) {
        String sql = "DELETE FROM timesheet WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }
}
