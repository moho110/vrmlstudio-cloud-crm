package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfNotifyService;
import com.vrcrm.basicdata.domain.CmfNotify;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 公告通知接口
 */

@Api(value = "公告通知接口")
@RestController
@RequestMapping("/api")
public class CmfNotifyController {

    @Autowired
    private ICmfNotifyService cmfNotifyService;

    /**
     * 获取公告通知详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取公告通知详情失败")
    @ApiOperation(value = "公告通知详情", notes = "按ID获取公告通知详情")
    @GetMapping(value = "/basicdata/notify/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfNotifyService.selectCmfNotifyById(id), HttpStatus.OK);
    }

    /**
     * 获取公告通知列表
     * uniapp端调用
     *
     * @param cmfNotify
     * @return
     */
    @ApiResponse(code = 400, message = "获取公告通知列表失败")
    @ApiOperation(value = "公告通知列表", notes = "获取公告通知列表")
    @GetMapping(value = "/basicdata/notify/info/")
    public ResponseEntity<Object> info(CmfNotify cmfNotify) throws IOException{
        return new ResponseEntity<>(cmfNotifyService.selectCmfNotifyList(cmfNotify), HttpStatus.OK);
    }
}