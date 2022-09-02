package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfEduXingzhengTiaobanService;
import com.vrcrm.hr.domain.CmfEduXingzhengTiaoban;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 行政调班接口
 */

@Api(value = "行政调班接口")
@RestController
@RequestMapping("/api")
public class CmfEduXingzhengTiaobanController {

    @Autowired
    private ICmfEduXingzhengTiaobanService cmfEduXingzhengTiaobanService;

    /**
     * 获取行政调班详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取行政调班详情失败")
    @ApiOperation(value = "行政调班详情", notes = "按ID获取行政调班详情")
    @GetMapping(value = "/hr/tiaoban/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfEduXingzhengTiaobanService.selectCmfEduXingzhengTiaobanById(id), HttpStatus.OK);
    }

    /**
     * 获取行政调班列表
     * uniapp端调用
     *
     * @param cmfEduXingzhengTiaoban
     * @return
     */
    @ApiResponse(code = 400, message = "获取行政调班列表失败")
    @ApiOperation(value = "行政调班列表", notes = "获取行政调班列表")
    @GetMapping(value = "/hr/tiaoban/info/")
    public ResponseEntity<Object> info(CmfEduXingzhengTiaoban cmfEduXingzhengTiaoban) throws IOException{
        return new ResponseEntity<>(cmfEduXingzhengTiaobanService.selectCmfEduXingzhengTiaobanList(cmfEduXingzhengTiaoban), HttpStatus.OK);
    }
}