package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfSupplyleverMapper;
import com.vrcrm.basicdata.domain.CmfSupplylever;
import com.vrcrm.basicdata.service.ICmfSupplyleverService;

/**
 * 供应商等级Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfSupplyleverServiceImpl implements ICmfSupplyleverService 
{
    @Autowired
    private CmfSupplyleverMapper cmfSupplyleverMapper;

    /**
     * 查询供应商等级
     * 
     * @param id 供应商等级主键
     * @return 供应商等级
     */
    @Override
    public CmfSupplylever selectCmfSupplyleverById(Integer id)
    {
        return cmfSupplyleverMapper.selectCmfSupplyleverById(id);
    }

    /**
     * 查询供应商等级列表
     * 
     * @param cmfSupplylever 供应商等级
     * @return 供应商等级
     */
    @Override
    public List<CmfSupplylever> selectCmfSupplyleverList(CmfSupplylever cmfSupplylever)
    {
        return cmfSupplyleverMapper.selectCmfSupplyleverList(cmfSupplylever);
    }

    /**
     * 新增供应商等级
     * 
     * @param cmfSupplylever 供应商等级
     * @return 结果
     */
    @Override
    public int insertCmfSupplylever(CmfSupplylever cmfSupplylever)
    {
        return cmfSupplyleverMapper.insertCmfSupplylever(cmfSupplylever);
    }

    /**
     * 修改供应商等级
     * 
     * @param cmfSupplylever 供应商等级
     * @return 结果
     */
    @Override
    public int updateCmfSupplylever(CmfSupplylever cmfSupplylever)
    {
        return cmfSupplyleverMapper.updateCmfSupplylever(cmfSupplylever);
    }

    /**
     * 批量删除供应商等级
     * 
     * @param ids 需要删除的供应商等级主键
     * @return 结果
     */
    @Override
    public int deleteCmfSupplyleverByIds(Integer[] ids)
    {
        return cmfSupplyleverMapper.deleteCmfSupplyleverByIds(ids);
    }

    /**
     * 删除供应商等级信息
     * 
     * @param id 供应商等级主键
     * @return 结果
     */
    @Override
    public int deleteCmfSupplyleverById(Integer id)
    {
        return cmfSupplyleverMapper.deleteCmfSupplyleverById(id);
    }
}
