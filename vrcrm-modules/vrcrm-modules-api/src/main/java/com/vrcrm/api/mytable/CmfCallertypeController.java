package com.vrcrm.api.mytable;

import com.vrcrm.mytable.service.ICmfCallertypeService;
import com.vrcrm.mytable.domain.CmfCallertype;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 呼叫人类型接口
 */

@Api(value = "呼叫人类型接口")
@RestController
@RequestMapping("/api")
public class CmfCallertypeController {

    @Autowired
    private ICmfCallertypeService cmfCallertypeService;

    /**
     * 获取呼叫人类型
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取呼叫人类型详情失败")
    @ApiOperation(value = "呼叫人类型详情", notes = "按ID获取呼叫人类型详情")
    @GetMapping(value = "/mytable/callertype/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCallertypeService.selectCmfCallertypeById(id), HttpStatus.OK);
    }

    /**
     * 获取呼叫人类型列表
     * uniapp端调用
     *
     * @param cmfCallertype
     * @return
     */
    @ApiResponse(code = 400, message = "获取呼叫人类型列表失败")
    @ApiOperation(value = "呼叫人类型列表", notes = "获取呼叫人类型列表")
    @GetMapping(value = "/mytable/callertype/info/")
    public ResponseEntity<Object> info(CmfCallertype cmfCallertype) throws IOException{
        return new ResponseEntity<>(cmfCallertypeService.selectCmfCallertypeList(cmfCallertype), HttpStatus.OK);
    }
}