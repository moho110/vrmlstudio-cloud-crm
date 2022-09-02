package com.vrcrm.api.buy;

import com.vrcrm.buy.service.ICmfBuyplanmainTmpColorService;
import com.vrcrm.buy.domain.CmfBuyplanmainTmpColor;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 采购单临时颜色表接口
 */

@Api(value = "采购单临时颜色表接口")
@RestController
@RequestMapping("/api")
public class CmfBuyplanmainTmpColorController {

    @Autowired
    private ICmfBuyplanmainTmpColorService cmfBuyplanmainTmpColorService;

    /**
     * 获取采购单临时颜色表详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取采购单临时颜色表详情失败")
    @ApiOperation(value = "采购单临时颜色表详情", notes = "按ID获取采购单临时颜色表详情")
    @GetMapping(value = "/buy/buyplanmaintmpcolor/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfBuyplanmainTmpColorService.selectCmfBuyplanmainTmpColorById(id), HttpStatus.OK);
    }

    /**
     * 获取采购单临时颜色表列表
     * uniapp端调用
     *
     * @param cmfBuyplanmainTmpColor
     * @return
     */
    @ApiResponse(code = 400, message = "获取采购单临时颜色表列表失败")
    @ApiOperation(value = "采购单临时颜色表列表", notes = "获取采购单临时颜色表列表")
    @GetMapping(value = "/buy/buyplanmaintmpcolor/info/")
    public ResponseEntity<Object> info(CmfBuyplanmainTmpColor cmfBuyplanmainTmpColor) throws IOException{
        return new ResponseEntity<>(cmfBuyplanmainTmpColorService.selectCmfBuyplanmainTmpColorList(cmfBuyplanmainTmpColor), HttpStatus.OK);
    }
}