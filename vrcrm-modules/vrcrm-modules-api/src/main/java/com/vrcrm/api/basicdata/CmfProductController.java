package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfProductService;
import com.vrcrm.basicdata.domain.CmfProduct;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 产品接口
 */

@Api(value = "产品接口")
@RestController
@RequestMapping("/api")
public class CmfProductController {

    @Autowired
    private ICmfProductService cmfProductService;

    /**
     * 获取产品详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取产品详情失败")
    @ApiOperation(value = "产品详情", notes = "按ID获取产品详情")
    @GetMapping(value = "/basicdata/product/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfProductService.selectCmfProductById(id), HttpStatus.OK);
    }

    /**
     * 获取产品列表
     * uniapp端调用
     *
     * @param cmfProduct
     * @return
     */
    @ApiResponse(code = 400, message = "获取产品列表失败")
    @ApiOperation(value = "产品列表", notes = "获取产品列表")
    @GetMapping(value = "/basicdata/product/info/")
    public ResponseEntity<Object> info(CmfProduct cmfProduct) throws IOException{
        return new ResponseEntity<>(cmfProductService.selectCmfProductList(cmfProduct), HttpStatus.OK);
    }
}