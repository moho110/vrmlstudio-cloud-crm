package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfCrmJieduanMapper;
import com.vrcrm.basicdata.domain.CmfCrmJieduan;
import com.vrcrm.basicdata.service.ICmfCrmJieduanService;

/**
 * 阶段Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfCrmJieduanServiceImpl implements ICmfCrmJieduanService 
{
    @Autowired
    private CmfCrmJieduanMapper cmfCrmJieduanMapper;

    /**
     * 查询阶段
     * 
     * @param id 阶段主键
     * @return 阶段
     */
    @Override
    public CmfCrmJieduan selectCmfCrmJieduanById(Integer id)
    {
        return cmfCrmJieduanMapper.selectCmfCrmJieduanById(id);
    }

    /**
     * 查询阶段列表
     * 
     * @param cmfCrmJieduan 阶段
     * @return 阶段
     */
    @Override
    public List<CmfCrmJieduan> selectCmfCrmJieduanList(CmfCrmJieduan cmfCrmJieduan)
    {
        return cmfCrmJieduanMapper.selectCmfCrmJieduanList(cmfCrmJieduan);
    }

    /**
     * 新增阶段
     * 
     * @param cmfCrmJieduan 阶段
     * @return 结果
     */
    @Override
    public int insertCmfCrmJieduan(CmfCrmJieduan cmfCrmJieduan)
    {
        return cmfCrmJieduanMapper.insertCmfCrmJieduan(cmfCrmJieduan);
    }

    /**
     * 修改阶段
     * 
     * @param cmfCrmJieduan 阶段
     * @return 结果
     */
    @Override
    public int updateCmfCrmJieduan(CmfCrmJieduan cmfCrmJieduan)
    {
        return cmfCrmJieduanMapper.updateCmfCrmJieduan(cmfCrmJieduan);
    }

    /**
     * 批量删除阶段
     * 
     * @param ids 需要删除的阶段主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmJieduanByIds(Integer[] ids)
    {
        return cmfCrmJieduanMapper.deleteCmfCrmJieduanByIds(ids);
    }

    /**
     * 删除阶段信息
     * 
     * @param id 阶段主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmJieduanById(Integer id)
    {
        return cmfCrmJieduanMapper.deleteCmfCrmJieduanById(id);
    }
}
