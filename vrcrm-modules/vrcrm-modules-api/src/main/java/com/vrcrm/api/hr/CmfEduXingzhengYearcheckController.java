package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfEduXingzhengYearcheckService;
import com.vrcrm.hr.domain.CmfEduXingzhengYearcheck;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 行政人员年度考核量化表接口
 */

@Api(value = "行政人员年度考核量化表接口")
@RestController
@RequestMapping("/api")
public class CmfEduXingzhengYearcheckController {

    @Autowired
    private ICmfEduXingzhengYearcheckService cmfEduXingzhengYearcheckService;

    /**
     * 获取行政人员年度考核量化表详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取行政人员年度考核量化表详情失败")
    @ApiOperation(value = "行政人员年度考核量化表详情", notes = "按ID获取行政人员年度考核量化表详情")
    @GetMapping(value = "/hr/yearcheck/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfEduXingzhengYearcheckService.selectCmfEduXingzhengYearcheckById(id), HttpStatus.OK);
    }

    /**
     * 获取行政人员年度考核量化表列表
     * uniapp端调用
     *
     * @param cmfEduXingzhengYearcheck
     * @return
     */
    @ApiResponse(code = 400, message = "获取行政人员年度考核量化表列表失败")
    @ApiOperation(value = "行政人员年度考核量化表列表", notes = "获取行政人员年度考核量化表列表")
    @GetMapping(value = "/hr/yearcheck/info/")
    public ResponseEntity<Object> info(CmfEduXingzhengYearcheck cmfEduXingzhengYearcheck) throws IOException{
        return new ResponseEntity<>(cmfEduXingzhengYearcheckService.selectCmfEduXingzhengYearcheckList(cmfEduXingzhengYearcheck), HttpStatus.OK);
    }
}