package org.fd.ase.grp15.common.iservice.conference.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ConferenceApplicationDTO {

    private Integer applicationID;     // 申请ID，主键

    private String conferenceName; // 会议全称

    private String conferenceAbbr; // 会议简称

    private LocalDateTime conferenceStartAt;    // 会议举办时间-左端点

    private LocalDateTime conferenceEndAt;      // 会议举办时间-右端点

    private String venue;          // 会议举办地点

    private String applicationStatus;          // 申请状态（审核中，已通过，未通过）

    private String applicantUsername;          // 申请人用户名
}
