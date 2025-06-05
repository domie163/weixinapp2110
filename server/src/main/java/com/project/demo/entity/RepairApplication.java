package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 报修申请：(RepairApplication)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "RepairApplication")
public class RepairApplication implements Serializable {

    // RepairApplication编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "repair_application_id")
    private Integer repair_application_id;

    // 学生学号
    @Basic
    private Integer student_no;
    // 学生姓名
    @Basic
    private String student_name;
    // 宿管
    @Basic
    private Integer housemaster;
    // 楼栋名称
    @Basic
    private String building_name;
    // 宿舍房号
    @Basic
    private String dormitory_room_number;
    // 报修物品
    @Basic
    private String items_for_repair;
    // 报修原因
    @Basic
    private String repair_reason;



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
