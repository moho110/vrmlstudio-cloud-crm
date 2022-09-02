package com.vrcrm.basicdata.mapper;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfCrmDictServicetype;

/**
 * 服务类型Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfCrmDictServicetypeMapper 
{
    /**
     * 查询服务类型
     * 
     * @param id 服务类型主键
     * @return 服务类型
     */
    public CmfCrmDictServicetype selectCmfCrmDictServicetypeById(Integer id);

    /**
     * 查询服务类型列表
     * 
     * @param cmfCrmDictServicetype 服务类型
     * @return 服务类型集合
     */
    public List<CmfCrmDictServicetype> selectCmfCrmDictServicetypeList(CmfCrmDictServicetype cmfCrmDictServicetype);

    /**
     * 新增服务类型
     * 
     * @param cmfCrmDictServicetype 服务类型
     * @return 结果
     */
    public int insertCmfCrmDictServicetype(CmfCrmDictServicetype cmfCrmDictServicetype);

    /**
     * 修改服务类型
     * 
     * @param cmfCrmDictServicetype 服务类型
     * @return 结果
     */
    public int updateCmfCrmDictServicetype(CmfCrmDictServicetype cmfCrmDictServicetype);

    /**
     * 删除服务类型
     * 
     * @param id 服务类型主键
     * @return 结果
     */
    public int deleteCmfCrmDictServicetypeById(Integer id);

    /**
     * 批量删除服务类型
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfCrmDictServicetypeByIds(Integer[] ids);
}
