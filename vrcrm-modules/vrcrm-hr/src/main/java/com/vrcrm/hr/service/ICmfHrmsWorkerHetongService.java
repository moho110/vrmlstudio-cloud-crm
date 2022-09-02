package com.vrcrm.hr.service;

import java.util.List;
import com.vrcrm.hr.domain.CmfHrmsWorkerHetong;

/**
 * 工作人员合同Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfHrmsWorkerHetongService 
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
     * 批量删除工作人员合同
     * 
     * @param ids 需要删除的工作人员合同主键集合
     * @return 结果
     */
    public int deleteCmfHrmsWorkerHetongByIds(Integer[] ids);

    /**
     * 删除工作人员合同信息
     * 
     * @param id 工作人员合同主键
     * @return 结果
     */
    public int deleteCmfHrmsWorkerHetongById(Integer id);
}
