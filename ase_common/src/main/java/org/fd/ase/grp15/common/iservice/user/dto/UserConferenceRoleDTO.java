package org.fd.ase.grp15.common.iservice.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.fd.ase.grp15.common.enums.ConferenceRole;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserConferenceRoleDTO implements Serializable {
    private String username;

    private String conferenceName;

    private ConferenceRole role;
}
