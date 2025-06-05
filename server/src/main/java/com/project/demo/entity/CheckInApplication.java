package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 入住申请：(CheckInApplication)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "CheckInApplication")
public class CheckInApplication implements Serializable {

    // CheckInApplication编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "check_in_application_id")
    private Integer check_in_application_id;

    // 学生学号
    @Basic
    private Integer student_no;
    // 学生姓名
    @Basic
    private String student_name;
    // 辅导员
    @Basic
    private Integer instructor;
    // 楼栋名称
    @Basic
    private String building_name;
    // 宿舍房号
    @Basic
    private String dormitory_room_number;
    // 入住日期
    @Basic
    private Timestamp date_of_check_in;
    // 入住说明
    @Basic
    private String check_in_instructions;



    // 审核状态
    @Basic
    private String examine_state;








    // 审核回复
    @Basic
    private String examine_reply;



    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
