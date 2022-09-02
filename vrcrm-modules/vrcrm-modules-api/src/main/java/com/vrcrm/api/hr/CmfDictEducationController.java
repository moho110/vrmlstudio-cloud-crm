package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfDictEducationService;
import com.vrcrm.hr.domain.CmfDictEducation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 教育明细接口
 */

@Api(value = "教育明细接口")
@RestController
@RequestMapping("/api")
public class CmfDictEducationController {

    @Autowired
    private ICmfDictEducationService cmfDictEducationService;

    /**
     * 获取教育明细详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取教育明细详情失败")
    @ApiOperation(value = "教育明细详情", notes = "按ID获取教育明细详情")
    @GetMapping(value = "/hr/dicteducation/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfDictEducationService.selectCmfDictEducationById(id), HttpStatus.OK);
    }

    /**
     * 获取教育明细列表
     * uniapp端调用
     *
     * @param cmfDictEducation
     * @return
     */
    @ApiResponse(code = 400, message = "获取教育明细列表失败")
    @ApiOperation(value = "教育明细列表", notes = "获取教育明细列表")
    @GetMapping(value = "/hr/dicteducation/info/")
    public ResponseEntity<Object> info(CmfDictEducation cmfDictEducation) throws IOException{
        return new ResponseEntity<>(cmfDictEducationService.selectCmfDictEducationList(cmfDictEducation), HttpStatus.OK);
    }
}