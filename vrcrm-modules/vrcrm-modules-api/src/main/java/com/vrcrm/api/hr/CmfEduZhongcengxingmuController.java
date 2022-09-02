package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfEduZhongcengxingmuService;
import com.vrcrm.hr.domain.CmfEduZhongcengxingmu;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 中层干部测评项目明细接口
 */

@Api(value = "中层干部测评项目明细接口")
@RestController
@RequestMapping("/api")
public class CmfEduZhongcengxingmuController {

    @Autowired
    private ICmfEduZhongcengxingmuService cmfEduZhongcengxingmuService;

    /**
     * 获取中层干部测评项目明细详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取中层干部测评项目明细详情失败")
    @ApiOperation(value = "中层干部测评项目明细详情", notes = "按ID获取中层干部测评项目明细详情")
    @GetMapping(value = "/hr/zhongcengxingmu/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfEduZhongcengxingmuService.selectCmfEduZhongcengxingmuById(id), HttpStatus.OK);
    }

    /**
     * 获取中层干部测评项目明细列表
     * uniapp端调用
     *
     * @param cmfEduZhongcengxingmu
     * @return
     */
    @ApiResponse(code = 400, message = "获取中层干部测评项目明细列表失败")
    @ApiOperation(value = "中层干部测评项目明细列表", notes = "获取中层干部测评项目明细列表")
    @GetMapping(value = "/hr/zhongcengxingmu/info/")
    public ResponseEntity<Object> info(CmfEduZhongcengxingmu cmfEduZhongcengxingmu) throws IOException{
        return new ResponseEntity<>(cmfEduZhongcengxingmuService.selectCmfEduZhongcengxingmuList(cmfEduZhongcengxingmu), HttpStatus.OK);
    }
}