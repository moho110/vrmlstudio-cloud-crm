package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfProducttypeService;
import com.vrcrm.basicdata.domain.CmfProducttype;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 产品类型接口
 */

@Api(value = "产品类型接口")
@RestController
@RequestMapping("/api")
public class CmfProducttypeController {

    @Autowired
    private ICmfProducttypeService cmfProducttypeService;

    /**
     * 获取产品类型详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取产品类型详情失败")
    @ApiOperation(value = "产品类型详情", notes = "按ID获取产品类型详情")
    @GetMapping(value = "/basicdata/producttype/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfProducttypeService.selectCmfProducttypeById(id), HttpStatus.OK);
    }

    /**
     * 获取产品类型列表
     * uniapp端调用
     *
     * @param cmfProducttype
     * @return
     */
    @ApiResponse(code = 400, message = "获取产品类型列表失败")
    @ApiOperation(value = "产品类型列表", notes = "获取产品类型列表")
    @GetMapping(value = "/basicdata/producttype/info/")
    public ResponseEntity<Object> info(CmfProducttype cmfProducttype) throws IOException{
        return new ResponseEntity<>(cmfProducttypeService.selectCmfProducttypeList(cmfProducttype), HttpStatus.OK);
    }
}