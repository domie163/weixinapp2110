package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 留言反馈：(MessageFeedback)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "MessageFeedback")
public class MessageFeedback implements Serializable {

    // MessageFeedback编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_feedback_id")
    private Integer message_feedback_id;

    // 学生学号
    @Basic
    private Integer student_no;
    // 学生姓名
    @Basic
    private String student_name;
    // 学生电话
    @Basic
    private String student_phone;
    // 标题
    @Basic
    private String title;
    // 留言内容
    @Basic
    private String message_content;
    // 反馈意见
    @Basic
    private String feedback;
    // 留言回复
    @Basic
    private String message_reply;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
