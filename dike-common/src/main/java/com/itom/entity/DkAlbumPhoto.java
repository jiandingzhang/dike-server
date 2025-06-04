package com.itom.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.itom.model.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serial;

/**
 * <p>
 * 相册照片
 * </p>
 *
 * @author squidward
 * @since 2025-06-04
 */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@Schema(description = "相册照片")
@TableName("dk_album_photo")
public class DkAlbumPhoto extends BaseEntity {
    @Serial
    private static final long serialVersionUID = 1L;


    @Schema(description = "文件id")
    private Long fileId;


    @Schema(description = "相册id")
    private Long albumId;


    @Schema(description = "图片地址")
    private String url;


    @Schema(description = "图片描述")
    private String description;


    @Schema(description = "排序")
    private Integer sort;
}
