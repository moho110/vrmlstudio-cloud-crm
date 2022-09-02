package com.vrcrm.api.mytable;

import com.vrcrm.mytable.service.ICmfCommlogService;
import com.vrcrm.mytable.domain.CmfCommlog;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 通用日志接口
 */

@Api(value = "通用日志接口")
@RestController
@RequestMapping("/api")
public class CmfCommlogController {

    @Autowired
    private ICmfCommlogService cmfCommlogService;

    /**
     * 获取通用日志
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取通用日志详情失败")
    @ApiOperation(value = "通用日志详情", notes = "按ID获取通用日志详情")
    @GetMapping(value = "/mytable/commlog/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCommlogService.selectCmfCommlogById(id), HttpStatus.OK);
    }

    /**
     * 获取通用日志列表
     * uniapp端调用
     *
     * @param cmfCommlog
     * @return
     */
    @ApiResponse(code = 400, message = "获取通用日志列表失败")
    @ApiOperation(value = "通用日志列表", notes = "获取通用日志列表")
    @GetMapping(value = "/mytable/commlog/info/")
    public ResponseEntity<Object> info(CmfCommlog cmfCommlog) throws IOException{
        return new ResponseEntity<>(cmfCommlogService.selectCmfCommlogList(cmfCommlog), HttpStatus.OK);
    }
}