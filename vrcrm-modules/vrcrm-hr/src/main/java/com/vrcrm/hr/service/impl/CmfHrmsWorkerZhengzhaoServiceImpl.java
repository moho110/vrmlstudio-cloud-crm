package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfHrmsWorkerZhengzhaoMapper;
import com.vrcrm.hr.domain.CmfHrmsWorkerZhengzhao;
import com.vrcrm.hr.service.ICmfHrmsWorkerZhengzhaoService;

/**
 * 工作人员证照Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfHrmsWorkerZhengzhaoServiceImpl implements ICmfHrmsWorkerZhengzhaoService 
{
    @Autowired
    private CmfHrmsWorkerZhengzhaoMapper cmfHrmsWorkerZhengzhaoMapper;

    /**
     * 查询工作人员证照
     * 
     * @param id 工作人员证照主键
     * @return 工作人员证照
     */
    @Override
    public CmfHrmsWorkerZhengzhao selectCmfHrmsWorkerZhengzhaoById(Integer id)
    {
        return cmfHrmsWorkerZhengzhaoMapper.selectCmfHrmsWorkerZhengzhaoById(id);
    }

    /**
     * 查询工作人员证照列表
     * 
     * @param cmfHrmsWorkerZhengzhao 工作人员证照
     * @return 工作人员证照
     */
    @Override
    public List<CmfHrmsWorkerZhengzhao> selectCmfHrmsWorkerZhengzhaoList(CmfHrmsWorkerZhengzhao cmfHrmsWorkerZhengzhao)
    {
        return cmfHrmsWorkerZhengzhaoMapper.selectCmfHrmsWorkerZhengzhaoList(cmfHrmsWorkerZhengzhao);
    }

    /**
     * 新增工作人员证照
     * 
     * @param cmfHrmsWorkerZhengzhao 工作人员证照
     * @return 结果
     */
    @Override
    public int insertCmfHrmsWorkerZhengzhao(CmfHrmsWorkerZhengzhao cmfHrmsWorkerZhengzhao)
    {
        return cmfHrmsWorkerZhengzhaoMapper.insertCmfHrmsWorkerZhengzhao(cmfHrmsWorkerZhengzhao);
    }

    /**
     * 修改工作人员证照
     * 
     * @param cmfHrmsWorkerZhengzhao 工作人员证照
     * @return 结果
     */
    @Override
    public int updateCmfHrmsWorkerZhengzhao(CmfHrmsWorkerZhengzhao cmfHrmsWorkerZhengzhao)
    {
        return cmfHrmsWorkerZhengzhaoMapper.updateCmfHrmsWorkerZhengzhao(cmfHrmsWorkerZhengzhao);
    }

    /**
     * 批量删除工作人员证照
     * 
     * @param ids 需要删除的工作人员证照主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsWorkerZhengzhaoByIds(Integer[] ids)
    {
        return cmfHrmsWorkerZhengzhaoMapper.deleteCmfHrmsWorkerZhengzhaoByIds(ids);
    }

    /**
     * 删除工作人员证照信息
     * 
     * @param id 工作人员证照主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsWorkerZhengzhaoById(Integer id)
    {
        return cmfHrmsWorkerZhengzhaoMapper.deleteCmfHrmsWorkerZhengzhaoById(id);
    }
}
