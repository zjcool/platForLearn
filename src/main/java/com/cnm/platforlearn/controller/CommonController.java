package com.cnm.platforlearn.controller;

import com.cnm.platforlearn.constant.ErrNoEnum;
import com.cnm.platforlearn.pojo.ResultVo;
import com.cnm.platforlearn.pojo.TestResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @RequestMapping("/**")
    public ResultVo test(@RequestBody String body){
        ResultVo resultVo = new ResultVo(ErrNoEnum.SUCCESS.getError(),new TestResult("zhangsan"));
        System.out.println("========hello Spring===========");
        return  resultVo;
    }
}
