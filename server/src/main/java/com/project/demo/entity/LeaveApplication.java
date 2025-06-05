package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 请假申请：(LeaveApplication)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "LeaveApplication")
public class LeaveApplication implements Serializable {

    // LeaveApplication编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "leave_application_id")
    private Integer leave_application_id;

    // 学生学号
    @Basic
    private Integer student_no;
    // 学生姓名
    @Basic
    private String student_name;
    // 辅导员
    @Basic
    private Integer instructor;
    // 请假类型
    @Basic
    private String leave_type;
    // 开始时间
    @Basic
    private Timestamp start_time;
    // 请假天数
    @Basic
    private String leave_days;
    // 结束时间
    @Basic
    private Timestamp end_time;
    // 请假原因
    @Basic
    private String reason_for_taking_leave;



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
