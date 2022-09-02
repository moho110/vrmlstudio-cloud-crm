package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfUnitService;
import com.vrcrm.basicdata.domain.CmfUnit;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 单位接口
 */

@Api(value = "单位接口")
@RestController
@RequestMapping("/api")
public class CmfUnitController {

    @Autowired
    private ICmfUnitService cmfUnitService;

    /**
     * 获取单位详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取单位详情失败")
    @ApiOperation(value = "单位详情", notes = "按ID获取单位详情")
    @GetMapping(value = "/basicdata/cmfunit/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfUnitService.selectCmfUnitById(id), HttpStatus.OK);
    }

    /**
     * 获取单位列表
     * uniapp端调用
     *
     * @param cmfUnit
     * @return
     */
    @ApiResponse(code = 400, message = "获取单位列表失败")
    @ApiOperation(value = "单位列表", notes = "获取单位列表")
    @GetMapping(value = "/basicdata/cmfunit/info/")
    public ResponseEntity<Object> info(CmfUnit cmfUnit) throws IOException{
        return new ResponseEntity<>(cmfUnitService.selectCmfUnitList(cmfUnit), HttpStatus.OK);
    }
}