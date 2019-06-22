package com.akademiakodu.demo.models.Forms;

import org.hibernate.validator.constraints.Range;
import javax.validation.constraints.*;

public class PersonForm {
    @NotEmpty(message = "{NotEmpty.PersonForm.name}")
    @Size(min = 1, max = 10, message = "{Size.PersonForm.name}")
    private String name;
    @NotEmpty(message = "{NotEmpty.PersonForm.lastname}")
    @Size(min = 1, max = 13, message = "{Size.PersonForm.lastname}")
    private String lastname;
    @Range(min = 1, max = 99, message = "{Range.PersonForm.age}")
    private Integer age;
    @NotEmpty(message = "{NotEmpty.PersonForm.phone}")
    @Pattern(regexp = "[0-9]{3}-[0-9]{3}-[0-9]{3}", message = "{Pattern.PersonForm.phone}")
    private String phone;
    @NotEmpty(message = "{NotEmpty.PersonForm.email}")
    @Email(message = "{Email.PersonForm.Email}")
    private String email;

    public PersonForm() {
    }

    private PersonForm(Builder builder) {
        name = builder.name;
        lastname = builder.lastname;
        age = builder.age;
        phone = builder.phone;
        email = builder.email;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Integer getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public static class Builder {

        private String name;
        private String lastname;
        private int age;
        private String phone;
        private String email;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public PersonForm build() {
            return new PersonForm(this);
        }
    }
}
