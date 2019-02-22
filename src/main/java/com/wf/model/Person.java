package com.wf.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Mr_WF on 2018/4/21.
 */
@Entity
@Setter
@Getter
@ApiModel(value="person对象",description="用户对象person")
public class Person {
    @Id
    @GeneratedValue
    @ApiModelProperty(value="用户id",name="id")
    private Long id;
    @ApiModelProperty(value="用户名",name="name",required=true)
    private String name;
    @ApiModelProperty(value="用户年龄",name="age")
    private Integer age;
    private String address;
}
