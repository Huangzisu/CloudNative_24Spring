package org.fd.ase.grp15.ase_contribute_service.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.web.multipart.MultipartFile;

public class ContributeRequest {

    @Data
    public static class In{
        @NotBlank(message = "会议名称不能为空")
        private String conferenceName;

        @NotBlank(message = "摘要内容不能为空")
        @Length(max = 800, message = "摘要不能超过800个字符")
        private String abstractContent;

        @NotBlank(message = "投稿人不能为空")
        private String username;

        private String realName;

        @NotBlank(message = "论文标题不能为空")
        @Length(max = 50, message = "论文标题不能超过50个字符")
        private String title;

        private String essayId;


    }
}
