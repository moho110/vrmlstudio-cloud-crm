package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfHrmsRPNameService;
import com.vrcrm.hr.domain.CmfHrmsRPName;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 奖惩名称接口
 */

@Api(value = "奖惩名称接口")
@RestController
@RequestMapping("/api")
public class CmfHrmsRPNameController {

    @Autowired
    private ICmfHrmsRPNameService cmfHrmsRPNameService;

    /**
     * 获取奖惩名称详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取奖惩名称详情失败")
    @ApiOperation(value = "奖惩名称详情", notes = "按ID获取奖惩名称详情")
    @GetMapping(value = "/hr/rpname/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfHrmsRPNameService.selectCmfHrmsRPNameById(id), HttpStatus.OK);
    }

    /**
     * 获取奖惩名称列表
     * uniapp端调用
     *
     * @param cmfHrmsRPName
     * @return
     */
    @ApiResponse(code = 400, message = "获取奖惩名称列表失败")
    @ApiOperation(value = "奖惩名称列表", notes = "获取奖惩名称列表")
    @GetMapping(value = "/hr/rpname/info/")
    public ResponseEntity<Object> info(CmfHrmsRPName cmfHrmsRPName) throws IOException{
        return new ResponseEntity<>(cmfHrmsRPNameService.selectCmfHrmsRPNameList(cmfHrmsRPName), HttpStatus.OK);
    }
}