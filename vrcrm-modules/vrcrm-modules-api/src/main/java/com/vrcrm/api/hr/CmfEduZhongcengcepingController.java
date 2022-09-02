package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfEduZhongcengcepingService;
import com.vrcrm.hr.domain.CmfEduZhongcengceping;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 中层测评接口
 */

@Api(value = "中层测评接口")
@RestController
@RequestMapping("/api")
public class CmfEduZhongcengcepingController {

    @Autowired
    private ICmfEduZhongcengcepingService cmfEduZhongcengcepingService;

    /**
     * 获取中层测评详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取中层测评详情失败")
    @ApiOperation(value = "中层测评详情", notes = "按ID获取中层测评详情")
    @GetMapping(value = "/hr/cengceping/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfEduZhongcengcepingService.selectCmfEduZhongcengcepingById(id), HttpStatus.OK);
    }

    /**
     * 获取中层测评列表
     * uniapp端调用
     *
     * @param cmfEduZhongcengceping
     * @return
     */
    @ApiResponse(code = 400, message = "获取中层测评列表失败")
    @ApiOperation(value = "中层测评列表", notes = "获取中层测评列表")
    @GetMapping(value = "/hr/cengceping/info/")
    public ResponseEntity<Object> info(CmfEduZhongcengceping cmfEduZhongcengceping) throws IOException{
        return new ResponseEntity<>(cmfEduZhongcengcepingService.selectCmfEduZhongcengcepingList(cmfEduZhongcengceping), HttpStatus.OK);
    }
}