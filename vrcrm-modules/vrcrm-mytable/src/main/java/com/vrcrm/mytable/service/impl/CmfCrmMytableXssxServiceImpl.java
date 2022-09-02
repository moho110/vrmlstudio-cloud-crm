package com.vrcrm.mytable.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.mytable.mapper.CmfCrmMytableXssxMapper;
import com.vrcrm.mytable.domain.CmfCrmMytableXssx;
import com.vrcrm.mytable.service.ICmfCrmMytableXssxService;

/**
 * 显示属性Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfCrmMytableXssxServiceImpl implements ICmfCrmMytableXssxService 
{
    @Autowired
    private CmfCrmMytableXssxMapper cmfCrmMytableXssxMapper;

    /**
     * 查询显示属性
     * 
     * @param id 显示属性主键
     * @return 显示属性
     */
    @Override
    public CmfCrmMytableXssx selectCmfCrmMytableXssxById(Integer id)
    {
        return cmfCrmMytableXssxMapper.selectCmfCrmMytableXssxById(id);
    }

    /**
     * 查询显示属性列表
     * 
     * @param cmfCrmMytableXssx 显示属性
     * @return 显示属性
     */
    @Override
    public List<CmfCrmMytableXssx> selectCmfCrmMytableXssxList(CmfCrmMytableXssx cmfCrmMytableXssx)
    {
        return cmfCrmMytableXssxMapper.selectCmfCrmMytableXssxList(cmfCrmMytableXssx);
    }

    /**
     * 新增显示属性
     * 
     * @param cmfCrmMytableXssx 显示属性
     * @return 结果
     */
    @Override
    public int insertCmfCrmMytableXssx(CmfCrmMytableXssx cmfCrmMytableXssx)
    {
        return cmfCrmMytableXssxMapper.insertCmfCrmMytableXssx(cmfCrmMytableXssx);
    }

    /**
     * 修改显示属性
     * 
     * @param cmfCrmMytableXssx 显示属性
     * @return 结果
     */
    @Override
    public int updateCmfCrmMytableXssx(CmfCrmMytableXssx cmfCrmMytableXssx)
    {
        return cmfCrmMytableXssxMapper.updateCmfCrmMytableXssx(cmfCrmMytableXssx);
    }

    /**
     * 批量删除显示属性
     * 
     * @param ids 需要删除的显示属性主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmMytableXssxByIds(Integer[] ids)
    {
        return cmfCrmMytableXssxMapper.deleteCmfCrmMytableXssxByIds(ids);
    }

    /**
     * 删除显示属性信息
     * 
     * @param id 显示属性主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmMytableXssxById(Integer id)
    {
        return cmfCrmMytableXssxMapper.deleteCmfCrmMytableXssxById(id);
    }
}
