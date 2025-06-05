package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 健康上报：(HealthReporting)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "HealthReporting")
public class HealthReporting implements Serializable {

    // HealthReporting编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "health_reporting_id")
    private Integer health_reporting_id;

    // 学生学号
    @Basic
    private Integer student_no;
    // 学生姓名
    @Basic
    private String student_name;
    // 辅导员
    @Basic
    private Integer instructor;
    // 上报日期
    @Basic
    private Timestamp reporting_date;
    // 今日体温
    @Basic
    private String temperature_today;
    // 健康码
    @Basic
    private String health_code;
    // 是否不适
    @Basic
    private String is_it_uncomfortable;
    // 不适症状
    @Basic
    private String unwell_symptoms;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
