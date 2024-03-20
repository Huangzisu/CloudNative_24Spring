package org.fd.ase.grp15.common.iservice.user.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDTO implements Serializable {

    private String username;

    private String realName;

    private String email;

    private String institutionName;

    private String area;
}
