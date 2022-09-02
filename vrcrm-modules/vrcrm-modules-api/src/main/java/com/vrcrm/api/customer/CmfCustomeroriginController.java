package com.vrcrm.api.customer;

import com.vrcrm.customer.service.ICmfCustomeroriginService;
import com.vrcrm.customer.domain.CmfCustomerorigin;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 客户来源接口
 */

@Api(value = "客户来源接口")
@RestController
@RequestMapping("/api")
public class CmfCustomeroriginController {

    @Autowired
    private ICmfCustomeroriginService cmfCustomeroriginService;

    /**
     * 获取客户来源详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取客户来源详情失败")
    @ApiOperation(value = "客户来源详情", notes = "按ID获取客户来源详情")
    @GetMapping(value = "/customer/customerorigin/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCustomeroriginService.selectCmfCustomeroriginById(id), HttpStatus.OK);
    }

    /**
     * 获取客户来源列表
     * uniapp端调用
     *
     * @param cmfCustomerorigin
     * @return
     */
    @ApiResponse(code = 400, message = "获取客户来源列表失败")
    @ApiOperation(value = "客户来源列表", notes = "获取客户来源列表")
    @GetMapping(value = "/customer/customerorigin/info/")
    public ResponseEntity<Object> info(CmfCustomerorigin cmfCustomerorigin) throws IOException{
        return new ResponseEntity<>(cmfCustomeroriginService.selectCmfCustomeroriginList(cmfCustomerorigin), HttpStatus.OK);
    }
}