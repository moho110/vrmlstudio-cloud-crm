package com.vrcrm.api.customer;

import com.vrcrm.customer.service.ICmfCustomerdefinetypeService;
import com.vrcrm.customer.domain.CmfCustomerdefinetype;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 客户定义类型接口
 */

@Api(value = "客户定义类型接口")
@RestController
@RequestMapping("/api")
public class CmfCustomerdefinetypeController {

    @Autowired
    private ICmfCustomerdefinetypeService cmfCustomerdefinetypeService;

    /**
     * 获取客户定义类型详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取客户定义类型详情失败")
    @ApiOperation(value = "客户定义类型详情", notes = "按ID获取客户定义类型详情")
    @GetMapping(value = "/customer/customerdefinetype/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCustomerdefinetypeService.selectCmfCustomerdefinetypeById(id), HttpStatus.OK);
    }

    /**
     * 获取客户定义类型列表
     * uniapp端调用
     *
     * @param cmfCustomerdefinetype
     * @return
     */
    @ApiResponse(code = 400, message = "获取客户定义类型列表失败")
    @ApiOperation(value = "客户定义类型列表", notes = "获取客户定义类型列表")
    @GetMapping(value = "/customer/customerdefinetype/info/")
    public ResponseEntity<Object> info(CmfCustomerdefinetype cmfCustomerdefinetype) throws IOException{
        return new ResponseEntity<>(cmfCustomerdefinetypeService.selectCmfCustomerdefinetypeList(cmfCustomerdefinetype), HttpStatus.OK);
    }
}