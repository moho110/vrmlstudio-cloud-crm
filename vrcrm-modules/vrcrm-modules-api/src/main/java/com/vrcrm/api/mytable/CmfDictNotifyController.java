package com.vrcrm.api.mytable;

import com.vrcrm.mytable.service.ICmfDictNotifyService;
import com.vrcrm.mytable.domain.CmfDictNotify;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 紧急程度接口
 */

@Api(value = "紧急程度接口")
@RestController
@RequestMapping("/api")
public class CmfDictNotifyController {

    @Autowired
    private ICmfDictNotifyService cmfDictNotifyService;

    /**
     * 获取固定资产情详
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取紧急程度详情失败")
    @ApiOperation(value = "紧急程度详情", notes = "按ID获取紧急程度详情")
    @GetMapping(value = "/mytable/dictnotify/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfDictNotifyService.selectCmfDictNotifyById(id), HttpStatus.OK);
    }

    /**
     * 获取紧急程度列表
     * uniapp端调用
     *
     * @param cmfDictNotify
     * @return
     */
    @ApiResponse(code = 400, message = "获取紧急程度列表失败")
    @ApiOperation(value = "紧急程度列表", notes = "获取紧急程度列表")
    @GetMapping(value = "/mytable/dictnotify/info/")
    public ResponseEntity<Object> info(CmfDictNotify cmfDictNotify) throws IOException{
        return new ResponseEntity<>(cmfDictNotifyService.selectCmfDictNotifyList(cmfDictNotify), HttpStatus.OK);
    }
}