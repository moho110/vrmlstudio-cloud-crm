package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfSupplyproductService;
import com.vrcrm.basicdata.domain.CmfSupplyproduct;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 供应商产品接口
 */

@Api(value = "供应商产品接口")
@RestController
@RequestMapping("/api")
public class CmfSupplyproductController {

    @Autowired
    private ICmfSupplyproductService cmfSupplyproductService;

    /**
     * 获取供应商产品详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取供应商产品详情失败")
    @ApiOperation(value = "供应商产品详情", notes = "按ID获取供应商产品详情")
    @GetMapping(value = "/basicdata/cmfsupplyproduct/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfSupplyproductService.selectCmfSupplyproductById(id), HttpStatus.OK);
    }

    /**
     * 获取供应商产品列表
     * uniapp端调用
     *
     * @param cmfSupplyproduct
     * @return
     */
    @ApiResponse(code = 400, message = "获取供应商产品列表失败")
    @ApiOperation(value = "供应商产品列表", notes = "获取供应商产品列表")
    @GetMapping(value = "/basicdata/cmfsupplyproduct/info/")
    public ResponseEntity<Object> info(CmfSupplyproduct cmfSupplyproduct) throws IOException{
        return new ResponseEntity<>(cmfSupplyproductService.selectCmfSupplyproductList(cmfSupplyproduct), HttpStatus.OK);
    }
}