package com.vrcrm.api.hr;

import com.vrcrm.system.service.ICmfEduXingzhengKaoqinmingxiService;
import com.vrcrm.system.domain.CmfEduXingzhengKaoqinmingxi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 考勤明细接口
 */

@Api(value = "考勤明细接口")
@RestController
@RequestMapping("/api")
public class CmfEduXingzhengKaoqinmingxiController {

    @Autowired
    private ICmfEduXingzhengKaoqinmingxiService cmfEduXingzhengKaoqinmingxiService;

    /**
     * 获取考勤明细详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取考勤明细详情失败")
    @ApiOperation(value = "考勤明细详情", notes = "按ID获取考勤明细详情")
    @GetMapping(value = "/hr/kaoqinmingxi/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfEduXingzhengKaoqinmingxiService.selectCmfEduXingzhengKaoqinmingxiById(id), HttpStatus.OK);
    }

    /**
     * 获取考勤明细列表
     * uniapp端调用
     *
     * @param cmfEduXingzhengKaoqinmingxi
     * @return
     */
    @ApiResponse(code = 400, message = "获取考勤明细列表失败")
    @ApiOperation(value = "考勤明细列表", notes = "获取考勤明细列表")
    @GetMapping(value = "/hr/kaoqinmingxi/info/")
    public ResponseEntity<Object> info(CmfEduXingzhengKaoqinmingxi cmfEduXingzhengKaoqinmingxi) throws IOException{
        return new ResponseEntity<>(cmfEduXingzhengKaoqinmingxiService.selectCmfEduXingzhengKaoqinmingxiList(cmfEduXingzhengKaoqinmingxi), HttpStatus.OK);
    }
}