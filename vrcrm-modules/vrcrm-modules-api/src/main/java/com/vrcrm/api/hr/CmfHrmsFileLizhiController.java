package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfHrmsFileLizhiService;
import com.vrcrm.hr.domain.CmfHrmsFileLizhi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 人员离职接口
 */

@Api(value = "人员离职接口")
@RestController
@RequestMapping("/api")
public class CmfHrmsFileLizhiController {

    @Autowired
    private ICmfHrmsFileLizhiService cmfHrmsFileLizhiService;

    /**
     * 获取人员离职详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取人员离职详情失败")
    @ApiOperation(value = "人员离职详情", notes = "按ID获取人员离职详情")
    @GetMapping(value = "/hr/filelizhi/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfHrmsFileLizhiService.selectCmfHrmsFileLizhiById(id), HttpStatus.OK);
    }

    /**
     * 获取人员离职列表
     * uniapp端调用
     *
     * @param cmfHrmsFileLizhi
     * @return
     */
    @ApiResponse(code = 400, message = "获取人员离职列表失败")
    @ApiOperation(value = "人员离职列表", notes = "获取人员离职列表")
    @GetMapping(value = "/hr/filelizhi/info/")
    public ResponseEntity<Object> info(CmfHrmsFileLizhi cmfHrmsFileLizhi) throws IOException{
        return new ResponseEntity<>(cmfHrmsFileLizhiService.selectCmfHrmsFileLizhiList(cmfHrmsFileLizhi), HttpStatus.OK);
    }
}