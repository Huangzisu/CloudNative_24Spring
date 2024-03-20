package org.fd.ase.grp15.common.iservice;

import jakarta.validation.Valid;
import org.fd.ase.grp15.common.iservice.conference.param.ApplyConferenceParam;
import org.fd.ase.grp15.common.iservice.conference.param.AuditConferenceParam;
import org.fd.ase.grp15.common.iservice.conference.param.StartSubmissionParam;
import org.fd.ase.grp15.common.iservice.conference.dto.ConferenceApplicationDTO;
import org.fd.ase.grp15.common.iservice.conference.dto.ConferenceDTO;

import java.util.List;

public interface IConferenceService {

    /**
     * 用户注册
     *
     * @param in 注册参数
     * @return 注册结果
     */
    public String apply(@Valid ApplyConferenceParam.In in);

    /**
     * 获取所有会议信息
     *
     * @return 包含所有会议的列表
     */
    public List<ConferenceDTO> getAllConferences();

    /**
     * 查看我申请的所有会议
     *
     * @return 包含我的所有申请的会议的列表
     */
    public List<ConferenceApplicationDTO> getAllMyAppliedConference();

    /**
     * 查看我参与的所有会议
     *
     * @return 包含我的所有参加的会议的列表
     */
    public List<ConferenceDTO> getAllMyJoinedConference();

    /**
     * 查看我在某个会议中的角色
     *
     * @param conferenceName 会议全称
     * @return 我在该会议中的角色的列表，如["AUTHOR", "PC_MEMBER"]
     */
    public List<String> getMyRoleInConference(@Valid String conferenceName);

    /**
     * 查看某个会议中的详细信息
     *
     * @param conferenceName 会议全称
     * @return 会议详细信息
     */
    public ConferenceDTO getConferenceInfoByName(@Valid String conferenceName);

    /**
     * 更改会议状态信息
     *
     * @param conferenceName 会议全称,
     * @param status 会议状态，只能是[准备中、投稿中、审稿中、终评中、审稿结束]中的一个
     * @return 更改结果
     */
    public String changeConferenceStatus(@Valid String conferenceName, @Valid String status);

    /**
     * 开启投稿
     *
     * @param in 开启投稿参数
     * @return 开启结果
     */
    public String startSubmission(@Valid StartSubmissionParam.In in);

    /**
     * 管理员查看所有会议申请
     *
     * @return 包含所有会议申请的列表
     */
    public List<ConferenceApplicationDTO> getAllConferenceApplications();

    /**
     * 管理员审核会议
     *
     * @param in 审核参数
     * @return 审核结果
     */
    public String auditConference(@Valid AuditConferenceParam.In in);


}
