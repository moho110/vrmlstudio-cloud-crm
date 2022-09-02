package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfSupplyService;
import com.vrcrm.basicdata.domain.CmfSupply;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 供应商接口
 */

@Api(value = "供应商接口")
@RestController
@RequestMapping("/api")
public class CmfSupplyController {

    @Autowired
    private ICmfSupplyService cmfSupplyService;

    /**
     * 获取供应商详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取供应商详情失败")
    @ApiOperation(value = "供应商详情", notes = "按ID获取供应商详情")
    @GetMapping(value = "/basicdata/cmfsupply/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Long id) throws IOException {
        return new ResponseEntity<>(cmfSupplyService.selectCmfSupplyById(id), HttpStatus.OK);
    }

    /**
     * 获取供应商列表
     * uniapp端调用
     *
     * @param cmfSupply
     * @return
     */
    @ApiResponse(code = 400, message = "获取供应商列表失败")
    @ApiOperation(value = "供应商列表", notes = "获取供应商列表")
    @GetMapping(value = "/basicdata/cmfsupply/info/")
    public ResponseEntity<Object> info(CmfSupply cmfSupply) throws IOException{
        return new ResponseEntity<>(cmfSupplyService.selectCmfSupplyList(cmfSupply), HttpStatus.OK);
    }
}