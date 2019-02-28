package com.cnm.platforlearn.pojo;

import com.cnm.platforlearn.constant.ErrNoEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVo {
    private String errno;

    private String msg;

    private BaseResult data;


    public ResultVo(ErrNoEnum e, BaseResult data) {
        this.errno = e.getError();
        this.msg = e.getMsg();
        this.data = data;
    }
}
