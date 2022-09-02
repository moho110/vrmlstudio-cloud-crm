package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfHrmsWorkerZhengzhaoService;
import com.vrcrm.hr.domain.CmfHrmsWorkerZhengzhao;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 工作人员证照接口
 */

@Api(value = "工作人员证照接口")
@RestController
@RequestMapping("/api")
public class CmfHrmsWorkerZhengzhaoController {

    @Autowired
    private ICmfHrmsWorkerZhengzhaoService cmfHrmsWorkerZhengzhaoService;

    /**
     * 获取固定资产情详
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取工作人员证照详情失败")
    @ApiOperation(value = "工作人员证照详情", notes = "按ID获取工作人员证照详情")
    @GetMapping(value = "/hr/workerzhengzhao/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfHrmsWorkerZhengzhaoService.selectCmfHrmsWorkerZhengzhaoById(id), HttpStatus.OK);
    }

    /**
     * 获取工作人员证照列表
     * uniapp端调用
     *
     * @param cmfHrmsWorkerZhengzhao
     * @return
     */
    @ApiResponse(code = 400, message = "获取工作人员证照列表失败")
    @ApiOperation(value = "工作人员证照列表", notes = "获取工作人员证照列表")
    @GetMapping(value = "/hr/workerzhengzhao/info/")
    public ResponseEntity<Object> info(CmfHrmsWorkerZhengzhao cmfHrmsWorkerZhengzhao) throws IOException{
        return new ResponseEntity<>(cmfHrmsWorkerZhengzhaoService.selectCmfHrmsWorkerZhengzhaoList(cmfHrmsWorkerZhengzhao), HttpStatus.OK);
    }
}