package org.fd.ase.grp15.common.iservice.conference.param;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

public class ApplyConferenceParam {

    @Data
    public static class In {

        @NotBlank(message = "会议全称不能为空")
        private String conferenceName; // 会议全称，主键

        @NotBlank(message = "会议简称不能为空")
        private String conferenceAbbr; // 会议简称

        @NotBlank(message = "会议举办开始时间不能为空")
        @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}$", message = "会议开始日期格式非法！应该为\"yyyy-MM-dd'T'HH:mm:ss\"")
        private String conferenceStartAt; // 会议举办时间-左端点

        @NotBlank(message = "会议举办结束时间不能为空")
        @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}$", message = "会议结束日期格式非法！应该为\"yyyy-MM-dd'T'HH:mm:ss\"")
        private String conferenceEndAt; // 会议举办时间-右端点

        @NotBlank(message = "会议举办地点不能为空")
        private String venue; // 会议举办地点
    }
}
