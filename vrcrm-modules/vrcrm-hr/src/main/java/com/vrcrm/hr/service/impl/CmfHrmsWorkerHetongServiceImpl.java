package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfHrmsWorkerHetongMapper;
import com.vrcrm.hr.domain.CmfHrmsWorkerHetong;
import com.vrcrm.hr.service.ICmfHrmsWorkerHetongService;

/**
 * 工作人员合同Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfHrmsWorkerHetongServiceImpl implements ICmfHrmsWorkerHetongService 
{
    @Autowired
    private CmfHrmsWorkerHetongMapper cmfHrmsWorkerHetongMapper;

    /**
     * 查询工作人员合同
     * 
     * @param id 工作人员合同主键
     * @return 工作人员合同
     */
    @Override
    public CmfHrmsWorkerHetong selectCmfHrmsWorkerHetongById(Integer id)
    {
        return cmfHrmsWorkerHetongMapper.selectCmfHrmsWorkerHetongById(id);
    }

    /**
     * 查询工作人员合同列表
     * 
     * @param cmfHrmsWorkerHetong 工作人员合同
     * @return 工作人员合同
     */
    @Override
    public List<CmfHrmsWorkerHetong> selectCmfHrmsWorkerHetongList(CmfHrmsWorkerHetong cmfHrmsWorkerHetong)
    {
        return cmfHrmsWorkerHetongMapper.selectCmfHrmsWorkerHetongList(cmfHrmsWorkerHetong);
    }

    /**
     * 新增工作人员合同
     * 
     * @param cmfHrmsWorkerHetong 工作人员合同
     * @return 结果
     */
    @Override
    public int insertCmfHrmsWorkerHetong(CmfHrmsWorkerHetong cmfHrmsWorkerHetong)
    {
        return cmfHrmsWorkerHetongMapper.insertCmfHrmsWorkerHetong(cmfHrmsWorkerHetong);
    }

    /**
     * 修改工作人员合同
     * 
     * @param cmfHrmsWorkerHetong 工作人员合同
     * @return 结果
     */
    @Override
    public int updateCmfHrmsWorkerHetong(CmfHrmsWorkerHetong cmfHrmsWorkerHetong)
    {
        return cmfHrmsWorkerHetongMapper.updateCmfHrmsWorkerHetong(cmfHrmsWorkerHetong);
    }

    /**
     * 批量删除工作人员合同
     * 
     * @param ids 需要删除的工作人员合同主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsWorkerHetongByIds(Integer[] ids)
    {
        return cmfHrmsWorkerHetongMapper.deleteCmfHrmsWorkerHetongByIds(ids);
    }

    /**
     * 删除工作人员合同信息
     * 
     * @param id 工作人员合同主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsWorkerHetongById(Integer id)
    {
        return cmfHrmsWorkerHetongMapper.deleteCmfHrmsWorkerHetongById(id);
    }
}
