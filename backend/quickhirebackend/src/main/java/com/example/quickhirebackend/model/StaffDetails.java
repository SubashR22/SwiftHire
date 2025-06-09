package com.example.quickhirebackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "staffdetails")
public class StaffDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int staffid; 
    private Integer staff_userprofileid; 

  

    public StaffDetails() {
       
    }

    public int getStaffId() {
        return staffid;
    }

    // No setter for auto-incremented primary key
    // public void setStaffId(int staffId) {
    //     this.staffId = staffId;
    // }

    public Integer getStaffUserProfileId() {
        return staff_userprofileid;
    }

    public void setStaffUserProfileId(Integer staffUserProfileId) {
        this.staff_userprofileid = staffUserProfileId;
    }

    @Override
    public String toString() {
        return "StaffDetails{" +
                "staffId=" + staffid +
                ", staffUserProfileId=" + staff_userprofileid +
                '}';
    }
}
