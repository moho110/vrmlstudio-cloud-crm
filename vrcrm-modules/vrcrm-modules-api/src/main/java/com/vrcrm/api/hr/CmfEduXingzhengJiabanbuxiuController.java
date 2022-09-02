package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfEduXingzhengJiabanbuxiuService;
import com.vrcrm.hr.domain.CmfEduXingzhengJiabanbuxiu;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 行政加班补休接口
 */

@Api(value = "行政加班补休接口")
@RestController
@RequestMapping("/api")
public class CmfEduXingzhengJiabanbuxiuController {

    @Autowired
    private ICmfEduXingzhengJiabanbuxiuService cmfEduXingzhengJiabanbuxiuService;

    /**
     * 获取行政加班补休详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取行政加班补休详情失败")
    @ApiOperation(value = "行政加班补休详情", notes = "按ID获取行政加班补休详情")
    @GetMapping(value = "/hr/jiabanbuxiu/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfEduXingzhengJiabanbuxiuService.selectCmfEduXingzhengJiabanbuxiuById(id), HttpStatus.OK);
    }

    /**
     * 获取行政加班补休列表
     * uniapp端调用
     *
     * @param cmfEduXingzhengJiabanbuxiu
     * @return
     */
    @ApiResponse(code = 400, message = "获取行政加班补休列表失败")
    @ApiOperation(value = "行政加班补休列表", notes = "获取行政加班补休列表")
    @GetMapping(value = "/hr/jiabanbuxiu/info/")
    public ResponseEntity<Object> info(CmfEduXingzhengJiabanbuxiu cmfEduXingzhengJiabanbuxiu) throws IOException{
        return new ResponseEntity<>(cmfEduXingzhengJiabanbuxiuService.selectCmfEduXingzhengJiabanbuxiuList(cmfEduXingzhengJiabanbuxiu), HttpStatus.OK);
    }
}