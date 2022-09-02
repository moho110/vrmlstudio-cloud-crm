package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfEduZhongcengmingxiService;
import com.vrcrm.hr.domain.CmfEduZhongcengmingxi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 中层干部测评内容明细接口
 */

@Api(value = "中层干部测评内容明细接口")
@RestController
@RequestMapping("/api")
public class CmfEduZhongcengmingxiController {

    @Autowired
    private ICmfEduZhongcengmingxiService cmfEduZhongcengmingxiService;

    /**
     * 获取中层干部测评内容明细详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取中层干部测评内容明细详情失败")
    @ApiOperation(value = "中层干部测评内容明细详情", notes = "按ID获取中层干部测评内容明细详情")
    @GetMapping(value = "/hr/zhongcengmingxi/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfEduZhongcengmingxiService.selectCmfEduZhongcengmingxiById(id), HttpStatus.OK);
    }

    /**
     * 获取中层干部测评内容明细列表
     * uniapp端调用
     *
     * @param cmfEduZhongcengmingxi
     * @return
     */
    @ApiResponse(code = 400, message = "获取中层干部测评内容明细列表失败")
    @ApiOperation(value = "中层干部测评内容明细列表", notes = "获取中层干部测评内容明细列表")
    @GetMapping(value = "/hr/zhongcengmingxi/info/")
    public ResponseEntity<Object> info(CmfEduZhongcengmingxi cmfEduZhongcengmingxi) throws IOException{
        return new ResponseEntity<>(cmfEduZhongcengmingxiService.selectCmfEduZhongcengmingxiList(cmfEduZhongcengmingxi), HttpStatus.OK);
    }
}