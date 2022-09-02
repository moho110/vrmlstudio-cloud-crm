package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfHrmsSocialrelationService;
import com.vrcrm.hr.domain.CmfHrmsSocialrelation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 社会关系接口
 */

@Api(value = "社会关系接口")
@RestController
@RequestMapping("/api")
public class CmfHrmsSocialrelationController {

    @Autowired
    private ICmfHrmsSocialrelationService cmfHrmsSocialrelationService;

    /**
     * 获取社会关系详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取社会关系详情失败")
    @ApiOperation(value = "社会关系详情", notes = "按ID获取社会关系详情")
    @GetMapping(value = "/hr/socialrelation/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfHrmsSocialrelationService.selectCmfHrmsSocialrelationById(id), HttpStatus.OK);
    }

    /**
     * 获取社会关系列表
     * uniapp端调用
     *
     * @param cmfHrmsSocialrelation
     * @return
     */
    @ApiResponse(code = 400, message = "获取社会关系列表失败")
    @ApiOperation(value = "社会关系列表", notes = "获取社会关系列表")
    @GetMapping(value = "/hr/socialrelation/info/")
    public ResponseEntity<Object> info(CmfHrmsSocialrelation cmfHrmsSocialrelation) throws IOException{
        return new ResponseEntity<>(cmfHrmsSocialrelationService.selectCmfHrmsSocialrelationList(cmfHrmsSocialrelation), HttpStatus.OK);
    }
}