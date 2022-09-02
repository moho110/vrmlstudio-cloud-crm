package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfHrmsWorkStatusService;
import com.vrcrm.hr.domain.CmfHrmsWorkStatus;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 工作人员状态接口
 */

@Api(value = "工作人员状态接口")
@RestController
@RequestMapping("/api")
public class CmfHrmsWorkStatusController {

    @Autowired
    private ICmfHrmsWorkStatusService cmfHrmsWorkStatusService;

    /**
     * 获取工作人员状态详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取工作人员状态详情失败")
    @ApiOperation(value = "工作人员状态详情", notes = "按ID获取工作人员状态详情")
    @GetMapping(value = "/hr/workstatus/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfHrmsWorkStatusService.selectCmfHrmsWorkStatusById(id), HttpStatus.OK);
    }

    /**
     * 获取工作人员状态列表
     * uniapp端调用
     *
     * @param cmfHrmsWorkStatus
     * @return
     */
    @ApiResponse(code = 400, message = "获取工作人员状态列表失败")
    @ApiOperation(value = "工作人员状态列表", notes = "获取工作人员状态列表")
    @GetMapping(value = "/hr/workstatus/info/")
    public ResponseEntity<Object> info(CmfHrmsWorkStatus cmfHrmsWorkStatus) throws IOException{
        return new ResponseEntity<>(cmfHrmsWorkStatusService.selectCmfHrmsWorkStatusList(cmfHrmsWorkStatus), HttpStatus.OK);
    }
}