package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfHrmsFileService;
import com.vrcrm.hr.domain.CmfHrmsFile;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 人事档案接口
 */

@Api(value = "人事档案接口")
@RestController
@RequestMapping("/api")
public class CmfHrmsFileController {

    @Autowired
    private ICmfHrmsFileService cmfHrmsFileService;

    /**
     * 获取人事档案详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取人事档案详情失败")
    @ApiOperation(value = "人事档案详情", notes = "按ID获取人事档案详情")
    @GetMapping(value = "/hr/hrmsfile/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfHrmsFileService.selectCmfHrmsFileById(id), HttpStatus.OK);
    }

    /**
     * 获取人事档案列表
     * uniapp端调用
     *
     * @param cmfHrmsFile
     * @return
     */
    @ApiResponse(code = 400, message = "获取人事档案列表失败")
    @ApiOperation(value = "人事档案列表", notes = "获取人事档案列表")
    @GetMapping(value = "/hr/hrmsfile/info/")
    public ResponseEntity<Object> info(CmfHrmsFile cmfHrmsFile) throws IOException{
        return new ResponseEntity<>(cmfHrmsFileService.selectCmfHrmsFileList(cmfHrmsFile), HttpStatus.OK);
    }
}