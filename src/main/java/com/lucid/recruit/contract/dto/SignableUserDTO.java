package com.lucid.recruit.contract.dto;

import com.lucid.core.vo.BaseVO;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class SignableUserDTO {

    @NotBlank
    private String firstName;

    private String lastName;

    @NotBlank
    private String initials;

    @NotBlank
    @Email
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
