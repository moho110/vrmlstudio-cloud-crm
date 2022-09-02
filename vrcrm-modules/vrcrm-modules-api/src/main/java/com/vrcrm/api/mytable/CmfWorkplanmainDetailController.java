package com.vrcrm.api.mytable;

import com.vrcrm.mytable.service.ICmfWorkplanmainDetailService;
import com.vrcrm.mytable.domain.CmfWorkplanmainDetail;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 工作计划明细接口
 */

@Api(value = "工作计划明细接口")
@RestController
@RequestMapping("/api")
public class CmfWorkplanmainDetailController {

    @Autowired
    private ICmfWorkplanmainDetailService cmfWorkplanmainDetailService;

    /**
     * 获取工作计划明细
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取工作计划明细详情失败")
    @ApiOperation(value = "工作计划明细详情", notes = "按ID获取工作计划明细详情")
    @GetMapping(value = "/mytable/workplanmaindetail/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfWorkplanmainDetailService.selectCmfWorkplanmainDetailById(id), HttpStatus.OK);
    }

    /**
     * 获取工作计划明细列表
     * uniapp端调用
     *
     * @param cmfWorkplanmainDetail
     * @return
     */
    @ApiResponse(code = 400, message = "获取工作计划明细列表失败")
    @ApiOperation(value = "工作计划明细列表", notes = "获取工作计划明细列表")
    @GetMapping(value = "/mytable/workplanmaindetail/info/")
    public ResponseEntity<Object> info(CmfWorkplanmainDetail cmfWorkplanmainDetail) throws IOException{
        return new ResponseEntity<>(cmfWorkplanmainDetailService.selectCmfWorkplanmainDetailList(cmfWorkplanmainDetail), HttpStatus.OK);
    }
}