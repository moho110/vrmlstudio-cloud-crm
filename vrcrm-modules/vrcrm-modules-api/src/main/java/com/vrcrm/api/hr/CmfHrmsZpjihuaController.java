package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfHrmsZpjihuaService;
import com.vrcrm.hr.domain.CmfHrmsZpjihua;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 招聘计划接口
 */

@Api(value = "招聘计划接口")
@RestController
@RequestMapping("/api")
public class CmfHrmsZpjihuaController {

    @Autowired
    private ICmfHrmsZpjihuaService cmfHrmsZpjihuaService;

    /**
     * 获取招聘计划详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取招聘计划详情失败")
    @ApiOperation(value = "招聘计划详情", notes = "按ID获取招聘计划详情")
    @GetMapping(value = "/hr/hrmszpjihua/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfHrmsZpjihuaService.selectCmfHrmsZpjihuaById(id), HttpStatus.OK);
    }

    /**
     * 获取招聘计划列表
     * uniapp端调用
     *
     * @param cmfHrmsZpjihua
     * @return
     */
    @ApiResponse(code = 400, message = "获取招聘计划列表失败")
    @ApiOperation(value = "招聘计划列表", notes = "获取招聘计划列表")
    @GetMapping(value = "/hr/hrmszpjihua/info/")
    public ResponseEntity<Object> info(CmfHrmsZpjihua cmfHrmsZpjihua) throws IOException{
        return new ResponseEntity<>(cmfHrmsZpjihuaService.selectCmfHrmsZpjihuaList(cmfHrmsZpjihua), HttpStatus.OK);
    }
}