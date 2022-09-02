package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfHrmsWorkerHetongService;
import com.vrcrm.hr.domain.CmfHrmsWorkerHetong;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 工作人员合同接口
 */

@Api(value = "工作人员合同接口")
@RestController
@RequestMapping("/api")
public class CmfHrmsWorkerHetongController {

    @Autowired
    private ICmfHrmsWorkerHetongService cmfHrmsWorkerHetongService;

    /**
     * 获取工作人员合同详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取工作人员合同详情失败")
    @ApiOperation(value = "工作人员合同详情", notes = "按ID获取工作人员合同详情")
    @GetMapping(value = "/hr/workerhetong/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfHrmsWorkerHetongService.selectCmfHrmsWorkerHetongById(id), HttpStatus.OK);
    }

    /**
     * 获取工作人员合同列表
     * uniapp端调用
     *
     * @param cmfHrmsWorkerHetong
     * @return
     */
    @ApiResponse(code = 400, message = "获取工作人员合同列表失败")
    @ApiOperation(value = "工作人员合同列表", notes = "获取工作人员合同列表")
    @GetMapping(value = "/hr/workerhetong/info/")
    public ResponseEntity<Object> info(CmfHrmsWorkerHetong cmfHrmsWorkerHetong) throws IOException{
        return new ResponseEntity<>(cmfHrmsWorkerHetongService.selectCmfHrmsWorkerHetongList(cmfHrmsWorkerHetong), HttpStatus.OK);
    }
}