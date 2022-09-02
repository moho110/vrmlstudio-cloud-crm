package com.vrcrm.api.customer;

import com.vrcrm.customer.service.ICmfCustomerareaService;
import com.vrcrm.customer.domain.CmfCustomerarea;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 客户区域接口
 */

@Api(value = "客户区域接口")
@RestController
@RequestMapping("/api")
public class CmfCustomerareaController {

    @Autowired
    private ICmfCustomerareaService cmfCustomerareaService;

    /**
     * 获取客户区域详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取客户区域详情失败")
    @ApiOperation(value = "客户区域详情", notes = "按ID获取客户区域详情")
    @GetMapping(value = "/customer/customerarea/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCustomerareaService.selectCmfCustomerareaById(id), HttpStatus.OK);
    }

    /**
     * 获取客户区域列表
     * uniapp端调用
     *
     * @param cmfCustomerarea
     * @return
     */
    @ApiResponse(code = 400, message = "获取客户区域列表失败")
    @ApiOperation(value = "客户区域列表", notes = "获取客户区域列表")
    @GetMapping(value = "/customer/customerarea/info/")
    public ResponseEntity<Object> info(CmfCustomerarea cmfCustomerarea) throws IOException{
        return new ResponseEntity<>(cmfCustomerareaService.selectCmfCustomerareaList(cmfCustomerarea), HttpStatus.OK);
    }
}