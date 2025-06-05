package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 辅导员：(Instructor)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "Instructor")
public class Instructor implements Serializable {

    // Instructor编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instructor_id")
    private Integer instructor_id;

    // 辅导员工号
    @Basic
    private String trainee_no;
    // 辅导员姓名
    @Basic
    private String name_of_instructor;












    // 用户编号
    @Id
    @Column(name = "user_id")
    private Integer userId;


    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
