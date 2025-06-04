package com.itom.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.itom.model.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serial;

/**
 * <p>
 * 文章标签表
 * </p>
 *
 * @author squidward
 * @since 2025-06-04
 */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@Schema(description = "文章标签表")
@TableName("dk_note_tag")
public class DkNoteTag extends BaseEntity {
    @Serial
    private static final long serialVersionUID = 1L;


    @Schema(description = "标签名")
    private String name;


    @Schema(description = "排序")
    private Integer sort;
}
