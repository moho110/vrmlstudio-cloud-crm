package com.vrcrm.api.sales;

import com.vrcrm.sales.service.ICmfSalemodeService;
import com.vrcrm.sales.domain.CmfSalemode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 帐号操作接口
 */

@Api(value = "帐号操作接口")
@RestController
@RequestMapping("/api")
public class CmfSalemodeController {

    @Autowired
    private ICmfSalemodeService cmfSalemodeService;

    /**
     * 获取固定资产情详
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取帐号操作详情失败")
    @ApiOperation(value = "帐号操作详情", notes = "按ID获取帐号操作详情")
    @GetMapping(value = "/sales/salemode/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfSalemodeService.selectCmfSalemodeById(id), HttpStatus.OK);
    }

    /**
     * 获取帐号操作列表
     * uniapp端调用
     *
     * @param cmfSalemode
     * @return
     */
    @ApiResponse(code = 400, message = "获取帐号操作列表失败")
    @ApiOperation(value = "帐号操作列表", notes = "获取帐号操作列表")
    @GetMapping(value = "/sales/salemode/info/")
    public ResponseEntity<Object> info(CmfSalemode cmfSalemode) throws IOException{
        return new ResponseEntity<>(cmfSalemodeService.selectCmfSalemodeList(cmfSalemode), HttpStatus.OK);
    }
}