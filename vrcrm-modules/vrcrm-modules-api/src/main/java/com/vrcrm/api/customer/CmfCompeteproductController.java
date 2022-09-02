package com.vrcrm.api.customer;

import com.vrcrm.customer.service.ICmfCompeteproductService;
import com.vrcrm.customer.domain.CmfCompeteproduct;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 竞争对手接口
 */

@Api(value = "竞争对手接口")
@RestController
@RequestMapping("/api")
public class CmfCompeteproductController {

    @Autowired
    private ICmfCompeteproductService cmfCompeteproductService;

    /**
     * 获取竞争对手详请
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取竞争对手详情失败")
    @ApiOperation(value = "竞争对手详情", notes = "按ID获取竞争对手详情")
    @GetMapping(value = "/customer/competeproduct/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCompeteproductService.selectCmfCompeteproductById(id), HttpStatus.OK);
    }

    /**
     * 获取竞争对手列表
     * uniapp端调用
     *
     * @param cmfCompeteproduct
     * @return
     */
    @ApiResponse(code = 400, message = "获取竞争对手列表失败")
    @ApiOperation(value = "竞争对手列表", notes = "获取竞争对手列表")
    @GetMapping(value = "/customer/competeproduct/info/")
    public ResponseEntity<Object> info(CmfCompeteproduct cmfCompeteproduct) throws IOException{
        return new ResponseEntity<>(cmfCompeteproductService.selectCmfCompeteproductList(cmfCompeteproduct), HttpStatus.OK);
    }
}