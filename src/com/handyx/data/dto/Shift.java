package com.handyx.data.dto;

public class Shift {

    private long id;
    private long employeeId;
    private long assignedById;
    private ShiftType shiftType;
    private long date;
    private long createdAt;

    public enum ShiftType {
        MORNING,    // 6 AM - 2 PM
        AFTERNOON,  // 2 PM - 10 PM
        NIGHT       // 10 PM - 6 AM
    }

    public Shift() {
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public long getEmployeeId() { return employeeId; }
    public void setEmployeeId(long employeeId) { this.employeeId = employeeId; }

    public long getAssignedById() { return assignedById; }
    public void setAssignedById(long assignedById) { this.assignedById = assignedById; }

    public ShiftType getShiftType() { return shiftType; }
    public void setShiftType(ShiftType shiftType) { this.shiftType = shiftType; }

    public long getDate() { return date; }
    public void setDate(long date) { this.date = date; }

    public long getCreatedAt() { return createdAt; }
    public void setCreatedAt(long createdAt) { this.createdAt = createdAt; }
}
