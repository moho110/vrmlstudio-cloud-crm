package com.vrcrm.api.customer;

import com.vrcrm.customer.service.ICmfCustomerproductDetailService;
import com.vrcrm.customer.domain.CmfCustomerproductDetail;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 产品明细表接口
 */

@Api(value = "产品明细表接口")
@RestController
@RequestMapping("/api")
public class CmfCustomerproductDetailController {

    @Autowired
    private ICmfCustomerproductDetailService cmfCustomerproductDetailService;

    /**
     * 获取产品明细表详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取产品明细表详情失败")
    @ApiOperation(value = "产品明细表详情", notes = "按ID获取产品明细表详情")
    @GetMapping(value = "/customer/customerproductdetai/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCustomerproductDetailService.selectCmfCustomerproductDetailById(id), HttpStatus.OK);
    }

    /**
     * 获取产品明细表列表
     * uniapp端调用
     *
     * @param cmfCustomerproductDetail
     * @return
     */
    @ApiResponse(code = 400, message = "获取产品明细表列表失败")
    @ApiOperation(value = "产品明细表列表", notes = "获取产品明细表列表")
    @GetMapping(value = "/customer/customerproductdetai/info/")
    public ResponseEntity<Object> info(CmfCustomerproductDetail cmfCustomerproductDetail) throws IOException{
        return new ResponseEntity<>(cmfCustomerproductDetailService.selectCmfCustomerproductDetailList(cmfCustomerproductDetail), HttpStatus.OK);
    }
}