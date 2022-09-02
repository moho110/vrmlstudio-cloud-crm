package com.vrcrm.api.customer;

import com.vrcrm.customer.service.ICmfCustomerproductService;
import com.vrcrm.customer.domain.CmfCustomerproduct;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 产品列表接口
 */

@Api(value = "产品列表接口")
@RestController
@RequestMapping("/api")
public class CmfCustomerproductController {

    @Autowired
    private ICmfCustomerproductService cmfCustomerproductService;

    /**
     * 获取产品列表详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取产品列表详情失败")
    @ApiOperation(value = "产品列表详情", notes = "按ID获取产品列表详情")
    @GetMapping(value = "/customer/customerproduct/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCustomerproductService.selectCmfCustomerproductById(id), HttpStatus.OK);
    }

    /**
     * 获取产品列表列表
     * uniapp端调用
     *
     * @param cmfCustomerproduct
     * @return
     */
    @ApiResponse(code = 400, message = "获取产品列表列表失败")
    @ApiOperation(value = "产品列表列表", notes = "获取产品列表列表")
    @GetMapping(value = "/customer/customerproduct/info/")
    public ResponseEntity<Object> info(CmfCustomerproduct cmfCustomerproduct) throws IOException{
        return new ResponseEntity<>(cmfCustomerproductService.selectCmfCustomerproductList(cmfCustomerproduct), HttpStatus.OK);
    }
}