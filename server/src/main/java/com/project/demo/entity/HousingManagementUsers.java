package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 宿管用户：(HousingManagementUsers)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "HousingManagementUsers")
public class HousingManagementUsers implements Serializable {

    // HousingManagementUsers编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "housing_management_users_id")
    private Integer housing_management_users_id;

    // 宿管工号
    @Basic
    private String hanguan_job_number;
    // 宿管姓名
    @Basic
    private String name_of_the_housekeeper;












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
