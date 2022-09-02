package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfHrmsWorkerHetong;

/**
 * 工作人员合同Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfHrmsWorkerHetongMapper 
{
    /**
     * 查询工作人员合同
     * 
     * @param id 工作人员合同主键
     * @return 工作人员合同
     */
    public CmfHrmsWorkerHetong selectCmfHrmsWorkerHetongById(Integer id);

    /**
     * 查询工作人员合同列表
     * 
     * @param cmfHrmsWorkerHetong 工作人员合同
     * @return 工作人员合同集合
     */
    public List<CmfHrmsWorkerHetong> selectCmfHrmsWorkerHetongList(CmfHrmsWorkerHetong cmfHrmsWorkerHetong);

    /**
     * 新增工作人员合同
     * 
     * @param cmfHrmsWorkerHetong 工作人员合同
     * @return 结果
     */
    public int insertCmfHrmsWorkerHetong(CmfHrmsWorkerHetong cmfHrmsWorkerHetong);

    /**
     * 修改工作人员合同
     * 
     * @param cmfHrmsWorkerHetong 工作人员合同
     * @return 结果
     */
    public int updateCmfHrmsWorkerHetong(CmfHrmsWorkerHetong cmfHrmsWorkerHetong);

    /**
     * 删除工作人员合同
     * 
     * @param id 工作人员合同主键
     * @return 结果
     */
    public int deleteCmfHrmsWorkerHetongById(Integer id);

    /**
     * 批量删除工作人员合同
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfHrmsWorkerHetongByIds(Integer[] ids);
}
