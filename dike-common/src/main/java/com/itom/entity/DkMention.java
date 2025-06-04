package com.itom.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.itom.model.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serial;

/**
 * <p>
 * 说说动态表
 * </p>
 *
 * @author squidward
 * @since 2025-06-04
 */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@Schema(description = "说说动态表")
@TableName("dk_mention")
public class DkMention extends BaseEntity {
    @Serial
    private static final long serialVersionUID = 1L;


    @Schema(description = "内容")
    private String content;


    @Schema(description = "附件")
    private String attachment;


    @Schema(description = "附件地址")
    private String attachmentUrl;


    @Schema(description = "附件类型")
    private Integer attachmentType;
}
