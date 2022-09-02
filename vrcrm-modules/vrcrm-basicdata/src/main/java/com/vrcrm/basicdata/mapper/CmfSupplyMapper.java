package com.vrcrm.basicdata.mapper;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfSupply;

/**
 * 供应商Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfSupplyMapper 
{
    /**
     * 查询供应商
     * 
     * @param id 供应商主键
     * @return 供应商
     */
    public CmfSupply selectCmfSupplyById(Long id);

    /**
     * 查询供应商列表
     * 
     * @param cmfSupply 供应商
     * @return 供应商集合
     */
    public List<CmfSupply> selectCmfSupplyList(CmfSupply cmfSupply);

    /**
     * 新增供应商
     * 
     * @param cmfSupply 供应商
     * @return 结果
     */
    public int insertCmfSupply(CmfSupply cmfSupply);

    /**
     * 修改供应商
     * 
     * @param cmfSupply 供应商
     * @return 结果
     */
    public int updateCmfSupply(CmfSupply cmfSupply);

    /**
     * 删除供应商
     * 
     * @param id 供应商主键
     * @return 结果
     */
    public int deleteCmfSupplyById(Long id);

    /**
     * 批量删除供应商
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfSupplyByIds(Long[] ids);
}
