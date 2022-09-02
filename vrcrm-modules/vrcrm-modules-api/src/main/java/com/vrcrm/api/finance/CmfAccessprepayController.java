package com.vrcrm.api.finance;

import com.vrcrm.finance.service.ICmfAccessprepaysService;
import com.vrcrm.finance.domain.CmfAccessprepays;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 预付款记录接口
 */

@Api(value = "预付款记录接口")
@RestController
@RequestMapping("/api")
public class CmfAccessprepayController {

    @Autowired
    private ICmfAccessprepaysService cmfAccessprepaysService;

    /**
     * 获取预付款记录情详
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取预付款记录详情失败")
    @ApiOperation(value = "预付款记录详情", notes = "按ID获取预付款记录详情")
    @GetMapping(value = "/finance/accessprepay/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfAccessprepaysService.selectCmfAccessprepaysById(id), HttpStatus.OK);
    }

    /**
     * 获取预付款记录列表
     * uniapp端调用
     *
     * @param cmfAccessprepay
     * @return
     */
    @ApiResponse(code = 400, message = "获取预付款记录列表失败")
    @ApiOperation(value = "预付款记录列表", notes = "获取预付款记录列表")
    @GetMapping(value = "/finance/accessprepay/info/")
    public ResponseEntity<Object> info(CmfAccessprepays cmfAccessprepay) throws IOException{
        return new ResponseEntity<>(cmfAccessprepaysService.selectCmfAccessprepaysList(cmfAccessprepay), HttpStatus.OK);
    }
}