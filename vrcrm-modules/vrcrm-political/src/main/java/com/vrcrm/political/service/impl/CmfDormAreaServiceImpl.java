package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfDormAreaMapper;
import com.vrcrm.political.domain.CmfDormArea;
import com.vrcrm.political.service.ICmfDormAreaService;

/**
 * 宿舍区域Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfDormAreaServiceImpl implements ICmfDormAreaService 
{
    @Autowired
    private CmfDormAreaMapper cmfDormAreaMapper;

    /**
     * 查询宿舍区域
     * 
     * @param id 宿舍区域主键
     * @return 宿舍区域
     */
    @Override
    public CmfDormArea selectCmfDormAreaById(Integer id)
    {
        return cmfDormAreaMapper.selectCmfDormAreaById(id);
    }

    /**
     * 查询宿舍区域列表
     * 
     * @param cmfDormArea 宿舍区域
     * @return 宿舍区域
     */
    @Override
    public List<CmfDormArea> selectCmfDormAreaList(CmfDormArea cmfDormArea)
    {
        return cmfDormAreaMapper.selectCmfDormAreaList(cmfDormArea);
    }

    /**
     * 新增宿舍区域
     * 
     * @param cmfDormArea 宿舍区域
     * @return 结果
     */
    @Override
    public int insertCmfDormArea(CmfDormArea cmfDormArea)
    {
        return cmfDormAreaMapper.insertCmfDormArea(cmfDormArea);
    }

    /**
     * 修改宿舍区域
     * 
     * @param cmfDormArea 宿舍区域
     * @return 结果
     */
    @Override
    public int updateCmfDormArea(CmfDormArea cmfDormArea)
    {
        return cmfDormAreaMapper.updateCmfDormArea(cmfDormArea);
    }

    /**
     * 批量删除宿舍区域
     * 
     * @param ids 需要删除的宿舍区域主键
     * @return 结果
     */
    @Override
    public int deleteCmfDormAreaByIds(Integer[] ids)
    {
        return cmfDormAreaMapper.deleteCmfDormAreaByIds(ids);
    }

    /**
     * 删除宿舍区域信息
     * 
     * @param id 宿舍区域主键
     * @return 结果
     */
    @Override
    public int deleteCmfDormAreaById(Integer id)
    {
        return cmfDormAreaMapper.deleteCmfDormAreaById(id);
    }
}
