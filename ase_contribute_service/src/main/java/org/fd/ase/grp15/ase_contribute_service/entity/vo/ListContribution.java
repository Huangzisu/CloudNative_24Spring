package org.fd.ase.grp15.ase_contribute_service.entity.vo;

import lombok.Getter;
import lombok.Setter;
import org.fd.ase.grp15.ase_contribute_service.entity.Contribution;


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

    public ListContribution(Contribution contribution) {
        this.id = contribution.getId();
        this.conferenceName = contribution.getConferenceName();
        this.time = contribution.getContributeTime();
        this.title  = contribution.getTitle();
        this.status = contribution.getStatus();
    }
}
