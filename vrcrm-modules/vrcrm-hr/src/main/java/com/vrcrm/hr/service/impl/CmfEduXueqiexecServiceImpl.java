package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfEduXueqiexecMapper;
import com.vrcrm.hr.domain.CmfEduXueqiexec;
import com.vrcrm.hr.service.ICmfEduXueqiexecService;

/**
 * 学期执行Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfEduXueqiexecServiceImpl implements ICmfEduXueqiexecService 
{
    @Autowired
    private CmfEduXueqiexecMapper cmfEduXueqiexecMapper;

    /**
     * 查询学期执行
     * 
     * @param id 学期执行主键
     * @return 学期执行
     */
    @Override
    public CmfEduXueqiexec selectCmfEduXueqiexecById(Integer id)
    {
        return cmfEduXueqiexecMapper.selectCmfEduXueqiexecById(id);
    }

    /**
     * 查询学期执行列表
     * 
     * @param cmfEduXueqiexec 学期执行
     * @return 学期执行
     */
    @Override
    public List<CmfEduXueqiexec> selectCmfEduXueqiexecList(CmfEduXueqiexec cmfEduXueqiexec)
    {
        return cmfEduXueqiexecMapper.selectCmfEduXueqiexecList(cmfEduXueqiexec);
    }

    /**
     * 新增学期执行
     * 
     * @param cmfEduXueqiexec 学期执行
     * @return 结果
     */
    @Override
    public int insertCmfEduXueqiexec(CmfEduXueqiexec cmfEduXueqiexec)
    {
        return cmfEduXueqiexecMapper.insertCmfEduXueqiexec(cmfEduXueqiexec);
    }

    /**
     * 修改学期执行
     * 
     * @param cmfEduXueqiexec 学期执行
     * @return 结果
     */
    @Override
    public int updateCmfEduXueqiexec(CmfEduXueqiexec cmfEduXueqiexec)
    {
        return cmfEduXueqiexecMapper.updateCmfEduXueqiexec(cmfEduXueqiexec);
    }

    /**
     * 批量删除学期执行
     * 
     * @param ids 需要删除的学期执行主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduXueqiexecByIds(Integer[] ids)
    {
        return cmfEduXueqiexecMapper.deleteCmfEduXueqiexecByIds(ids);
    }

    /**
     * 删除学期执行信息
     * 
     * @param id 学期执行主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduXueqiexecById(Integer id)
    {
        return cmfEduXueqiexecMapper.deleteCmfEduXueqiexecById(id);
    }
}
