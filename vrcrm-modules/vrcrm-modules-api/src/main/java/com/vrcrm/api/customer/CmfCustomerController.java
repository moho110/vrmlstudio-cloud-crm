package com.vrcrm.api.customer;

import com.vrcrm.customer.service.ICmfCustomerService;
import com.vrcrm.customer.domain.CmfCustomer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 客户接口
 */

@Api(value = "客户接口")
@RestController
@RequestMapping("/api")
public class CmfCustomerController {

    @Autowired
    private ICmfCustomerService cmfCustomerService;

    /**
     * 获取客户详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取客户详情失败")
    @ApiOperation(value = "客户详情", notes = "按ID获取客户详情")
    @GetMapping(value = "/customer/cmfcustomer/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCustomerService.selectCmfCustomerById(id), HttpStatus.OK);
    }

    /**
     * 获取客户列表
     * uniapp端调用
     *
     * @param cmfCustomer
     * @return
     */
    @ApiResponse(code = 400, message = "获取客户列表失败")
    @ApiOperation(value = "客户列表", notes = "获取客户列表")
    @GetMapping(value = "/customer/cmfcustomer/info/")
    public ResponseEntity<Object> info(CmfCustomer cmfCustomer) throws IOException{
        return new ResponseEntity<>(cmfCustomerService.selectCmfCustomerList(cmfCustomer), HttpStatus.OK);
    }
}