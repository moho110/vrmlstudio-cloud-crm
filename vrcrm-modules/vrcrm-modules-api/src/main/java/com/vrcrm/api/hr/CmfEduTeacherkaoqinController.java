package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfEduTeacherkaoqinService;
import com.vrcrm.hr.domain.CmfEduTeacherkaoqin;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 教师考勤接口
 */

@Api(value = "教师考勤接口")
@RestController
@RequestMapping("/api")
public class CmfEduTeacherkaoqinController {

    @Autowired
    private ICmfEduTeacherkaoqinService cmfEduTeacherkaoqinService;

    /**
     * 获取教师考勤详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取教师考勤详情失败")
    @ApiOperation(value = "教师考勤详情", notes = "按ID获取教师考勤详情")
    @GetMapping(value = "/hr/teacherkaoqin/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfEduTeacherkaoqinService.selectCmfEduTeacherkaoqinById(id), HttpStatus.OK);
    }

    /**
     * 获取教师考勤列表
     * uniapp端调用
     *
     * @param teacherkaoqin
     * @return
     */
    @ApiResponse(code = 400, message = "获取教师考勤列表失败")
    @ApiOperation(value = "教师考勤列表", notes = "获取教师考勤列表")
    @GetMapping(value = "/hr/teacherkaoqin/info/")
    public ResponseEntity<Object> info(CmfEduTeacherkaoqin teacherkaoqin) throws IOException{
        return new ResponseEntity<>(cmfEduTeacherkaoqinService.selectCmfEduTeacherkaoqinList(teacherkaoqin), HttpStatus.OK);
    }
}