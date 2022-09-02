package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfDictXingzhengQingjiaService;
import com.vrcrm.hr.domain.CmfDictXingzhengQingjia;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 行政请假接口
 */

@Api(value = "行政请假接口")
@RestController
@RequestMapping("/api")
public class CmfDictXingzhengQingjiaController {

    @Autowired
    private ICmfDictXingzhengQingjiaService cmfDictXingzhengQingjiaService;

    /**
     * 获取行政请假详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取行政请假详情失败")
    @ApiOperation(value = "行政请假详情", notes = "按ID获取行政请假详情")
    @GetMapping(value = "/hr/dictxingzhengqingjia/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfDictXingzhengQingjiaService.selectCmfDictXingzhengQingjiaById(id), HttpStatus.OK);
    }

    /**
     * 获取行政请假列表
     * uniapp端调用
     *
     * @param cmfDictXingzhengQingjia
     * @return
     */
    @ApiResponse(code = 400, message = "获取行政请假列表失败")
    @ApiOperation(value = "行政请假列表", notes = "获取行政请假列表")
    @GetMapping(value = "/hr/dictxingzhengqingjia/info/")
    public ResponseEntity<Object> info(CmfDictXingzhengQingjia cmfDictXingzhengQingjia) throws IOException{
        return new ResponseEntity<>(cmfDictXingzhengQingjiaService.selectCmfDictXingzhengQingjiaList(cmfDictXingzhengQingjia), HttpStatus.OK);
    }
}