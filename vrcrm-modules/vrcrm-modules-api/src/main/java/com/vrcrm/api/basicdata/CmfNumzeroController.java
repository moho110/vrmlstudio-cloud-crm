package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfNumzeroService;
import com.vrcrm.basicdata.domain.CmfNumzero;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 零号接口
 */

@Api(value = "零号接口")
@RestController
@RequestMapping("/api")
public class CmfNumzeroController {

    @Autowired
    private ICmfNumzeroService cmfNumzeroService;

    /**
     * 获取零号详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取零号详情失败")
    @ApiOperation(value = "零号详情", notes = "按ID获取零号详情")
    @GetMapping(value = "/basicdata/numzero/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfNumzeroService.selectCmfNumzeroById(id), HttpStatus.OK);
    }

    /**
     * 获取零号列表
     * uniapp端调用
     *
     * @param cmfNumzero
     * @return
     */
    @ApiResponse(code = 400, message = "获取零号列表失败")
    @ApiOperation(value = "零号列表", notes = "获取零号列表")
    @GetMapping(value = "/basicdata/numzero/info/")
    public ResponseEntity<Object> info(CmfNumzero cmfNumzero) throws IOException{
        return new ResponseEntity<>(cmfNumzeroService.selectCmfNumzeroList(cmfNumzero), HttpStatus.OK);
    }
}