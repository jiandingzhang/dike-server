package com.itom.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.itom.model.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serial;


/**
 * <p>
 * 相册
 * </p>
 *
 * @author squidward
 * @since 2025-06-04
 */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@Schema(description = "相册")
@TableName("dk_album")
public class DkAlbum extends BaseEntity {
    @Serial
    private static final long serialVersionUID = 1L;


    @Schema(description = "相册名")
    private String name;


    @Schema(description = "描述")
    private String description;


    @Schema(description = "封面照片")
    private String cover;


    @Schema(description = "私密状态")
    private Integer secretStatus;


    @Schema(description = "排序")
    private Integer sort;
}
