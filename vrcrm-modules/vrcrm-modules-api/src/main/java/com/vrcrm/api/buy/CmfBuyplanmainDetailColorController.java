package com.vrcrm.api.buy;

import com.vrcrm.buy.service.ICmfBuyplanmainDetailColorService;
import com.vrcrm.buy.domain.CmfBuyplanmainDetailColor;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 采购计划明细表颜色接口
 */

@Api(value = "采购计划明细表颜色接口")
@RestController
@RequestMapping("/api")
public class CmfBuyplanmainDetailColorController {

    @Autowired
    private ICmfBuyplanmainDetailColorService cmfBuyplanmainDetailColorService;

    /**
     * 获取采购计划明细表颜色详请
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取采购计划明细表颜色详情失败")
    @ApiOperation(value = "采购计划明细表颜色详情", notes = "按ID获取采购计划明细表颜色详情")
    @GetMapping(value = "/buy/buyplanmaindetailcolor/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfBuyplanmainDetailColorService.selectCmfBuyplanmainDetailColorById(id), HttpStatus.OK);
    }

    /**
     * 获取采购计划明细表颜色列表
     * uniapp端调用
     *
     * @param cmfBuyplanmainDetailColor
     * @return
     */
    @ApiResponse(code = 400, message = "获取采购计划明细表颜色列表失败")
    @ApiOperation(value = "采购计划明细表颜色列表", notes = "获取采购计划明细表颜色列表")
    @GetMapping(value = "/buy/buyplanmaindetailcolor/info/")
    public ResponseEntity<Object> info(CmfBuyplanmainDetailColor cmfBuyplanmainDetailColor) throws IOException{
        return new ResponseEntity<>(cmfBuyplanmainDetailColorService.selectCmfBuyplanmainDetailColorList(cmfBuyplanmainDetailColor), HttpStatus.OK);
    }
}