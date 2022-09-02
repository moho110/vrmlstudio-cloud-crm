package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfHrmsTransferTypeService;
import com.vrcrm.hr.domain.CmfHrmsTransferType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 转职类型接口
 */

@Api(value = "转职类型接口")
@RestController
@RequestMapping("/api")
public class CmfHrmsTransferTypeController {

    @Autowired
    private ICmfHrmsTransferTypeService cmfHrmsTransferTypeService;

    /**
     * 获取固定资产情详
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取转职类型详情失败")
    @ApiOperation(value = "转职类型详情", notes = "按ID获取转职类型详情")
    @GetMapping(value = "/hr/transfertype/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfHrmsTransferTypeService.selectCmfHrmsTransferTypeById(id), HttpStatus.OK);
    }

    /**
     * 获取转职类型列表
     * uniapp端调用
     *
     * @param cmfHrmsTransferType
     * @return
     */
    @ApiResponse(code = 400, message = "获取转职类型列表失败")
    @ApiOperation(value = "转职类型列表", notes = "获取转职类型列表")
    @GetMapping(value = "/hr/transfertype/info/")
    public ResponseEntity<Object> info(CmfHrmsTransferType cmfHrmsTransferType) throws IOException{
        return new ResponseEntity<>(cmfHrmsTransferTypeService.selectCmfHrmsTransferTypeList(cmfHrmsTransferType), HttpStatus.OK);
    }
}