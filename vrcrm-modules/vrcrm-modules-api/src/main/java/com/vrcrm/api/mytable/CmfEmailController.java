package com.vrcrm.api.mytable;

import com.vrcrm.mytable.service.ICmfEmailService;
import com.vrcrm.mytable.domain.CmfEmail;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 发送邮件接口
 */

@Api(value = "发送邮件接口")
@RestController
@RequestMapping("/api")
public class CmfEmailController {

    @Autowired
    private ICmfEmailService cmfEmailService;

    /**
     * 获取发送邮件
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取发送邮件详情失败")
    @ApiOperation(value = "发送邮件详情", notes = "按ID获取发送邮件详情")
    @GetMapping(value = "/mytable/cmfemail/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfEmailService.selectCmfEmailById(id), HttpStatus.OK);
    }

    /**
     * 获取发送邮件列表
     * uniapp端调用
     *
     * @param cmfEmail
     * @return
     */
    @ApiResponse(code = 400, message = "获取发送邮件列表失败")
    @ApiOperation(value = "发送邮件列表", notes = "获取发送邮件列表")
    @GetMapping(value = "/mytable/cmfemail/info/")
    public ResponseEntity<Object> info(CmfEmail cmfEmail) throws IOException{
        return new ResponseEntity<>(cmfEmailService.selectCmfEmailList(cmfEmail), HttpStatus.OK);
    }
}