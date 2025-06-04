package com.itom.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.itom.model.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serial;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author squidward
 * @since 2025-06-04
 */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@Schema(description = "用户表")
@TableName("dk_user")
public class DkUser extends BaseEntity {
    @Serial
    private static final long serialVersionUID = 1L;


    @Schema(description = "用户名")
    private String username;


    @Schema(description = "密码")
    private String password;


    @Schema(description = "账号状态")
    private Integer status;


    @Schema(description = "邮箱")
    private String email;


    @Schema(description = "个性签名")
    private String signature;


    @Schema(description = "昵称")
    private String nickname;


    @Schema(description = "头像")
    private String avatar;


    @Schema(description = "电话号码")
    private String phone;
}
