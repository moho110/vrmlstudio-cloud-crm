package com.vrcrm.api.customer;

import com.vrcrm.customer.service.ICmfCustomerXuqiuService;
import com.vrcrm.customer.domain.CmfCustomerXuqiu;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 客户需求接口
 */

@Api(value = "客户需求接口")
@RestController
@RequestMapping("/api")
public class CmfCustomerXuqiuController {

    @Autowired
    private ICmfCustomerXuqiuService cmfCustomerXuqiuService;

    /**
     * 获取客户需求详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取客户需求详情失败")
    @ApiOperation(value = "客户需求详情", notes = "按ID获取客户需求详情")
    @GetMapping(value = "/customer/customerxuqiu/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCustomerXuqiuService.selectCmfCustomerXuqiuById(id), HttpStatus.OK);
    }

    /**
     * 获取客户需求列表
     * uniapp端调用
     *
     * @param cmfCustomerXuqiu
     * @return
     */
    @ApiResponse(code = 400, message = "获取客户需求列表失败")
    @ApiOperation(value = "客户需求列表", notes = "获取客户需求列表")
    @GetMapping(value = "/customer/customerxuqiu/info/")
    public ResponseEntity<Object> info(CmfCustomerXuqiu cmfCustomerXuqiu) throws IOException{
        return new ResponseEntity<>(cmfCustomerXuqiuService.selectCmfCustomerXuqiuList(cmfCustomerXuqiu), HttpStatus.OK);
    }
}