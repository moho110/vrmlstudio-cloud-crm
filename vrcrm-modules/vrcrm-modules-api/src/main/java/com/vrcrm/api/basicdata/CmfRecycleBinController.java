package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfRecycleBinService;
import com.vrcrm.basicdata.domain.CmfRecycleBin;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 回收站接口
 */

@Api(value = "回收站接口")
@RestController
@RequestMapping("/api")
public class CmfRecycleBinController {

    @Autowired
    private ICmfRecycleBinService cmfRecycleBinService;

    /**
     * 获取回收站详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取回收站详情失败")
    @ApiOperation(value = "回收站详情", notes = "按ID获取回收站详情")
    @GetMapping(value = "/basicdata/recyclebin/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfRecycleBinService.selectCmfRecycleBinById(id), HttpStatus.OK);
    }

    /**
     * 获取回收站列表
     * uniapp端调用
     *
     * @param cmfRecycleBin
     * @return
     */
    @ApiResponse(code = 400, message = "获取回收站列表失败")
    @ApiOperation(value = "回收站列表", notes = "获取回收站列表")
    @GetMapping(value = "/basicdata/recyclebin/info/")
    public ResponseEntity<Object> info(CmfRecycleBin cmfRecycleBin) throws IOException{
        return new ResponseEntity<>(cmfRecycleBinService.selectCmfRecycleBinList(cmfRecycleBin), HttpStatus.OK);
    }
}