package com.vrcrm.api.customer;

import com.vrcrm.customer.service.ICmfCustomerleverService;
import com.vrcrm.customer.domain.CmfCustomerlever;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 客户等级接口
 */

@Api(value = "客户等级接口")
@RestController
@RequestMapping("/api")
public class CmfCustomerleverController {

    @Autowired
    private ICmfCustomerleverService cmfCustomerleverService;

    /**
     * 获取客户等级详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取客户等级详情失败")
    @ApiOperation(value = "客户等级详情", notes = "按ID获取客户等级详情")
    @GetMapping(value = "/customer/customerlever/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCustomerleverService.selectCmfCustomerleverById(id), HttpStatus.OK);
    }

    /**
     * 获取客户等级列表
     * uniapp端调用
     *
     * @param cmfCustomerlever
     * @return
     */
    @ApiResponse(code = 400, message = "获取客户等级列表失败")
    @ApiOperation(value = "客户等级列表", notes = "获取客户等级列表")
    @GetMapping(value = "/customer/customerlever/info/")
    public ResponseEntity<Object> info(CmfCustomerlever cmfCustomerlever) throws IOException{
        return new ResponseEntity<>(cmfCustomerleverService.selectCmfCustomerleverList(cmfCustomerlever), HttpStatus.OK);
    }
}