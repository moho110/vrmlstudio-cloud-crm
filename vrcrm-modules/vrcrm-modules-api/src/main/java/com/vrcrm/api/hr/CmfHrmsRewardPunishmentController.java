package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfHrmsRewardPunishmentService;
import com.vrcrm.hr.domain.CmfHrmsRewardPunishment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 人员奖惩接口
 */

@Api(value = "人员奖惩接口")
@RestController
@RequestMapping("/api")
public class CmfHrmsRewardPunishmentController {

    @Autowired
    private ICmfHrmsRewardPunishmentService cmfHrmsRewardPunishmentService;

    /**
     * 获取人员奖惩详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取人员奖惩详情失败")
    @ApiOperation(value = "人员奖惩详情", notes = "按ID获取人员奖惩详情")
    @GetMapping(value = "/hr/rewardpunishment/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfHrmsRewardPunishmentService.selectCmfHrmsRewardPunishmentById(id), HttpStatus.OK);
    }

    /**
     * 获取人员奖惩列表
     * uniapp端调用
     *
     * @param cmfHrmsRewardPunishment
     * @return
     */
    @ApiResponse(code = 400, message = "获取人员奖惩列表失败")
    @ApiOperation(value = "人员奖惩列表", notes = "获取人员奖惩列表")
    @GetMapping(value = "/hr/rewardpunishment/info/")
    public ResponseEntity<Object> info(CmfHrmsRewardPunishment cmfHrmsRewardPunishment) throws IOException{
        return new ResponseEntity<>(cmfHrmsRewardPunishmentService.selectCmfHrmsRewardPunishmentList(cmfHrmsRewardPunishment), HttpStatus.OK);
    }
}