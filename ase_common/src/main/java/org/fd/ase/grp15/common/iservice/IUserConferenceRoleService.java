package org.fd.ase.grp15.common.iservice;

import org.fd.ase.grp15.common.enums.ConferenceRole;
import org.fd.ase.grp15.common.iservice.user.dto.UserConferenceRoleDTO;

import java.util.List;

public interface IUserConferenceRoleService {

    /**
     * 加载用户在某个会议中的全部角色（CHAIR，PC_MEMBER，AUTHOR）
     *
     * @param username       用户名
     * @param conferenceName 会议名
     * @return 角色列表
     */
    public List<ConferenceRole> loadUserRolesInConference(String username, String conferenceName);


    /**
     * 加载用户在他所参加的会议中的全部角色（CHAIR，PC_MEMBER，AUTHOR）
     *
     * @param username 用户名
     * @return 角色列表
     */
    public List<UserConferenceRoleDTO> loadUserRolesInConference(String username);

    /**
     * 为用户添加会议角色
     *
     * @param username       用户名
     * @param conferenceName 会议名
     * @param role           角色
     * @return 添加结果
     */
    public String addRoleToUserInConference(String username, String conferenceName, ConferenceRole role);

    /**
     * 为用户移除会议角色
     *
     * @param username       用户名
     * @param conferenceName 会议名
     * @param role           角色
     * @return 移除结果
     */
    public String removeRoleFromUserInConference(String username, String conferenceName, ConferenceRole role);


    /**
     * 检查用户在会议中的角色
     *
     * @param username       用户名
     * @param conferenceName 会议名
     * @param role           角色
     * @return 检查结果
     */
    public Boolean checkRoleOfUserInConference(String username, String conferenceName, ConferenceRole role);
}
