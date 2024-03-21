package org.fd.ase.grp15.ase_contribute_service.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseWithData<T>{

    private T data;

    private Long timestamp;

    private Boolean success;

    private String message;

    public ResponseWithData(String message){
        this.timestamp = 0L;
        this.success = true;
        this.message = message;
        this.data = null;
    }

    public ResponseWithData(T data,  String message){
        this.timestamp = 0L;
        this.success = true;
        this.data = data;
        this.message = message;
    }

}