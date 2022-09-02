package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfEduXingzhengQingjiaService;
import com.vrcrm.hr.domain.CmfEduXingzhengQingjia;
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
public class CmfEduXingzhengQingjiaController {

    @Autowired
    private ICmfEduXingzhengQingjiaService cmfEduXingzhengQingjiaService;

    /**
     * 获取行政请假详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取行政请假详情失败")
    @ApiOperation(value = "行政请假详情", notes = "按ID获取行政请假详情")
    @GetMapping(value = "/hr/qingjia/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfEduXingzhengQingjiaService.selectCmfEduXingzhengQingjiaById(id), HttpStatus.OK);
    }

    /**
     * 获取行政请假列表
     * uniapp端调用
     *
     * @param cmfEduXingzhengQingjia
     * @return
     */
    @ApiResponse(code = 400, message = "获取行政请假列表失败")
    @ApiOperation(value = "行政请假列表", notes = "获取行政请假列表")
    @GetMapping(value = "/hr/qingjia/info/")
    public ResponseEntity<Object> info(CmfEduXingzhengQingjia cmfEduXingzhengQingjia) throws IOException{
        return new ResponseEntity<>(cmfEduXingzhengQingjiaService.selectCmfEduXingzhengQingjiaList(cmfEduXingzhengQingjia), HttpStatus.OK);
    }
}