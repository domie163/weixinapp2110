package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 晚归申请：(LateReturnApplication)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "LateReturnApplication")
public class LateReturnApplication implements Serializable {

    // LateReturnApplication编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "late_return_application_id")
    private Integer late_return_application_id;

    // 学生学号
    @Basic
    private Integer student_no;
    // 学生姓名
    @Basic
    private String student_name;
    // 宿管
    @Basic
    private Integer housemaster;
    // 宿舍房号
    @Basic
    private String dormitory_room_number;
    // 晚归时间
    @Basic
    private Timestamp late_return_time;
    // 晚归原因
    @Basic
    private String reasons_for_late_return;



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
