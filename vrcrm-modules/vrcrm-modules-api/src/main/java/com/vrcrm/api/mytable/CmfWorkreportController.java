package com.vrcrm.api.mytable;

import com.vrcrm.mytable.service.ICmfWorkreportService;
import com.vrcrm.mytable.domain.CmfWorkreport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 工作报告接口
 */

@Api(value = "工作报告接口")
@RestController
@RequestMapping("/api")
public class CmfWorkreportController {

    @Autowired
    private ICmfWorkreportService cmfWorkreportService;

    /**
     * 获取工作报告
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取工作报告详情失败")
    @ApiOperation(value = "工作报告详情", notes = "按ID获取工作报告详情")
    @GetMapping(value = "/mytable/workreport/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfWorkreportService.selectCmfWorkreportById(id), HttpStatus.OK);
    }

    /**
     * 获取工作报告列表
     * uniapp端调用
     *
     * @param cmfWorkreport
     * @return
     */
    @ApiResponse(code = 400, message = "获取工作报告列表失败")
    @ApiOperation(value = "工作报告列表", notes = "获取工作报告列表")
    @GetMapping(value = "/mytable/workreport/info/")
    public ResponseEntity<Object> info(CmfWorkreport cmfWorkreport) throws IOException{
        return new ResponseEntity<>(cmfWorkreportService.selectCmfWorkreportList(cmfWorkreport), HttpStatus.OK);
    }
}