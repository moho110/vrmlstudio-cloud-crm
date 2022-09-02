package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfCmdictDanyuanyongtuMapper;
import com.vrcrm.basicdata.domain.CmfCmdictDanyuanyongtu;
import com.vrcrm.basicdata.service.ICmfCmdictDanyuanyongtuService;

/**
 * 单元用途Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-14
 */
@Service
public class CmfCmdictDanyuanyongtuServiceImpl implements ICmfCmdictDanyuanyongtuService 
{
    @Autowired
    private CmfCmdictDanyuanyongtuMapper cmfCmdictDanyuanyongtuMapper;

    /**
     * 查询单元用途
     * 
     * @param id 单元用途主键
     * @return 单元用途
     */
    @Override
    public CmfCmdictDanyuanyongtu selectCmfCmdictDanyuanyongtuById(Integer id)
    {
        return cmfCmdictDanyuanyongtuMapper.selectCmfCmdictDanyuanyongtuById(id);
    }

    /**
     * 查询单元用途列表
     * 
     * @param cmfCmdictDanyuanyongtu 单元用途
     * @return 单元用途
     */
    @Override
    public List<CmfCmdictDanyuanyongtu> selectCmfCmdictDanyuanyongtuList(CmfCmdictDanyuanyongtu cmfCmdictDanyuanyongtu)
    {
        return cmfCmdictDanyuanyongtuMapper.selectCmfCmdictDanyuanyongtuList(cmfCmdictDanyuanyongtu);
    }

    /**
     * 新增单元用途
     * 
     * @param cmfCmdictDanyuanyongtu 单元用途
     * @return 结果
     */
    @Override
    public int insertCmfCmdictDanyuanyongtu(CmfCmdictDanyuanyongtu cmfCmdictDanyuanyongtu)
    {
        return cmfCmdictDanyuanyongtuMapper.insertCmfCmdictDanyuanyongtu(cmfCmdictDanyuanyongtu);
    }

    /**
     * 修改单元用途
     * 
     * @param cmfCmdictDanyuanyongtu 单元用途
     * @return 结果
     */
    @Override
    public int updateCmfCmdictDanyuanyongtu(CmfCmdictDanyuanyongtu cmfCmdictDanyuanyongtu)
    {
        return cmfCmdictDanyuanyongtuMapper.updateCmfCmdictDanyuanyongtu(cmfCmdictDanyuanyongtu);
    }

    /**
     * 批量删除单元用途
     * 
     * @param ids 需要删除的单元用途主键
     * @return 结果
     */
    @Override
    public int deleteCmfCmdictDanyuanyongtuByIds(Integer[] ids)
    {
        return cmfCmdictDanyuanyongtuMapper.deleteCmfCmdictDanyuanyongtuByIds(ids);
    }

    /**
     * 删除单元用途信息
     * 
     * @param id 单元用途主键
     * @return 结果
     */
    @Override
    public int deleteCmfCmdictDanyuanyongtuById(Integer id)
    {
        return cmfCmdictDanyuanyongtuMapper.deleteCmfCmdictDanyuanyongtuById(id);
    }
}
