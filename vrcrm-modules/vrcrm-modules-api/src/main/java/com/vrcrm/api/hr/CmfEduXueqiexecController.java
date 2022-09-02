package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfEduXueqiexecService;
import com.vrcrm.hr.domain.CmfEduXueqiexec;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 学期执行接口
 */

@Api(value = "学期执行接口")
@RestController
@RequestMapping("/api")
public class CmfEduXueqiexecController {

    @Autowired
    private ICmfEduXueqiexecService cmfEduXueqiexecService;

    /**
     * 获取学期执行详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取学期执行详情失败")
    @ApiOperation(value = "学期执行详情", notes = "按ID获取学期执行详情")
    @GetMapping(value = "/hr/eduxueqiexec/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfEduXueqiexecService.selectCmfEduXueqiexecById(id), HttpStatus.OK);
    }

    /**
     * 获取学期执行列表
     * uniapp端调用
     *
     * @param cmfEduXueqiexec
     * @return
     */
    @ApiResponse(code = 400, message = "获取学期执行列表失败")
    @ApiOperation(value = "学期执行列表", notes = "获取学期执行列表")
    @GetMapping(value = "/hr/eduxueqiexec/info/")
    public ResponseEntity<Object> info(CmfEduXueqiexec cmfEduXueqiexec) throws IOException{
        return new ResponseEntity<>(cmfEduXueqiexecService.selectCmfEduXueqiexecList(cmfEduXueqiexec), HttpStatus.OK);
    }
}