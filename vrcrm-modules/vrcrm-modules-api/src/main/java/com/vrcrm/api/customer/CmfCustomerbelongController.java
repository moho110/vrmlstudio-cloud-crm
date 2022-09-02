package com.vrcrm.api.customer;

import com.vrcrm.customer.service.ICmfCustomerbelongService;
import com.vrcrm.customer.domain.CmfCustomerbelong;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 客户所属接口
 */

@Api(value = "客户所属接口")
@RestController
@RequestMapping("/api")
public class CmfCustomerbelongController {

    @Autowired
    private ICmfCustomerbelongService cmfCustomerbelongService;

    /**
     * 获取客户所属详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取客户所属详情失败")
    @ApiOperation(value = "客户所属详情", notes = "按ID获取客户所属详情")
    @GetMapping(value = "/customer/customerbelong/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCustomerbelongService.selectCmfCustomerbelongById(id), HttpStatus.OK);
    }

    /**
     * 获取客户所属列表
     * uniapp端调用
     *
     * @param cmfCustomerbelong
     * @return
     */
    @ApiResponse(code = 400, message = "获取客户所属列表失败")
    @ApiOperation(value = "客户所属列表", notes = "获取客户所属列表")
    @GetMapping(value = "/customer/customerbelong/info/")
    public ResponseEntity<Object> info(CmfCustomerbelong cmfCustomerbelong) throws IOException{
        return new ResponseEntity<>(cmfCustomerbelongService.selectCmfCustomerbelongList(cmfCustomerbelong), HttpStatus.OK);
    }
}