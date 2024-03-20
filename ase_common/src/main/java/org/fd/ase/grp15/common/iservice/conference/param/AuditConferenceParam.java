package org.fd.ase.grp15.common.iservice.conference.param;

import jakarta.validation.constraints.*;
import lombok.Data;

public class AuditConferenceParam {

    @Data
    public static class In {

        @NotNull(message = "申请记录id不能为空")
        private Integer applicationId; // 申请记录的id

        @NotNull(message = "审核结果不能为空")
        private Boolean applicationPass;

    }
}
