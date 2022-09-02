package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfMessageService;
import com.vrcrm.basicdata.domain.CmfMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 消息明细接口
 */

@Api(value = "消息明细接口")
@RestController
@RequestMapping("/api")
public class CmfMessageController {

    @Autowired
    private ICmfMessageService cmfMessageService;

    /**
     * 获取消息明细详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取消息明细详情失败")
    @ApiOperation(value = "消息明细详情", notes = "按ID获取消息明细详情")
    @GetMapping(value = "/basicdata/message/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfMessageService.selectCmfMessageById(id), HttpStatus.OK);
    }

    /**
     * 获取消息明细列表
     * uniapp端调用
     *
     * @param cmfMessage
     * @return
     */
    @ApiResponse(code = 400, message = "获取消息明细列表失败")
    @ApiOperation(value = "消息明细列表", notes = "获取消息明细列表")
    @GetMapping(value = "/basicdata/message/info/")
    public ResponseEntity<Object> info(CmfMessage cmfMessage) throws IOException{
        return new ResponseEntity<>(cmfMessageService.selectCmfMessageList(cmfMessage), HttpStatus.OK);
    }
}