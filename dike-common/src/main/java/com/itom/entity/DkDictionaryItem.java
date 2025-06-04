package com.itom.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.itom.model.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serial;

/**
 * <p>
 * 字典项表
 * </p>
 *
 * @author squidward
 * @since 2025-06-04
 */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@Schema(description = "字典项表")
@TableName("dk_dictionary_item")
public class DkDictionaryItem extends BaseEntity {
    @Serial
    private static final long serialVersionUID = 1L;


    @Schema(description = "字典类型id")
    private Long dictionaryId;


    @Schema(description = "字典项名")
    private String name;


    @Schema(description = "排序")
    private Integer sort;
}
