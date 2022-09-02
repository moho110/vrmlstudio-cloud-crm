package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfHrmsExpenseTypeService;
import com.vrcrm.hr.domain.CmfHrmsExpenseType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 费用类型接口
 */

@Api(value = "费用类型接口")
@RestController
@RequestMapping("/api")
public class CmfHrmsExpenseTypeController {

    @Autowired
    private ICmfHrmsExpenseTypeService cmfHrmsExpenseTypeService;

    /**
     * 获取费用类型详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取费用类型详情失败")
    @ApiOperation(value = "费用类型详情", notes = "按ID获取费用类型详情")
    @GetMapping(value = "/hr/expensetype/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfHrmsExpenseTypeService.selectCmfHrmsExpenseTypeById(id), HttpStatus.OK);
    }

    /**
     * 获取费用类型列表
     * uniapp端调用
     *
     * @param cmfHrmsExpenseType
     * @return
     */
    @ApiResponse(code = 400, message = "获取费用类型列表失败")
    @ApiOperation(value = "费用类型列表", notes = "获取费用类型列表")
    @GetMapping(value = "/hr/expensetype/info/")
    public ResponseEntity<Object> info(CmfHrmsExpenseType cmfHrmsExpenseType) throws IOException{
        return new ResponseEntity<>(cmfHrmsExpenseTypeService.selectCmfHrmsExpenseTypeList(cmfHrmsExpenseType), HttpStatus.OK);
    }
}