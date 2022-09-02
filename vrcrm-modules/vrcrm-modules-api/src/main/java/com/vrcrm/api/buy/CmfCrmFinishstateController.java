package com.vrcrm.api.buy;

import com.vrcrm.buy.service.ICmfCrmFinishstateService;
import com.vrcrm.buy.domain.CmfCrmFinishstate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 完成状态接口
 */

@Api(value = "完成状态接口")
@RestController
@RequestMapping("/api")
public class CmfCrmFinishstateController {

    @Autowired
    private ICmfCrmFinishstateService cmfCrmFinishstateService;

    /**
     * 获取完成状态详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取完成状态详情失败")
    @ApiOperation(value = "完成状态详情", notes = "按ID获取完成状态详情")
    @GetMapping(value = "/buy/crmfinishstate/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCrmFinishstateService.selectCmfCrmFinishstateById(id), HttpStatus.OK);
    }

    /**
     * 获取完成状态列表
     * uniapp端调用
     *
     * @param cmfCrmFinishstate
     * @return
     */
    @ApiResponse(code = 400, message = "获取完成状态列表失败")
    @ApiOperation(value = "完成状态列表", notes = "获取完成状态列表")
    @GetMapping(value = "/buy/crmfinishstate/info/")
    public ResponseEntity<Object> info(CmfCrmFinishstate cmfCrmFinishstate) throws IOException{
        return new ResponseEntity<>(cmfCrmFinishstateService.selectCmfCrmFinishstateList(cmfCrmFinishstate), HttpStatus.OK);
    }
}