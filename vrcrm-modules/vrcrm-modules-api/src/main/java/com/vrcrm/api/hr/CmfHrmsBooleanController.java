package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfHrmsBooleanService;
import com.vrcrm.hr.domain.CmfHrmsBoolean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 同意与否接口
 */

@Api(value = "同意与否接口")
@RestController
@RequestMapping("/api")
public class CmfHrmsBooleanController {

    @Autowired
    private ICmfHrmsBooleanService cmfHrmsBooleanService;

    /**
     * 获取同意与否详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取同意与否详情失败")
    @ApiOperation(value = "同意与否详情", notes = "按ID获取同意与否详情")
    @GetMapping(value = "/hr/boolean/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfHrmsBooleanService.selectCmfHrmsBooleanById(id), HttpStatus.OK);
    }

    /**
     * 获取同意与否列表
     * uniapp端调用
     *
     * @param cmfHrmsBoolean
     * @return
     */
    @ApiResponse(code = 400, message = "获取同意与否列表失败")
    @ApiOperation(value = "同意与否列表", notes = "获取同意与否列表")
    @GetMapping(value = "/hr/boolean/info/")
    public ResponseEntity<Object> info(CmfHrmsBoolean cmfHrmsBoolean) throws IOException{
        return new ResponseEntity<>(cmfHrmsBooleanService.selectCmfHrmsBooleanList(cmfHrmsBoolean), HttpStatus.OK);
    }
}