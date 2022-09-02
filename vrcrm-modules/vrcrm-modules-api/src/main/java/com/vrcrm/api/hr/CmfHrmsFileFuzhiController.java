package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfHrmsFileFuzhiService;
import com.vrcrm.hr.domain.CmfHrmsFileFuzhi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 人员复职接口
 */

@Api(value = "人员复职接口")
@RestController
@RequestMapping("/api")
public class CmfHrmsFileFuzhiController {

    @Autowired
    private ICmfHrmsFileFuzhiService cmfHrmsFileFuzhiService;

    /**
     * 获取人员复职详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取人员复职详情失败")
    @ApiOperation(value = "人员复职详情", notes = "按ID获取人员复职详情")
    @GetMapping(value = "/hr/hrmsfilefuzhi/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfHrmsFileFuzhiService.selectCmfHrmsFileFuzhiById(id), HttpStatus.OK);
    }

    /**
     * 获取人员复职列表
     * uniapp端调用
     *
     * @param cmfHrmsFileFuzhi
     * @return
     */
    @ApiResponse(code = 400, message = "获取人员复职列表失败")
    @ApiOperation(value = "人员复职列表", notes = "获取人员复职列表")
    @GetMapping(value = "/hr/hrmsfilefuzhi/info/")
    public ResponseEntity<Object> info(CmfHrmsFileFuzhi cmfHrmsFileFuzhi) throws IOException{
        return new ResponseEntity<>(cmfHrmsFileFuzhiService.selectCmfHrmsFileFuzhiList(cmfHrmsFileFuzhi), HttpStatus.OK);
    }
}