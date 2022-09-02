package com.vrcrm.api.finance;

import com.vrcrm.finance.service.ICmfAccesstypeService;
import com.vrcrm.finance.domain.CmfAccesstype;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 帐户操作类型接口
 */

@Api(value = "帐户操作类型接口")
@RestController
@RequestMapping("/api")
public class CmfAccesstypeController {

    @Autowired
    private ICmfAccesstypeService cmfAccesstypeService;

    /**
     * 获取帐户操作类型情详
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取帐户操作类型详情失败")
    @ApiOperation(value = "帐户操作类型详情", notes = "按ID获取帐户操作类型详情")
    @GetMapping(value = "/finance/accesstype/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfAccesstypeService.selectCmfAccesstypeById(id), HttpStatus.OK);
    }

    /**
     * 获取帐户操作类型列表
     * uniapp端调用
     *
     * @param cmfAccesstype
     * @return
     */
    @ApiResponse(code = 400, message = "获取帐户操作类型列表失败")
    @ApiOperation(value = "帐户操作类型列表", notes = "获取帐户操作类型列表")
    @GetMapping(value = "/finance/accesstype/info/")
    public ResponseEntity<Object> info(CmfAccesstype cmfAccesstype) throws IOException{
        return new ResponseEntity<>(cmfAccesstypeService.selectCmfAccesstypeList(cmfAccesstype), HttpStatus.OK);
    }
}

