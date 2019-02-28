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
    public ResultVo test(@RequestBody String body) {
        System.out.println("========hello Spring===========");

        return new ResultVo(ErrNoEnum.SUCCESS, new TestResult("zhangsan"));
    }
}
