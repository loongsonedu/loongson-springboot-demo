package com.css.pojo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class User {
    @Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", photo=" + photo + "]";
	}

	private Integer id;

    @NotEmpty(message="name不能为空")
    private String name;

    @Min(value=10)
    @Max(value=100)
    private Integer age;

    private String photo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }
    
    
}