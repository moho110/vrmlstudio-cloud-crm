package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfHrmsRPService;
import com.vrcrm.hr.domain.CmfHrmsRP;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 是否奖惩接口
 */

@Api(value = "是否奖惩接口")
@RestController
@RequestMapping("/api")
public class CmfHrmsRPController {

    @Autowired
    private ICmfHrmsRPService cmfHrmsRPService;

    /**
     * 获取是否奖惩详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取是否奖惩详情失败")
    @ApiOperation(value = "是否奖惩详情", notes = "按ID获取是否奖惩详情")
    @GetMapping(value = "/hr/hrmsrp/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfHrmsRPService.selectCmfHrmsRPById(id), HttpStatus.OK);
    }

    /**
     * 获取是否奖惩列表
     * uniapp端调用
     *
     * @param cmfHrmsRP
     * @return
     */
    @ApiResponse(code = 400, message = "获取是否奖惩列表失败")
    @ApiOperation(value = "是否奖惩列表", notes = "获取是否奖惩列表")
    @GetMapping(value = "/hr/hrmsrp/info/")
    public ResponseEntity<Object> info(CmfHrmsRP cmfHrmsRP) throws IOException{
        return new ResponseEntity<>(cmfHrmsRPService.selectCmfHrmsRPList(cmfHrmsRP), HttpStatus.OK);
    }
}