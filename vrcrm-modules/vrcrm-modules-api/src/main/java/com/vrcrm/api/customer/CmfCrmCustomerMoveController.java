package com.vrcrm.api.customer;

import com.vrcrm.customer.service.ICmfCrmCustomerMoveService;
import com.vrcrm.customer.domain.CmfCrmCustomerMove;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 客户移除接口
 */

@Api(value = "客户移除接口")
@RestController
@RequestMapping("/api")
public class CmfCrmCustomerMoveController {

    @Autowired
    private ICmfCrmCustomerMoveService cmfCrmCustomerMoveService;

    /**
     * 获取客户移除详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取客户移除详情失败")
    @ApiOperation(value = "客户移除详情", notes = "按ID获取客户移除详情")
    @GetMapping(value = "/customer/crmcustomermove/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCrmCustomerMoveService.selectCmfCrmCustomerMoveById(id), HttpStatus.OK);
    }

    /**
     * 获取客户移除列表
     * uniapp端调用
     *
     * @param cmfCrmCustomerMove
     * @return
     */
    @ApiResponse(code = 400, message = "获取客户移除列表失败")
    @ApiOperation(value = "客户移除列表", notes = "获取客户移除列表")
    @GetMapping(value = "/customer/crmcustomermove/info/")
    public ResponseEntity<Object> info(CmfCrmCustomerMove cmfCrmCustomerMove) throws IOException{
        return new ResponseEntity<>(cmfCrmCustomerMoveService.selectCmfCrmCustomerMoveList(cmfCrmCustomerMove), HttpStatus.OK);
    }
}