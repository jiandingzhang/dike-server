package com.itom.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.itom.model.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serial;

/**
 * <p>
 * 文件表
 * </p>
 *
 * @author squidward
 * @since 2025-06-04
 */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@Schema(description = "文件表")
@TableName("dk_file")
public class DkFile extends BaseEntity {
    @Serial
    private static final long serialVersionUID = 1L;


    @Schema(description = "文件名")
    private String filename;


    @Schema(description = "文件类型（0：图片；1：视频）")
    private Integer type;


    @Schema(description = "桶")
    private String bucket;


    @Schema(description = "存储路径")
    private String filePath;


    @Schema(description = "访问地址")
    private String url;


    @Schema(description = "文件大小")
    private String size;
}
