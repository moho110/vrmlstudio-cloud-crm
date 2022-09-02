package com.vrcrm.api.finance;

import com.vrcrm.finance.service.ICmfPaystateService;
import com.vrcrm.finance.domain.CmfPaystate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 支付状态接口
 */

@Api(value = "支付状态接口")
@RestController
@RequestMapping("/api")
public class CmfPaystateController {

    @Autowired
    private ICmfPaystateService cmfPaystateService;

    /**
     * 获取支付状态情详
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取支付状态详情失败")
    @ApiOperation(value = "支付状态详情", notes = "按ID获取支付状态详情")
    @GetMapping(value = "/finance/paystate/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfPaystateService.selectCmfPaystateById(id), HttpStatus.OK);
    }

    /**
     * 获取支付状态列表
     * uniapp端调用
     *
     * @param cmfPaystate
     * @return
     */
    @ApiResponse(code = 400, message = "获取支付状态列表失败")
    @ApiOperation(value = "支付状态列表", notes = "获取支付状态列表")
    @GetMapping(value = "/finance/paystate/info/")
    public ResponseEntity<Object> info(CmfPaystate cmfPaystate) throws IOException{
        return new ResponseEntity<>(cmfPaystateService.selectCmfPaystateList(cmfPaystate), HttpStatus.OK);
    }
}

