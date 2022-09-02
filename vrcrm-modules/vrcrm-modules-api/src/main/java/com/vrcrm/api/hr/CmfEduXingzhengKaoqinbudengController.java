package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfEduXingzhengKaoqinbudengService;
import com.vrcrm.hr.domain.CmfEduXingzhengKaoqinbudeng;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 行政考勤补登接口
 */

@Api(value = "行政考勤补登接口")
@RestController
@RequestMapping("/api")
public class CmfEduXingzhengKaoqinbudengController {

    @Autowired
    private ICmfEduXingzhengKaoqinbudengService cmfEduXingzhengKaoqinbudengService;

    /**
     * 获取行政考勤补登详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取行政考勤补登详情失败")
    @ApiOperation(value = "行政考勤补登详情", notes = "按ID获取行政考勤补登详情")
    @GetMapping(value = "/hr/Kaoqinbudeng/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfEduXingzhengKaoqinbudengService.selectCmfEduXingzhengKaoqinbudengById(id), HttpStatus.OK);
    }

    /**
     * 获取行政考勤补登列表
     * uniapp端调用
     *
     * @param cmfEduXingzhengKaoqinbudeng
     * @return
     */
    @ApiResponse(code = 400, message = "获取行政考勤补登列表失败")
    @ApiOperation(value = "行政考勤补登列表", notes = "获取行政考勤补登列表")
    @GetMapping(value = "/hr/Kaoqinbudeng/info/")
    public ResponseEntity<Object> info(CmfEduXingzhengKaoqinbudeng cmfEduXingzhengKaoqinbudeng) throws IOException{
        return new ResponseEntity<>(cmfEduXingzhengKaoqinbudengService.selectCmfEduXingzhengKaoqinbudengList(cmfEduXingzhengKaoqinbudeng), HttpStatus.OK);
    }
}