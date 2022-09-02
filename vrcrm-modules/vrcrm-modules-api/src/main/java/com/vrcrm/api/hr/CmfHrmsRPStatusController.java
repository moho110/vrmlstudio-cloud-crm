package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfHrmsRPStatusService;
import com.vrcrm.hr.domain.CmfHrmsRPStatus;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 奖惩状态接口
 */

@Api(value = "奖惩状态接口")
@RestController
@RequestMapping("/api")
public class CmfHrmsRPStatusController {

    @Autowired
    private ICmfHrmsRPStatusService cmfHrmsRPStatusService;

    /**
     * 获取奖惩状态详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取奖惩状态详情失败")
    @ApiOperation(value = "奖惩状态详情", notes = "按ID获取奖惩状态详情")
    @GetMapping(value = "/hr/rpstatus/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfHrmsRPStatusService.selectCmfHrmsRPStatusById(id), HttpStatus.OK);
    }

    /**
     * 获取奖惩状态列表
     * uniapp端调用
     *
     * @param cmfHrmsRPStatus
     * @return
     */
    @ApiResponse(code = 400, message = "获取奖惩状态列表失败")
    @ApiOperation(value = "奖惩状态列表", notes = "获取奖惩状态列表")
    @GetMapping(value = "/hr/rpstatus/info/")
    public ResponseEntity<Object> info(CmfHrmsRPStatus cmfHrmsRPStatus) throws IOException{
        return new ResponseEntity<>(cmfHrmsRPStatusService.selectCmfHrmsRPStatusList(cmfHrmsRPStatus), HttpStatus.OK);
    }
}