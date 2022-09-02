package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfUnitpropService;
import com.vrcrm.basicdata.domain.CmfUnitprop;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 单位属性接口
 */

@Api(value = "单位属性接口")
@RestController
@RequestMapping("/api")
public class CmfUnitpropController {

    @Autowired
    private ICmfUnitpropService cmfUnitpropService;

    /**
     * 获取单位属性详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取单位属性详情失败")
    @ApiOperation(value = "单位属性详情", notes = "按ID获取单位属性详情")
    @GetMapping(value = "/basicdata/unitprop/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfUnitpropService.selectCmfUnitpropById(id), HttpStatus.OK);
    }

    /**
     * 获取单位属性列表
     * uniapp端调用
     *
     * @param cmfUnitprop
     * @return
     */
    @ApiResponse(code = 400, message = "获取单位属性列表失败")
    @ApiOperation(value = "单位属性列表", notes = "获取单位属性列表")
    @GetMapping(value = "/basicdata/unitprop/info/")
    public ResponseEntity<Object> info(CmfUnitprop cmfUnitprop) throws IOException{
        return new ResponseEntity<>(cmfUnitpropService.selectCmfUnitpropList(cmfUnitprop), HttpStatus.OK);
    }
}