package com.vrcrm.api.mytable;

import com.vrcrm.mytable.service.ICmfCalendarService;
import com.vrcrm.mytable.domain.CmfCalendar;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 日程安排接口
 */

@Api(value = "日程安排接口")
@RestController
@RequestMapping("/api")
public class CmfCalendarController {

    @Autowired
    private ICmfCalendarService cmfCalendarService;

    /**
     * 获取日程安排详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取日程安排详情失败")
    @ApiOperation(value = "日程安排详情", notes = "按ID获取日程安排详情")
    @GetMapping(value = "/mytable/calendar/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Long id) throws IOException {
        return new ResponseEntity<>(cmfCalendarService.selectCmfCalendarById(id), HttpStatus.OK);
    }

    /**
     * 获取日程安排列表
     * uniapp端调用
     *
     * @param cmfCalendar
     * @return
     */
    @ApiResponse(code = 400, message = "获取日程安排列表失败")
    @ApiOperation(value = "日程安排列表", notes = "获取日程安排列表")
    @GetMapping(value = "/mytable/calendar/info/")
    public ResponseEntity<Object> info(CmfCalendar cmfCalendar) throws IOException{
        return new ResponseEntity<>(cmfCalendarService.selectCmfCalendarList(cmfCalendar), HttpStatus.OK);
    }
}