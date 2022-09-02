package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfProductcolorMapper;
import com.vrcrm.basicdata.domain.CmfProductcolor;
import com.vrcrm.basicdata.service.ICmfProductcolorService;

/**
 * 产品颜色Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfProductcolorServiceImpl implements ICmfProductcolorService 
{
    @Autowired
    private CmfProductcolorMapper cmfProductcolorMapper;

    /**
     * 查询产品颜色
     * 
     * @param id 产品颜色主键
     * @return 产品颜色
     */
    @Override
    public CmfProductcolor selectCmfProductcolorById(Integer id)
    {
        return cmfProductcolorMapper.selectCmfProductcolorById(id);
    }

    /**
     * 查询产品颜色列表
     * 
     * @param cmfProductcolor 产品颜色
     * @return 产品颜色
     */
    @Override
    public List<CmfProductcolor> selectCmfProductcolorList(CmfProductcolor cmfProductcolor)
    {
        return cmfProductcolorMapper.selectCmfProductcolorList(cmfProductcolor);
    }

    /**
     * 新增产品颜色
     * 
     * @param cmfProductcolor 产品颜色
     * @return 结果
     */
    @Override
    public int insertCmfProductcolor(CmfProductcolor cmfProductcolor)
    {
        return cmfProductcolorMapper.insertCmfProductcolor(cmfProductcolor);
    }

    /**
     * 修改产品颜色
     * 
     * @param cmfProductcolor 产品颜色
     * @return 结果
     */
    @Override
    public int updateCmfProductcolor(CmfProductcolor cmfProductcolor)
    {
        return cmfProductcolorMapper.updateCmfProductcolor(cmfProductcolor);
    }

    /**
     * 批量删除产品颜色
     * 
     * @param ids 需要删除的产品颜色主键
     * @return 结果
     */
    @Override
    public int deleteCmfProductcolorByIds(Integer[] ids)
    {
        return cmfProductcolorMapper.deleteCmfProductcolorByIds(ids);
    }

    /**
     * 删除产品颜色信息
     * 
     * @param id 产品颜色主键
     * @return 结果
     */
    @Override
    public int deleteCmfProductcolorById(Integer id)
    {
        return cmfProductcolorMapper.deleteCmfProductcolorById(id);
    }
}
