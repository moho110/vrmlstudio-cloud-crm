package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfProductcolorService;
import com.vrcrm.basicdata.domain.CmfProductcolor;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 产品颜色接口
 */

@Api(value = "产品颜色接口")
@RestController
@RequestMapping("/api")
public class CmfProductcolorController {

    @Autowired
    private ICmfProductcolorService cmfProductcolorService;

    /**
     * 获取产品颜色详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取产品颜色详情失败")
    @ApiOperation(value = "产品颜色详情", notes = "按ID获取产品颜色详情")
    @GetMapping(value = "/basicdata/productcolor/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfProductcolorService.selectCmfProductcolorById(id), HttpStatus.OK);
    }

    /**
     * 获取产品颜色列表
     * uniapp端调用
     *
     * @param cmfProductcolor
     * @return
     */
    @ApiResponse(code = 400, message = "获取产品颜色列表失败")
    @ApiOperation(value = "产品颜色列表", notes = "获取产品颜色列表")
    @GetMapping(value = "/basicdata/productcolor/info/")
    public ResponseEntity<Object> info(CmfProductcolor cmfProductcolor) throws IOException{
        return new ResponseEntity<>(cmfProductcolorService.selectCmfProductcolorList(cmfProductcolor), HttpStatus.OK);
    }
}