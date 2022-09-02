package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfHrmsExpenseService;
import com.vrcrm.hr.domain.CmfHrmsExpense;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 日常费用接口
 */

@Api(value = "日常费用接口")
@RestController
@RequestMapping("/api")
public class CmfHrmsExpenseController {

    @Autowired
    private ICmfHrmsExpenseService cmfHrmsExpenseService;

    /**
     * 获取日常费用详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取日常费用详情失败")
    @ApiOperation(value = "日常费用详情", notes = "按ID获取日常费用详情")
    @GetMapping(value = "/hr/expense/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfHrmsExpenseService.selectCmfHrmsExpenseById(id), HttpStatus.OK);
    }

    /**
     * 获取日常费用列表
     * uniapp端调用
     *
     * @param cmfHrmsExpense
     * @return
     */
    @ApiResponse(code = 400, message = "获取日常费用列表失败")
    @ApiOperation(value = "日常费用列表", notes = "获取日常费用列表")
    @GetMapping(value = "/hr/expense/info/")
    public ResponseEntity<Object> info(CmfHrmsExpense cmfHrmsExpense) throws IOException{
        return new ResponseEntity<>(cmfHrmsExpenseService.selectCmfHrmsExpenseList(cmfHrmsExpense), HttpStatus.OK);
    }
}