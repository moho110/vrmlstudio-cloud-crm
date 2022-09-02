package com.vrcrm.api.buy;

import com.vrcrm.system.service.ICmfBuyplanmainDetailService;
import com.vrcrm.system.domain.CmfBuyplanmainDetail;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 采购单名细接口
 */

@Api(value = "采购单名细接口")
@RestController
@RequestMapping("/api")
public class CmfBuyplanmainDetailController {

    @Autowired
    private ICmfBuyplanmainDetailService cmfBuyplanmainDetailService;

    /**
     * 获取采购单名细详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取采购单名细详情失败")
    @ApiOperation(value = "采购单名细详情", notes = "按ID获取采购单名细详情")
    @GetMapping(value = "/buy/buyplanmaindetail/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfBuyplanmainDetailService.selectCmfBuyplanmainDetailById(id), HttpStatus.OK);
    }

    /**
     * 获取采购单名细列表
     * uniapp端调用
     *
     * @param cmfBuyplanmainDetail
     * @return
     */
    @ApiResponse(code = 400, message = "获取采购单名细列表失败")
    @ApiOperation(value = "采购单名细列表", notes = "获取采购单名细列表")
    @GetMapping(value = "/buy/buyplanmaindetail/info/")
    public ResponseEntity<Object> info(CmfBuyplanmainDetail cmfBuyplanmainDetail) throws IOException{
        return new ResponseEntity<>(cmfBuyplanmainDetailService.selectCmfBuyplanmainDetailList(cmfBuyplanmainDetail), HttpStatus.OK);
    }
}