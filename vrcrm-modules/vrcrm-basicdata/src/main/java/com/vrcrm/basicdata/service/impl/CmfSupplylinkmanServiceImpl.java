package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfSupplylinkmanMapper;
import com.vrcrm.basicdata.domain.CmfSupplylinkman;
import com.vrcrm.basicdata.service.ICmfSupplylinkmanService;

/**
 * 供应商联系人Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfSupplylinkmanServiceImpl implements ICmfSupplylinkmanService 
{
    @Autowired
    private CmfSupplylinkmanMapper cmfSupplylinkmanMapper;

    /**
     * 查询供应商联系人
     * 
     * @param id 供应商联系人主键
     * @return 供应商联系人
     */
    @Override
    public CmfSupplylinkman selectCmfSupplylinkmanById(Integer id)
    {
        return cmfSupplylinkmanMapper.selectCmfSupplylinkmanById(id);
    }

    /**
     * 查询供应商联系人列表
     * 
     * @param cmfSupplylinkman 供应商联系人
     * @return 供应商联系人
     */
    @Override
    public List<CmfSupplylinkman> selectCmfSupplylinkmanList(CmfSupplylinkman cmfSupplylinkman)
    {
        return cmfSupplylinkmanMapper.selectCmfSupplylinkmanList(cmfSupplylinkman);
    }

    /**
     * 新增供应商联系人
     * 
     * @param cmfSupplylinkman 供应商联系人
     * @return 结果
     */
    @Override
    public int insertCmfSupplylinkman(CmfSupplylinkman cmfSupplylinkman)
    {
        return cmfSupplylinkmanMapper.insertCmfSupplylinkman(cmfSupplylinkman);
    }

    /**
     * 修改供应商联系人
     * 
     * @param cmfSupplylinkman 供应商联系人
     * @return 结果
     */
    @Override
    public int updateCmfSupplylinkman(CmfSupplylinkman cmfSupplylinkman)
    {
        return cmfSupplylinkmanMapper.updateCmfSupplylinkman(cmfSupplylinkman);
    }

    /**
     * 批量删除供应商联系人
     * 
     * @param ids 需要删除的供应商联系人主键
     * @return 结果
     */
    @Override
    public int deleteCmfSupplylinkmanByIds(Integer[] ids)
    {
        return cmfSupplylinkmanMapper.deleteCmfSupplylinkmanByIds(ids);
    }

    /**
     * 删除供应商联系人信息
     * 
     * @param id 供应商联系人主键
     * @return 结果
     */
    @Override
    public int deleteCmfSupplylinkmanById(Integer id)
    {
        return cmfSupplylinkmanMapper.deleteCmfSupplylinkmanById(id);
    }
}
