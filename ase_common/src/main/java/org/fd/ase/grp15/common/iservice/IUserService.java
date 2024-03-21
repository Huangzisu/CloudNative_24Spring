package org.fd.ase.grp15.common.iservice;

import jakarta.validation.Valid;
import org.fd.ase.grp15.common.iservice.user.dto.UserDTO;
import org.fd.ase.grp15.common.iservice.user.param.UserLoginParam;
import org.fd.ase.grp15.common.iservice.user.param.UserRegisterParam;

import java.util.List;

public interface IUserService {

    /**
     * 用户注册
     *
     * @param in 注册参数
     * @return 注册结果
     */
    public String register(@Valid UserRegisterParam.In in);

    /**
     * 用户登录
     *
     * @param in 登录参数
     * @return 登录结果
     */
    public String login(@Valid UserLoginParam.In in);

    /**
     * 用户登出
     *
     * @return 登出结果
     */
    public String logout();

    public UserDTO userInfoByUsername(String username);

    public List<UserDTO> userInfoByRealName(String realName);
}
