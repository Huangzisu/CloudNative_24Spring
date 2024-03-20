package org.fd.ase.grp15.common.iservice.user.param;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

public class UserRegisterParam {

    @Data
    public static class In{
        @NotBlank(message = "用户名不能为空")
        @Pattern(regexp = "^[a-zA-Z-][a-zA-Z0-9_-]*$", message = "用户名只能包含字母，数字或两种特殊字符(-_)且只能以字母或-开头")
        @Length(min = 5, max = 32, message = "用户名长度必须在5-32之间")
        private String username; // 用户名

        @NotBlank(message = "密码不能为空")
        @Length(min = 6, max = 32, message = "密码长度必须在6-32之间")
        @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*[0-9_-])[a-zA-Z0-9_-]+$", message = "密码中，字母，数字或者特殊字符(-_)至少包含两种")
        private String password; // 密码

        @NotBlank(message = "邮箱不能为空")
        @Email(message = "邮箱格式不正确")
        private String email; // 邮箱

        @NotBlank(message = "机构名不能为空")
        private String institutionName; // 机构名

        @NotBlank(message = "区域不能为空")
        private String area; // 区域

        @NotBlank(message = "真实姓名不能为空")
        private String realName; // 真实姓名
    }
}
