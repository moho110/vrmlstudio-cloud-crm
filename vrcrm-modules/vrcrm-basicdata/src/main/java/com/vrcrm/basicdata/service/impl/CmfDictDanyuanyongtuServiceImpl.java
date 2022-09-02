package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfDictDanyuanyongtuMapper;
import com.vrcrm.basicdata.domain.CmfDictDanyuanyongtu;
import com.vrcrm.basicdata.service.ICmfDictDanyuanyongtuService;

/**
 * 单元用途Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfDictDanyuanyongtuServiceImpl implements ICmfDictDanyuanyongtuService 
{
    @Autowired
    private CmfDictDanyuanyongtuMapper cmfDictDanyuanyongtuMapper;

    /**
     * 查询单元用途
     * 
     * @param id 单元用途主键
     * @return 单元用途
     */
    @Override
    public CmfDictDanyuanyongtu selectCmfDictDanyuanyongtuById(Integer id)
    {
        return cmfDictDanyuanyongtuMapper.selectCmfDictDanyuanyongtuById(id);
    }

    /**
     * 查询单元用途列表
     * 
     * @param cmfDictDanyuanyongtu 单元用途
     * @return 单元用途
     */
    @Override
    public List<CmfDictDanyuanyongtu> selectCmfDictDanyuanyongtuList(CmfDictDanyuanyongtu cmfDictDanyuanyongtu)
    {
        return cmfDictDanyuanyongtuMapper.selectCmfDictDanyuanyongtuList(cmfDictDanyuanyongtu);
    }

    /**
     * 新增单元用途
     * 
     * @param cmfDictDanyuanyongtu 单元用途
     * @return 结果
     */
    @Override
    public int insertCmfDictDanyuanyongtu(CmfDictDanyuanyongtu cmfDictDanyuanyongtu)
    {
        return cmfDictDanyuanyongtuMapper.insertCmfDictDanyuanyongtu(cmfDictDanyuanyongtu);
    }

    /**
     * 修改单元用途
     * 
     * @param cmfDictDanyuanyongtu 单元用途
     * @return 结果
     */
    @Override
    public int updateCmfDictDanyuanyongtu(CmfDictDanyuanyongtu cmfDictDanyuanyongtu)
    {
        return cmfDictDanyuanyongtuMapper.updateCmfDictDanyuanyongtu(cmfDictDanyuanyongtu);
    }

    /**
     * 批量删除单元用途
     * 
     * @param ids 需要删除的单元用途主键
     * @return 结果
     */
    @Override
    public int deleteCmfDictDanyuanyongtuByIds(Integer[] ids)
    {
        return cmfDictDanyuanyongtuMapper.deleteCmfDictDanyuanyongtuByIds(ids);
    }

    /**
     * 删除单元用途信息
     * 
     * @param id 单元用途主键
     * @return 结果
     */
    @Override
    public int deleteCmfDictDanyuanyongtuById(Integer id)
    {
        return cmfDictDanyuanyongtuMapper.deleteCmfDictDanyuanyongtuById(id);
    }
}
