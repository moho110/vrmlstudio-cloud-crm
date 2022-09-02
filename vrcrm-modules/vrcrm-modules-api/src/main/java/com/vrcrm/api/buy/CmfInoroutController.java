package com.vrcrm.api.buy;

import com.vrcrm.buy.service.ICmfInoroutService;
import com.vrcrm.buy.domain.CmfInorout;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 输入输出接口
 */

@Api(value = "输入输出接口")
@RestController
@RequestMapping("/api")
public class CmfInoroutController {

    @Autowired
    private ICmfInoroutService cmfInoroutService;

    /**
     * 获取输入输出详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取输入输出详情失败")
    @ApiOperation(value = "输入输出详情", notes = "按ID获取输入输出详情")
    @GetMapping(value = "/buy/cmfinorout/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfInoroutService.selectCmfInoroutById(id), HttpStatus.OK);
    }

    /**
     * 获取输入输出列表
     * uniapp端调用
     *
     * @param cmfInorout
     * @return
     */
    @ApiResponse(code = 400, message = "获取输入输出列表失败")
    @ApiOperation(value = "输入输出列表", notes = "获取输入输出列表")
    @GetMapping(value = "/buy/cmfinorout/info/")
    public ResponseEntity<Object> info(CmfInorout cmfInorout) throws IOException{
        return new ResponseEntity<>(cmfInoroutService.selectCmfInoroutList(cmfInorout), HttpStatus.OK);
    }
}