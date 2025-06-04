package com.itom.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.itom.model.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serial;

/**
 * <p>
 * 博客笔记表
 * </p>
 *
 * @author squidward
 * @since 2025-06-04
 */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@Schema(description = "博客笔记表")
@TableName("dk_note")
public class DkNote extends BaseEntity {
    @Serial
    private static final long serialVersionUID = 1L;


    @Schema(description = "标签id")
    private Long tagId;


    @Schema(description = "标题")
    private String title;


    @Schema(description = "封面图")
    private String cover;


    @Schema(description = "摘要")
    private String summary;


    @Schema(description = "内容")
    private String content;


    @Schema(description = "md格式内容")
    private String contentMd;
}
