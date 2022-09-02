package com.vrcrm.api.mytable;

import com.vrcrm.mytable.service.ICmfSmsSendlistService;
import com.vrcrm.mytable.domain.CmfSmsSendlist;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 短信发送清单接口
 */

@Api(value = "短信发送清单接口")
@RestController
@RequestMapping("/api")
public class CmfSmsSendlistController {

    @Autowired
    private ICmfSmsSendlistService cmfSmsSendlistService;

    /**
     * 获取短信发送清单
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取短信发送清单详情失败")
    @ApiOperation(value = "短信发送清单详情", notes = "按ID获取短信发送清单详情")
    @GetMapping(value = "/mytable/smssendlist/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfSmsSendlistService.selectCmfSmsSendlistById(id), HttpStatus.OK);
    }

    /**
     * 获取短信发送清单列表
     * uniapp端调用
     *
     * @param cmfSmsSendlist
     * @return
     */
    @ApiResponse(code = 400, message = "获取短信发送清单列表失败")
    @ApiOperation(value = "短信发送清单列表", notes = "获取短信发送清单列表")
    @GetMapping(value = "/mytable/smssendlist/info/")
    public ResponseEntity<Object> info(CmfSmsSendlist cmfSmsSendlist) throws IOException{
        return new ResponseEntity<>(cmfSmsSendlistService.selectCmfSmsSendlistList(cmfSmsSendlist), HttpStatus.OK);
    }
}