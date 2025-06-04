package com.itom.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.itom.model.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serial;

/**
 * <p>
 * 系统信息配置表
 * </p>
 *
 * @author squidward
 * @since 2025-06-04
 */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@Schema(description = "系统信息配置表")
@TableName("dk_sys_config")
public class DkSysConfig extends BaseEntity {
    @Serial
    private static final long serialVersionUID = 1L;


    @Schema(description = "网站名")
    private String name;


    @Schema(description = "网站图标")
    private String logo;


    @Schema(description = "介绍")
    private String introduction;


    @Schema(description = "备案号")
    private String recordNum;


    @Schema(description = "作者")
    private String author;


    @Schema(description = "作者信息")
    private String authorInfo;


    @Schema(description = "作者头像")
    private String authorAvatar;


    @Schema(description = "支付宝支付码")
    private String aliPay;


    @Schema(description = "微信支付码")
    private String wxPay;


    @Schema(description = "github地址")
    private String github;


    @Schema(description = "gitee地址")
    private String gitee;


    @Schema(description = "qq号")
    private String qqNum;


    @Schema(description = "qq群")
    private String qqGroup;


    @Schema(description = "邮箱")
    private String email;


    @Schema(description = "微信")
    private String wechat;


    @Schema(description = "公告")
    private String bulletin;
}
