package com.example.quickhirebackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employerdetails")
public class EmployerDetails {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer employerid; 
        private String companyname; 
        private int profid; 

      
        public Integer getEmployerId() {
            return employerid;
        }

        public void setEmployerId(int employerId) {
            this.employerid = employerId;
        }

        public String getCompanyName() {
            return companyname;
        }

        public void setCompanyName(String companyName) {
            this.companyname = companyName;
        }

        public Integer getProfId() {
            return profid;
        }

        public void setProfId(Integer profId) {
            this.profid = profId;
        }

        
        @Override
        public String toString() {
            return "Employment{" +
                    "employerId=" + employerid +
                    ", companyName='" + companyname + '\'' +
                    ", profId=" + profid +
                    '}';
        }
    }
