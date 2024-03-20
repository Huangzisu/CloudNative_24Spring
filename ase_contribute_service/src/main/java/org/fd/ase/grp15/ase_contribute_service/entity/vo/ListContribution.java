package org.fd.ase.grp15.ase_contribute_service.entity.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ListContribution implements Serializable {
    private long id;
    private String conferenceName;

    private String time;

    private int status;

    private String title;

    public ListContribution(long id, String conferenceName, String time, String title, int status){
        this.id = id;
        this.conferenceName = conferenceName;
        this.time = time;
        this.title = title;
        this.status = status;
    }

}
