package com.itom.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.itom.model.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serial;

/**
 * <p>
 * 留言表
 * </p>
 *
 * @author squidward
 * @since 2025-06-04
 */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@Schema(description = "留言表")
@TableName("dk_message")
public class DkMessage extends BaseEntity {
    @Serial
    private static final long serialVersionUID = 1L;


    @Schema(description = "内容")
    private String content;


    @Schema(description = "审核状态")
    private Integer status;
}
