package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfEduXingzhengTiaobanxianghuService;
import com.vrcrm.hr.domain.CmfEduXingzhengTiaobanxianghu;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 行政调班项目接口
 */

@Api(value = "行政调班项目接口")
@RestController
@RequestMapping("/api")
public class CmfEduXingzhengTiaobanxianghuController {

    @Autowired
    private ICmfEduXingzhengTiaobanxianghuService cmfEduXingzhengTiaobanxianghuService;

    /**
     * 获取行政调班项目详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取行政调班项目详情失败")
    @ApiOperation(value = "行政调班项目详情", notes = "按ID获取行政调班项目详情")
    @GetMapping(value = "/hr/tiaobanxianghu/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfEduXingzhengTiaobanxianghuService.selectCmfEduXingzhengTiaobanxianghuById(id), HttpStatus.OK);
    }

    /**
     * 获取行政调班项目列表
     * uniapp端调用
     *
     * @param cmfEduXingzhengTiaobanxianghu
     * @return
     */
    @ApiResponse(code = 400, message = "获取行政调班项目列表失败")
    @ApiOperation(value = "行政调班项目列表", notes = "获取行政调班项目列表")
    @GetMapping(value = "/hr/tiaobanxianghu/info/")
    public ResponseEntity<Object> info(CmfEduXingzhengTiaobanxianghu cmfEduXingzhengTiaobanxianghu) throws IOException{
        return new ResponseEntity<>(cmfEduXingzhengTiaobanxianghuService.selectCmfEduXingzhengTiaobanxianghuList(cmfEduXingzhengTiaobanxianghu), HttpStatus.OK);
    }
}