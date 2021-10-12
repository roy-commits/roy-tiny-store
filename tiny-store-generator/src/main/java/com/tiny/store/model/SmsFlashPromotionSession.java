package com.tiny.store.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class SmsFlashPromotionSession implements Serializable {
    @ApiModelProperty(value = "编号")
    private Long id;

    @ApiModelProperty(value = "场次名称")
    private String name;

    @ApiModelProperty(value = "每日开始时间")
    private Date startTime;

    @ApiModelProperty(value = "每日结束时间")
    private Date endTime;

    @ApiModelProperty(value = "启用状态：0->不启用；1->启用")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;
}