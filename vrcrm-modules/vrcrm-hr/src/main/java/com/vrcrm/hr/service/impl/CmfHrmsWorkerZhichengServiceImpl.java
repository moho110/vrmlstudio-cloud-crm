package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfHrmsWorkerZhichengMapper;
import com.vrcrm.hr.domain.CmfHrmsWorkerZhicheng;
import com.vrcrm.hr.service.ICmfHrmsWorkerZhichengService;

/**
 * 工作人员职称Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfHrmsWorkerZhichengServiceImpl implements ICmfHrmsWorkerZhichengService 
{
    @Autowired
    private CmfHrmsWorkerZhichengMapper cmfHrmsWorkerZhichengMapper;

    /**
     * 查询工作人员职称
     * 
     * @param id 工作人员职称主键
     * @return 工作人员职称
     */
    @Override
    public CmfHrmsWorkerZhicheng selectCmfHrmsWorkerZhichengById(Integer id)
    {
        return cmfHrmsWorkerZhichengMapper.selectCmfHrmsWorkerZhichengById(id);
    }

    /**
     * 查询工作人员职称列表
     * 
     * @param cmfHrmsWorkerZhicheng 工作人员职称
     * @return 工作人员职称
     */
    @Override
    public List<CmfHrmsWorkerZhicheng> selectCmfHrmsWorkerZhichengList(CmfHrmsWorkerZhicheng cmfHrmsWorkerZhicheng)
    {
        return cmfHrmsWorkerZhichengMapper.selectCmfHrmsWorkerZhichengList(cmfHrmsWorkerZhicheng);
    }

    /**
     * 新增工作人员职称
     * 
     * @param cmfHrmsWorkerZhicheng 工作人员职称
     * @return 结果
     */
    @Override
    public int insertCmfHrmsWorkerZhicheng(CmfHrmsWorkerZhicheng cmfHrmsWorkerZhicheng)
    {
        return cmfHrmsWorkerZhichengMapper.insertCmfHrmsWorkerZhicheng(cmfHrmsWorkerZhicheng);
    }

    /**
     * 修改工作人员职称
     * 
     * @param cmfHrmsWorkerZhicheng 工作人员职称
     * @return 结果
     */
    @Override
    public int updateCmfHrmsWorkerZhicheng(CmfHrmsWorkerZhicheng cmfHrmsWorkerZhicheng)
    {
        return cmfHrmsWorkerZhichengMapper.updateCmfHrmsWorkerZhicheng(cmfHrmsWorkerZhicheng);
    }

    /**
     * 批量删除工作人员职称
     * 
     * @param ids 需要删除的工作人员职称主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsWorkerZhichengByIds(Integer[] ids)
    {
        return cmfHrmsWorkerZhichengMapper.deleteCmfHrmsWorkerZhichengByIds(ids);
    }

    /**
     * 删除工作人员职称信息
     * 
     * @param id 工作人员职称主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsWorkerZhichengById(Integer id)
    {
        return cmfHrmsWorkerZhichengMapper.deleteCmfHrmsWorkerZhichengById(id);
    }
}
