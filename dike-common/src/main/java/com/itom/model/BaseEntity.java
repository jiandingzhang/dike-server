package com.itom.model;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @TableId
    @Schema(description = "主键")
    private Long id ;

    @Schema(description = "编码")
    private String code ;

    @Schema(description = "创建时间")
    private LocalDateTime createTime ;

    @Schema(description = "创建人")
    private Long createBy ;

    @Schema(description = "更新时间")
    private LocalDateTime updateTime ;

    @Schema(description = "更新人")
    private Long updateBy ;

    @Schema(description = "删除标识")
    private Integer deleteStatus ;
}
