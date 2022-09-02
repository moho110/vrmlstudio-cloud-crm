package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfGbMarriageMapper;
import com.vrcrm.political.domain.CmfGbMarriage;
import com.vrcrm.political.service.ICmfGbMarriageService;

/**
 * 婚否Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfGbMarriageServiceImpl implements ICmfGbMarriageService 
{
    @Autowired
    private CmfGbMarriageMapper cmfGbMarriageMapper;

    /**
     * 查询婚否
     * 
     * @param id 婚否主键
     * @return 婚否
     */
    @Override
    public CmfGbMarriage selectCmfGbMarriageById(Integer id)
    {
        return cmfGbMarriageMapper.selectCmfGbMarriageById(id);
    }

    /**
     * 查询婚否列表
     * 
     * @param cmfGbMarriage 婚否
     * @return 婚否
     */
    @Override
    public List<CmfGbMarriage> selectCmfGbMarriageList(CmfGbMarriage cmfGbMarriage)
    {
        return cmfGbMarriageMapper.selectCmfGbMarriageList(cmfGbMarriage);
    }

    /**
     * 新增婚否
     * 
     * @param cmfGbMarriage 婚否
     * @return 结果
     */
    @Override
    public int insertCmfGbMarriage(CmfGbMarriage cmfGbMarriage)
    {
        return cmfGbMarriageMapper.insertCmfGbMarriage(cmfGbMarriage);
    }

    /**
     * 修改婚否
     * 
     * @param cmfGbMarriage 婚否
     * @return 结果
     */
    @Override
    public int updateCmfGbMarriage(CmfGbMarriage cmfGbMarriage)
    {
        return cmfGbMarriageMapper.updateCmfGbMarriage(cmfGbMarriage);
    }

    /**
     * 批量删除婚否
     * 
     * @param ids 需要删除的婚否主键
     * @return 结果
     */
    @Override
    public int deleteCmfGbMarriageByIds(Integer[] ids)
    {
        return cmfGbMarriageMapper.deleteCmfGbMarriageByIds(ids);
    }

    /**
     * 删除婚否信息
     * 
     * @param id 婚否主键
     * @return 结果
     */
    @Override
    public int deleteCmfGbMarriageById(Integer id)
    {
        return cmfGbMarriageMapper.deleteCmfGbMarriageById(id);
    }
}
