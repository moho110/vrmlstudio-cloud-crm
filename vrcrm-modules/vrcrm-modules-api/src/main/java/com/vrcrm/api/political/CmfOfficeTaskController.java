package com.vrcrm.api.political;

import com.vrcrm.political.service.ICmfOfficeTaskService;
import com.vrcrm.political.domain.CmfOfficeTask;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 帐号操作接口
 */

@Api(value = "帐号操作接口")
@RestController
@RequestMapping("/api")
public class CmfOfficeTaskController {

    @Autowired
    private ICmfOfficeTaskService cmfOfficeTaskService;

    /**
     * 获取固定资产情详
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取帐号操作详情失败")
    @ApiOperation(value = "帐号操作详情", notes = "按ID获取帐号操作详情")
    @GetMapping(value = "/political/officeTask/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfOfficeTaskService.selectCmfOfficeTaskById(id), HttpStatus.OK);
    }

    /**
     * 获取帐号操作列表
     * uniapp端调用
     *
     * @param cmfOfficeTask
     * @return
     */
    @ApiResponse(code = 400, message = "获取帐号操作列表失败")
    @ApiOperation(value = "帐号操作列表", notes = "获取帐号操作列表")
    @GetMapping(value = "/political/officeTask/info/")
    public ResponseEntity<Object> info(CmfOfficeTask cmfOfficeTask) throws IOException{
        return new ResponseEntity<>(cmfOfficeTaskService.selectCmfOfficeTaskList(cmfOfficeTask), HttpStatus.OK);
    }
}