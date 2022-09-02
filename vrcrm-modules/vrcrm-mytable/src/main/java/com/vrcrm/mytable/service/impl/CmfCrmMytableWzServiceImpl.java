package com.vrcrm.mytable.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.mytable.mapper.CmfCrmMytableWzMapper;
import com.vrcrm.mytable.domain.CmfCrmMytableWz;
import com.vrcrm.mytable.service.ICmfCrmMytableWzService;

/**
 * 桌面显示位置表Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfCrmMytableWzServiceImpl implements ICmfCrmMytableWzService 
{
    @Autowired
    private CmfCrmMytableWzMapper cmfCrmMytableWzMapper;

    /**
     * 查询桌面显示位置表
     * 
     * @param id 桌面显示位置表主键
     * @return 桌面显示位置表
     */
    @Override
    public CmfCrmMytableWz selectCmfCrmMytableWzById(Integer id)
    {
        return cmfCrmMytableWzMapper.selectCmfCrmMytableWzById(id);
    }

    /**
     * 查询桌面显示位置表列表
     * 
     * @param cmfCrmMytableWz 桌面显示位置表
     * @return 桌面显示位置表
     */
    @Override
    public List<CmfCrmMytableWz> selectCmfCrmMytableWzList(CmfCrmMytableWz cmfCrmMytableWz)
    {
        return cmfCrmMytableWzMapper.selectCmfCrmMytableWzList(cmfCrmMytableWz);
    }

    /**
     * 新增桌面显示位置表
     * 
     * @param cmfCrmMytableWz 桌面显示位置表
     * @return 结果
     */
    @Override
    public int insertCmfCrmMytableWz(CmfCrmMytableWz cmfCrmMytableWz)
    {
        return cmfCrmMytableWzMapper.insertCmfCrmMytableWz(cmfCrmMytableWz);
    }

    /**
     * 修改桌面显示位置表
     * 
     * @param cmfCrmMytableWz 桌面显示位置表
     * @return 结果
     */
    @Override
    public int updateCmfCrmMytableWz(CmfCrmMytableWz cmfCrmMytableWz)
    {
        return cmfCrmMytableWzMapper.updateCmfCrmMytableWz(cmfCrmMytableWz);
    }

    /**
     * 批量删除桌面显示位置表
     * 
     * @param ids 需要删除的桌面显示位置表主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmMytableWzByIds(Integer[] ids)
    {
        return cmfCrmMytableWzMapper.deleteCmfCrmMytableWzByIds(ids);
    }

    /**
     * 删除桌面显示位置表信息
     * 
     * @param id 桌面显示位置表主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmMytableWzById(Integer id)
    {
        return cmfCrmMytableWzMapper.deleteCmfCrmMytableWzById(id);
    }
}
