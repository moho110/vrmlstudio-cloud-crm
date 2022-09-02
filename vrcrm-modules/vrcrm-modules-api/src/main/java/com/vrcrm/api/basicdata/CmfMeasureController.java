package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfMeasureService;
import com.vrcrm.basicdata.domain.CmfMeasure;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 计量单位接口
 */

@Api(value = "计量单位接口")
@RestController
@RequestMapping("/api")
public class CmfMeasureController {

    @Autowired
    private ICmfMeasureService cmfMeasureService;

    /**
     * 获取计量单位详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取计量单位详情失败")
    @ApiOperation(value = "计量单位详情", notes = "按ID获取计量单位详情")
    @GetMapping(value = "/basicdata/measure/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfMeasureService.selectCmfMeasureById(id), HttpStatus.OK);
    }

    /**
     * 获取计量单位列表
     * uniapp端调用
     *
     * @param cmfMeasure
     * @return
     */
    @ApiResponse(code = 400, message = "获取计量单位列表失败")
    @ApiOperation(value = "计量单位列表", notes = "获取计量单位列表")
    @GetMapping(value = "/basicdata/measure/info/")
    public ResponseEntity<Object> info(CmfMeasure cmfMeasure) throws IOException{
        return new ResponseEntity<>(cmfMeasureService.selectCmfMeasureList(cmfMeasure), HttpStatus.OK);
    }
}