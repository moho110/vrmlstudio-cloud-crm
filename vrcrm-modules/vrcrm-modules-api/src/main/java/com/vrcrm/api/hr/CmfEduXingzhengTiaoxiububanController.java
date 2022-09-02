package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfEduXingzhengTiaoxiububanService;
import com.vrcrm.hr.domain.CmfEduXingzhengTiaoxiububan;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 行政调休补班接口
 */

@Api(value = "行政调休补班接口")
@RestController
@RequestMapping("/api")
public class CmfEduXingzhengTiaoxiububanController {

    @Autowired
    private ICmfEduXingzhengTiaoxiububanService cmfEduXingzhengTiaoxiububanService;

    /**
     * 获取行政调休补班详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取行政调休补班详情失败")
    @ApiOperation(value = "行政调休补班详情", notes = "按ID获取行政调休补班详情")
    @GetMapping(value = "/hr/tiaoxiububan/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfEduXingzhengTiaoxiububanService.selectCmfEduXingzhengTiaoxiububanById(id), HttpStatus.OK);
    }

    /**
     * 获取行政调休补班列表
     * uniapp端调用
     *
     * @param cmfEduXingzhengTiaoxiububan
     * @return
     */
    @ApiResponse(code = 400, message = "获取行政调休补班列表失败")
    @ApiOperation(value = "行政调休补班列表", notes = "获取行政调休补班列表")
    @GetMapping(value = "/hr/tiaoxiububan/info/")
    public ResponseEntity<Object> info(CmfEduXingzhengTiaoxiububan cmfEduXingzhengTiaoxiububan) throws IOException{
        return new ResponseEntity<>(cmfEduXingzhengTiaoxiububanService.selectCmfEduXingzhengTiaoxiububanList(cmfEduXingzhengTiaoxiububan), HttpStatus.OK);
    }
}