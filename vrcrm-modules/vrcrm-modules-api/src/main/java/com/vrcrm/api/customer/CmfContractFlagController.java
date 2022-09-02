package com.vrcrm.api.customer;

import com.vrcrm.customer.service.ICmfContractFlagService;
import com.vrcrm.customer.domain.CmfContractFlag;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 合同标识接口
 */

@Api(value = "合同标识接口")
@RestController
@RequestMapping("/api")
public class CmfContractFlagController {

    @Autowired
    private ICmfContractFlagService cmfContractFlagService;

    /**
     * 获取合同标识详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取合同标识详情失败")
    @ApiOperation(value = "合同标识详情", notes = "按ID获取合同标识详情")
    @GetMapping(value = "/customer/contractflag/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfContractFlagService.selectCmfContractFlagById(id), HttpStatus.OK);
    }

    /**
     * 获取合同标识列表
     * uniapp端调用
     *
     * @param cmfContractFlag
     * @return
     */
    @ApiResponse(code = 400, message = "获取合同标识列表失败")
    @ApiOperation(value = "合同标识列表", notes = "获取合同标识列表")
    @GetMapping(value = "/customer/contractflag/info/")
    public ResponseEntity<Object> info(CmfContractFlag cmfContractFlag) throws IOException{
        return new ResponseEntity<>(cmfContractFlagService.selectCmfContractFlagList(cmfContractFlag), HttpStatus.OK);
    }
}