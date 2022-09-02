package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfEduXingzhengGroupService;
import com.vrcrm.hr.domain.CmfEduXingzhengGroup;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 行政分类接口
 */

@Api(value = "行政分类接口")
@RestController
@RequestMapping("/api")
public class CmfEduXingzhengGroupController {

    @Autowired
    private ICmfEduXingzhengGroupService cmfEduXingzhengGroupService;

    /**
     * 获取行政分类详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取行政分类详情失败")
    @ApiOperation(value = "行政分类详情", notes = "按ID获取行政分类详情")
    @GetMapping(value = "/hr/eduxingzhenggroup/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfEduXingzhengGroupService.selectCmfEduXingzhengGroupById(id), HttpStatus.OK);
    }

    /**
     * 获取行政分类列表
     * uniapp端调用
     *
     * @param cmfEduXingzhengGroup
     * @return
     */
    @ApiResponse(code = 400, message = "获取行政分类列表失败")
    @ApiOperation(value = "行政分类列表", notes = "获取行政分类列表")
    @GetMapping(value = "/hr/eduxingzhenggroup/info/")
    public ResponseEntity<Object> info(CmfEduXingzhengGroup cmfEduXingzhengGroup) throws IOException{
        return new ResponseEntity<>(cmfEduXingzhengGroupService.selectCmfEduXingzhengGroupList(cmfEduXingzhengGroup), HttpStatus.OK);
    }
}