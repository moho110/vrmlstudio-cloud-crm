package com.vrcrm.api.mytable;

import com.vrcrm.mytable.service.ICmfCallchuliService;
import com.vrcrm.mytable.domain.CmfCallchuli;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 来电处理接口
 */

@Api(value = "来电处理接口")
@RestController
@RequestMapping("/api")
public class CmfCallchuliController {

    @Autowired
    private ICmfCallchuliService cmfCallchuliService;

    /**
     * 获取来电处理
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取来电处理详情失败")
    @ApiOperation(value = "来电处理详情", notes = "按ID获取来电处理详情")
    @GetMapping(value = "/mytable/callchuli/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCallchuliService.selectCmfCallchuliById(id), HttpStatus.OK);
    }

    /**
     * 获取来电处理列表
     * uniapp端调用
     *
     * @param cmfCallchuli
     * @return
     */
    @ApiResponse(code = 400, message = "获取来电处理列表失败")
    @ApiOperation(value = "来电处理列表", notes = "获取来电处理列表")
    @GetMapping(value = "/mytable/callchuli/info/")
    public ResponseEntity<Object> info(CmfCallchuli cmfCallchuli) throws IOException{
        return new ResponseEntity<>(cmfCallchuliService.selectCmfCallchuliList(cmfCallchuli), HttpStatus.OK);
    }
}