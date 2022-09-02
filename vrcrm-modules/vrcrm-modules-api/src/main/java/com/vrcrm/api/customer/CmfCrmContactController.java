package com.vrcrm.api.customer;

import com.vrcrm.customer.service.ICmfCrmContactService;
import com.vrcrm.customer.domain.CmfCrmContact;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 联系方式接口
 */

@Api(value = "联系方式接口")
@RestController
@RequestMapping("/api")
public class CmfCrmContactController {

    @Autowired
    private ICmfCrmContactService cmfCrmContactService;

    /**
     * 获取联系方式详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取联系方式详情失败")
    @ApiOperation(value = "联系方式详情", notes = "按ID获取联系方式详情")
    @GetMapping(value = "/customer/crmcontact/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCrmContactService.selectCmfCrmContactById(id), HttpStatus.OK);
    }

    /**
     * 获取联系方式列表
     * uniapp端调用
     *
     * @param cmfCrmContact
     * @return
     */
    @ApiResponse(code = 400, message = "获取联系方式列表失败")
    @ApiOperation(value = "联系方式列表", notes = "获取联系方式列表")
    @GetMapping(value = "/customer/crmcontact/info/")
    public ResponseEntity<Object> info(CmfCrmContact cmfCrmContact) throws IOException{
        return new ResponseEntity<>(cmfCrmContactService.selectCmfCrmContactList(cmfCrmContact), HttpStatus.OK);
    }
}