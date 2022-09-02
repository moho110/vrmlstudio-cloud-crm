package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfEduBooleanService;
import com.vrcrm.hr.domain.CmfEduBoolean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 是否教育接口
 */

@Api(value = "是否教育接口")
@RestController
@RequestMapping("/api")
public class CmfEduBooleanController {

    @Autowired
    private ICmfEduBooleanService cmfEduBooleanService;

    /**
     * 获取固定资产情详
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取是否教育详情失败")
    @ApiOperation(value = "是否教育详情", notes = "按ID获取是否教育详情")
    @GetMapping(value = "/hr/eduBoolean/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfEduBooleanService.selectCmfEduBooleanById(id), HttpStatus.OK);
    }

    /**
     * 获取是否教育列表
     * uniapp端调用
     *
     * @param cmfEduBoolean
     * @return
     */
    @ApiResponse(code = 400, message = "获取是否教育列表失败")
    @ApiOperation(value = "是否教育列表", notes = "获取是否教育列表")
    @GetMapping(value = "/hr/eduBoolean/info/")
    public ResponseEntity<Object> info(CmfEduBoolean cmfEduBoolean) throws IOException{
        return new ResponseEntity<>(cmfEduBooleanService.selectCmfEduBooleanList(cmfEduBoolean), HttpStatus.OK);
    }
}