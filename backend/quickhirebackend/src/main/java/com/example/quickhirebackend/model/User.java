package com.example.quickhirebackend.model;
import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "user")
public class User implements UserDetails {


    private Integer profid; 
    private String password; 
    @Id
    @Column(name = "username", length = 30)
    private String username; 
    @Enumerated(EnumType.STRING)
    private AllTypesEnums.UserType usertype; 
    @Enumerated(EnumType.STRING)
    private AllTypesEnums.UserStatus status; 

    private  String ispasswordchanged;

   

    public User() {
        
    }

    public int getProfId() {
        return profid;
    }

    public void setProfId(int profId) {
        this.profid = profId;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(usertype.name()));
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public  AllTypesEnums.UserType getUserType() {
        return usertype;
    }

    public void setUserType(AllTypesEnums.UserType userType) {
        this.usertype = userType;
    }

    public AllTypesEnums.UserStatus getStatus() {
        return status;
    }

    public void setStatus(AllTypesEnums.UserStatus status) {
        this.status = status;
    }

    public  void  setIsPasswordChanged(String isPasswordChanged){this.ispasswordchanged=isPasswordChanged;}

    public  String getIsPasswordChanged(){return  ispasswordchanged;}


    
    @Override
    public String toString() {
        return "User{" +
                "profId=" + profid +
                ", username='" + username + '\'' +
                ", userType='" + usertype + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
