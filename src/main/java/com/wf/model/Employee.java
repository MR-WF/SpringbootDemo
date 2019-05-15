package com.wf.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;


/**
 * @description:
 * @author: it.wf
 * @create: 2019-05-15 10:30
 **/
@Entity
@Setter
@Getter
@ApiModel(value="雇员对象",description="雇员对象Employee")
public class Employee {
    @Id
    //@GeneratedValue
    @ApiModelProperty(value="雇员标识",name="id")
    private Integer employeeId;
    @ApiModelProperty(value="'雇员名称'",name="name")
    private String name;
    @ApiModelProperty(value="'email地址'",name="email")
    private String email;
    @ApiModelProperty(value="'创建时间'",name="createDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    /**使用sql.Date时 数据接收装换时会丢掉时分秒的数据 ，使用util.Date正常*/
    private Date createDate;
    @ApiModelProperty(value="'区域标识'",name="areaId")
    private Integer areaId;
}
