package com.vrcrm.api.mytable;

import com.vrcrm.mytable.service.ICmfCalendarTypeService;
import com.vrcrm.mytable.domain.CmfCalendarType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 日程类型接口
 */

@Api(value = "日程类型接口")
@RestController
@RequestMapping("/api")
public class CmfCalendarTypeController {

    @Autowired
    private ICmfCalendarTypeService cmfCalendarTypeService;

    /**
     * 获取日程类型
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取日程类型详情失败")
    @ApiOperation(value = "日程类型详情", notes = "按ID获取日程类型详情")
    @GetMapping(value = "/mytable/calendartype/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCalendarTypeService.selectCmfCalendarTypeById(id), HttpStatus.OK);
    }

    /**
     * 获取日程类型列表
     * uniapp端调用
     *
     * @param cmfCalendarType
     * @return
     */
    @ApiResponse(code = 400, message = "获取日程类型列表失败")
    @ApiOperation(value = "日程类型列表", notes = "获取日程类型列表")
    @GetMapping(value = "/mytable/calendartype/info/")
    public ResponseEntity<Object> info(CmfCalendarType cmfCalendarType) throws IOException{
        return new ResponseEntity<>(cmfCalendarTypeService.selectCmfCalendarTypeList(cmfCalendarType), HttpStatus.OK);
    }
}