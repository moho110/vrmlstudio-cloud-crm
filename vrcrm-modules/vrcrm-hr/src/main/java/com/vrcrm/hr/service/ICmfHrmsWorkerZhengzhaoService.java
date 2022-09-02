package com.vrcrm.hr.service;

import java.util.List;
import com.vrcrm.hr.domain.CmfHrmsWorkerZhengzhao;

/**
 * 工作人员证照Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfHrmsWorkerZhengzhaoService 
{
    /**
     * 查询工作人员证照
     * 
     * @param id 工作人员证照主键
     * @return 工作人员证照
     */
    public CmfHrmsWorkerZhengzhao selectCmfHrmsWorkerZhengzhaoById(Integer id);

    /**
     * 查询工作人员证照列表
     * 
     * @param cmfHrmsWorkerZhengzhao 工作人员证照
     * @return 工作人员证照集合
     */
    public List<CmfHrmsWorkerZhengzhao> selectCmfHrmsWorkerZhengzhaoList(CmfHrmsWorkerZhengzhao cmfHrmsWorkerZhengzhao);

    /**
     * 新增工作人员证照
     * 
     * @param cmfHrmsWorkerZhengzhao 工作人员证照
     * @return 结果
     */
    public int insertCmfHrmsWorkerZhengzhao(CmfHrmsWorkerZhengzhao cmfHrmsWorkerZhengzhao);

    /**
     * 修改工作人员证照
     * 
     * @param cmfHrmsWorkerZhengzhao 工作人员证照
     * @return 结果
     */
    public int updateCmfHrmsWorkerZhengzhao(CmfHrmsWorkerZhengzhao cmfHrmsWorkerZhengzhao);

    /**
     * 批量删除工作人员证照
     * 
     * @param ids 需要删除的工作人员证照主键集合
     * @return 结果
     */
    public int deleteCmfHrmsWorkerZhengzhaoByIds(Integer[] ids);

    /**
     * 删除工作人员证照信息
     * 
     * @param id 工作人员证照主键
     * @return 结果
     */
    public int deleteCmfHrmsWorkerZhengzhaoById(Integer id);
}
