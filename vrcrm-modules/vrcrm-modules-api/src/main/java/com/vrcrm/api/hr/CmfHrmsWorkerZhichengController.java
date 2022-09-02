package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfHrmsWorkerZhichengService;
import com.vrcrm.hr.domain.CmfHrmsWorkerZhicheng;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 工作人员职称接口
 */

@Api(value = "工作人员职称接口")
@RestController
@RequestMapping("/api")
public class CmfHrmsWorkerZhichengController {

    @Autowired
    private ICmfHrmsWorkerZhichengService cmfHrmsWorkerZhichengService;

    /**
     * 获取固定资产情详
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取工作人员职称详情失败")
    @ApiOperation(value = "工作人员职称详情", notes = "按ID获取工作人员职称详情")
    @GetMapping(value = "/hr/workerzhicheng/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfHrmsWorkerZhichengService.selectCmfHrmsWorkerZhichengById(id), HttpStatus.OK);
    }

    /**
     * 获取工作人员职称列表
     * uniapp端调用
     *
     * @param cmfHrmsWorkerZhicheng
     * @return
     */
    @ApiResponse(code = 400, message = "获取工作人员职称列表失败")
    @ApiOperation(value = "工作人员职称列表", notes = "获取工作人员职称列表")
    @GetMapping(value = "/hr/workerzhicheng/info/")
    public ResponseEntity<Object> info(CmfHrmsWorkerZhicheng cmfHrmsWorkerZhicheng) throws IOException{
        return new ResponseEntity<>(cmfHrmsWorkerZhichengService.selectCmfHrmsWorkerZhichengList(cmfHrmsWorkerZhicheng), HttpStatus.OK);
    }
}