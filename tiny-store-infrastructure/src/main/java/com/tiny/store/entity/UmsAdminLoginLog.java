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
 * 后台用户登录日志表
 * </p>
 *
 * @author roy
 * @since 2021-10-24
 */
@Getter
@Setter
@TableName("ums_admin_login_log")
@ApiModel(value = "UmsAdminLoginLog对象", description = "后台用户登录日志表")
public class UmsAdminLoginLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("admin_id")
    private Long adminId;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("ip")
    private String ip;

    @TableField("address")
    private String address;

    @ApiModelProperty("浏览器登录类型")
    @TableField("user_agent")
    private String userAgent;


}