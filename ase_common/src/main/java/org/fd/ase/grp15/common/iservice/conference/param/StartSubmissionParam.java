package org.fd.ase.grp15.common.iservice.conference.param;

import jakarta.validation.constraints.*;
import lombok.Data;

public class StartSubmissionParam {

    @Data
    public static class In {

        @NotBlank(message = "会议全称不能为空")
        private String conferenceName; // 会议全称

        @NotBlank(message = "会议投稿截止时间不能为空")
        @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}$", message = "会议投稿截止时间格式非法！应该为\"yyyy-MM-dd'T'HH:mm:ss\"")
        private String submissionDeadline; // 会议投稿截止日

        @NotBlank(message = "会议评审结果发布时间不能为空")
        @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}$", message = "会议评审结果发布时间格式非法！应该为\"yyyy-MM-dd'T'HH:mm:ss\"")
        private String reviewResultAnnounceAt; // 会议评审结果发布日期

    }
}
