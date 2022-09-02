package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfHrmsEducationalexperienceService;
import com.vrcrm.hr.domain.CmfHrmsEducationalexperience;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 教育经历接口
 */

@Api(value = "教育经历接口")
@RestController
@RequestMapping("/api")
public class CmfHrmsEducationalexperienceController {

    @Autowired
    private ICmfHrmsEducationalexperienceService cmfHrmsEducationalexperienceService;

    /**
     * 获取教育经历详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取教育经历详情失败")
    @ApiOperation(value = "教育经历详情", notes = "按ID获取教育经历详情")
    @GetMapping(value = "/hr/educationalexperience/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfHrmsEducationalexperienceService.selectCmfHrmsEducationalexperienceById(id), HttpStatus.OK);
    }

    /**
     * 获取教育经历列表
     * uniapp端调用
     *
     * @param cmfHrmsEducationalexperience
     * @return
     */
    @ApiResponse(code = 400, message = "获取教育经历列表失败")
    @ApiOperation(value = "教育经历列表", notes = "获取教育经历列表")
    @GetMapping(value = "/hr/educationalexperience/info/")
    public ResponseEntity<Object> info(CmfHrmsEducationalexperience cmfHrmsEducationalexperience) throws IOException{
        return new ResponseEntity<>(cmfHrmsEducationalexperienceService.selectCmfHrmsEducationalexperienceList(cmfHrmsEducationalexperience), HttpStatus.OK);
    }
}