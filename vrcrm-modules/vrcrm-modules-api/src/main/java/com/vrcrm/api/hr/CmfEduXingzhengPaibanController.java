package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfEduXingzhengPaibanService;
import com.vrcrm.hr.domain.CmfEduXingzhengPaiban;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 行政排班接口
 */

@Api(value = "行政排班接口")
@RestController
@RequestMapping("/api")
public class CmfEduXingzhengPaibanController {

    @Autowired
    private ICmfEduXingzhengPaibanService cmfEduXingzhengPaibanService;

    /**
     * 获取行政排班详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取行政排班详情失败")
    @ApiOperation(value = "行政排班详情", notes = "按ID获取行政排班详情")
    @GetMapping(value = "/hr/paiban/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfEduXingzhengPaibanService.selectCmfEduXingzhengPaibanById(id), HttpStatus.OK);
    }

    /**
     * 获取行政排班列表
     * uniapp端调用
     *
     * @param cmfEduXingzhengPaiban
     * @return
     */
    @ApiResponse(code = 400, message = "获取行政排班列表失败")
    @ApiOperation(value = "行政排班列表", notes = "获取行政排班列表")
    @GetMapping(value = "/hr/paiban/info/")
    public ResponseEntity<Object> info(CmfEduXingzhengPaiban cmfEduXingzhengPaiban) throws IOException{
        return new ResponseEntity<>(cmfEduXingzhengPaibanService.selectCmfEduXingzhengPaibanList(cmfEduXingzhengPaiban), HttpStatus.OK);
    }
}