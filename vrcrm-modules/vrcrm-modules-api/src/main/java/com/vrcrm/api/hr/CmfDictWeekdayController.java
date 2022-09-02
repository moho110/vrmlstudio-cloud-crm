package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfDictWeekdayService;
import com.vrcrm.hr.domain.CmfDictWeekday;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 周工作日接口
 */

@Api(value = "周工作日接口")
@RestController
@RequestMapping("/api")
public class CmfDictWeekdayController {

    @Autowired
    private ICmfDictWeekdayService cmfDictWeekdayService;

    /**
     * 获取固定资产情详
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取周工作日详情失败")
    @ApiOperation(value = "周工作日详情", notes = "按ID获取周工作日详情")
    @GetMapping(value = "/hr/weekday/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfDictWeekdayService.selectCmfDictWeekdayById(id), HttpStatus.OK);
    }

    /**
     * 获取周工作日列表
     * uniapp端调用
     *
     * @param cmfDictWeekday
     * @return
     */
    @ApiResponse(code = 400, message = "获取周工作日列表失败")
    @ApiOperation(value = "周工作日列表", notes = "获取周工作日列表")
    @GetMapping(value = "/hr/weekday/info/")
    public ResponseEntity<Object> info(CmfDictWeekday cmfDictWeekday) throws IOException{
        return new ResponseEntity<>(cmfDictWeekdayService.selectCmfDictWeekdayList(cmfDictWeekday), HttpStatus.OK);
    }
}