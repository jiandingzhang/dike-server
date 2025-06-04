package com.itom.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.itom.model.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serial;

/**
 * <p>
 * 字典表
 * </p>
 *
 * @author squidward
 * @since 2025-06-04
 */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@Schema(description = "字典表")
@TableName("dk_dictionary")
public class DkDictionary extends BaseEntity {
    @Serial
    private static final long serialVersionUID = 1L;


    @Schema(description = "名称")
    private String name;
}
