package org.fd.ase.grp15.ase_contribute_service.entity;

public enum ContributeStatus {
    /*
    审核中
     */
    CHECKING(0),
    /*
    录用
     */
    ACCEPTED(1),
    /*
    未录用
     */
    DECLINED(2);

    private int code;

    ContributeStatus(int code) {
        this.code = code;
    }

    public int getCode(){return code;}

    public ContributeStatus getStatus(int code){
        switch (code){
            case 0: return CHECKING;
            case 1: return ACCEPTED;
            case 2: return DECLINED;
            default: return null;
        }
    }


}
