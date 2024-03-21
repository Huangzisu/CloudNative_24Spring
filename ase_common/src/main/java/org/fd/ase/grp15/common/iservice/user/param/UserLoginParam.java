package org.fd.ase.grp15.common.iservice.user.param;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

public class UserLoginParam {

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
    }
}
