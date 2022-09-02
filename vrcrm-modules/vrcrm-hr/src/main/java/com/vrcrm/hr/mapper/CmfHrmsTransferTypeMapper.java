package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfHrmsTransferType;

/**
 * 转职类型Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfHrmsTransferTypeMapper 
{
    /**
     * 查询转职类型
     * 
     * @param id 转职类型主键
     * @return 转职类型
     */
    public CmfHrmsTransferType selectCmfHrmsTransferTypeById(Integer id);

    /**
     * 查询转职类型列表
     * 
     * @param cmfHrmsTransferType 转职类型
     * @return 转职类型集合
     */
    public List<CmfHrmsTransferType> selectCmfHrmsTransferTypeList(CmfHrmsTransferType cmfHrmsTransferType);

    /**
     * 新增转职类型
     * 
     * @param cmfHrmsTransferType 转职类型
     * @return 结果
     */
    public int insertCmfHrmsTransferType(CmfHrmsTransferType cmfHrmsTransferType);

    /**
     * 修改转职类型
     * 
     * @param cmfHrmsTransferType 转职类型
     * @return 结果
     */
    public int updateCmfHrmsTransferType(CmfHrmsTransferType cmfHrmsTransferType);

    /**
     * 删除转职类型
     * 
     * @param id 转职类型主键
     * @return 结果
     */
    public int deleteCmfHrmsTransferTypeById(Integer id);

    /**
     * 批量删除转职类型
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfHrmsTransferTypeByIds(Integer[] ids);
}
