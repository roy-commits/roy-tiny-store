package com.tiny.store.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 专题评论表
 * </p>
 *
 * @author roy
 * @since 2021-10-24
 */
@Getter
@Setter
@TableName("cms_topic_comment")
@ApiModel(value = "CmsTopicComment对象", description = "专题评论表")
public class CmsTopicComment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("member_nick_name")
    private String memberNickName;

    @TableField("topic_id")
    private Long topicId;

    @TableField("member_icon")
    private String memberIcon;

    @TableField("content")
    private String content;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("show_status")
    private Integer showStatus;


}