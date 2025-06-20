package com.example.quickhirebackend.model;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "professionaldetails")
public class ProfessionalDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer professionalid;
    private Integer profid; 
    private String major;
    private String schoolname;
    private Date completiontime; 

   

    public ProfessionalDetails() {
        
    }

    public int getProfessionalId() {
        return professionalid;
    }

    // No setter for auto-incremented primary key
     public void setProfessionalId(int professionalId) {
         this.professionalid = professionalId;
     }


    public Integer getProfId() {
        return profid;
    }

    public void setProfId(Integer profId) {
        this.profid = profId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchoolName() {
        return schoolname;
    }

    public void setSchoolName(String schoolName) {
        this.schoolname = schoolName;
    }

    public Date getCompletionTime() {
        return completiontime;
    }

    public void setCompletionTime(Date completionTime) {
        this.completiontime = completionTime;
    }

    
    @Override
    public String toString() {
        return "ProfessionalDetails{" +
                "professionalId=" + professionalid+
                ", profId=" + profid +
                ", major='" + major + '\'' +
                ", schoolName='" + schoolname + '\'' +
                ", completionTime=" + completiontime +
                '}';
    }
}
