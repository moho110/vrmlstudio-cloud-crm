package com.vrcrm.api.customer;

import com.vrcrm.customer.service.ICmfCustomerFanganService;
import com.vrcrm.customer.domain.CmfCustomerFangan;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 客户方案接口
 */

@Api(value = "客户方案接口")
@RestController
@RequestMapping("/api")
public class CmfCustomerFanganController {

    @Autowired
    private ICmfCustomerFanganService cmfCustomerFanganService;

    /**
     * 获取客户方案详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取客户方案详情失败")
    @ApiOperation(value = "客户方案详情", notes = "按ID获取客户方案详情")
    @GetMapping(value = "/customer/customerfangan/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCustomerFanganService.selectCmfCustomerFanganById(id), HttpStatus.OK);
    }

    /**
     * 获取客户方案列表
     * uniapp端调用
     *
     * @param cmfCustomerFangan
     * @return
     */
    @ApiResponse(code = 400, message = "获取客户方案列表失败")
    @ApiOperation(value = "客户方案列表", notes = "获取客户方案列表")
    @GetMapping(value = "/customer/customerfangan/info/")
    public ResponseEntity<Object> info(CmfCustomerFangan cmfCustomerFangan) throws IOException{
        return new ResponseEntity<>(cmfCustomerFanganService.selectCmfCustomerFanganList(cmfCustomerFangan), HttpStatus.OK);
    }
}