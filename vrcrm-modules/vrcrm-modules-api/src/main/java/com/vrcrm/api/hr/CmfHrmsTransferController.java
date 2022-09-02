package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfHrmsTransferService;
import com.vrcrm.hr.domain.CmfHrmsTransfer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 转职明细接口
 */

@Api(value = "转职明细接口")
@RestController
@RequestMapping("/api")
public class CmfHrmsTransferController {

    @Autowired
    private ICmfHrmsTransferService cmfHrmsTransferService;

    /**
     * 获取转职明细详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取转职明细详情失败")
    @ApiOperation(value = "转职明细详情", notes = "按ID获取转职明细详情")
    @GetMapping(value = "/hr/transfer/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfHrmsTransferService.selectCmfHrmsTransferById(id), HttpStatus.OK);
    }

    /**
     * 获取转职明细列表
     * uniapp端调用
     *
     * @param cmfHrmsTransfer
     * @return
     */
    @ApiResponse(code = 400, message = "获取转职明细列表失败")
    @ApiOperation(value = "转职明细列表", notes = "获取转职明细列表")
    @GetMapping(value = "/hr/transfer/info/")
    public ResponseEntity<Object> info(CmfHrmsTransfer cmfHrmsTransfer) throws IOException{
        return new ResponseEntity<>(cmfHrmsTransferService.selectCmfHrmsTransferList(cmfHrmsTransfer), HttpStatus.OK);
    }
}