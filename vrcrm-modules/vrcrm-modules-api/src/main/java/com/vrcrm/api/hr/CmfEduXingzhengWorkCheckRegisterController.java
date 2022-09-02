package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfEduXingzhengWorkCheckRegisterService;
import com.vrcrm.hr.domain.CmfEduXingzhengWorkCheckRegister;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 行政人员工作考核登记表接口
 */

@Api(value = "行政人员工作考核登记表接口")
@RestController
@RequestMapping("/api")
public class CmfEduXingzhengWorkCheckRegisterController {

    @Autowired
    private ICmfEduXingzhengWorkCheckRegisterService cmfEduXingzhengWorkCheckRegisterService;

    /**
     * 获取行政人员工作考核登记表详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取行政人员工作考核登记表详情失败")
    @ApiOperation(value = "行政人员工作考核登记表详情", notes = "按ID获取行政人员工作考核登记表详情")
    @GetMapping(value = "/hr/workcheckregister/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfEduXingzhengWorkCheckRegisterService.selectCmfEduXingzhengWorkCheckRegisterById(id), HttpStatus.OK);
    }

    /**
     * 获取行政人员工作考核登记表列表
     * uniapp端调用
     *
     * @param cmfEduXingzhengWorkCheckRegister
     * @return
     */
    @ApiResponse(code = 400, message = "获取行政人员工作考核登记表列表失败")
    @ApiOperation(value = "行政人员工作考核登记表列表", notes = "获取行政人员工作考核登记表列表")
    @GetMapping(value = "/hr/workcheckregister/info/")
    public ResponseEntity<Object> info(CmfEduXingzhengWorkCheckRegister cmfEduXingzhengWorkCheckRegister) throws IOException{
        return new ResponseEntity<>(cmfEduXingzhengWorkCheckRegisterService.selectCmfEduXingzhengWorkCheckRegisterList(cmfEduXingzhengWorkCheckRegister), HttpStatus.OK);
    }
}