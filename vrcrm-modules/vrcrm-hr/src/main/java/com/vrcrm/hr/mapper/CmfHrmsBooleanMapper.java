package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfHrmsBoolean;

/**
 * 同意与否Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfHrmsBooleanMapper 
{
    /**
     * 查询同意与否
     * 
     * @param id 同意与否主键
     * @return 同意与否
     */
    public CmfHrmsBoolean selectCmfHrmsBooleanById(Integer id);

    /**
     * 查询同意与否列表
     * 
     * @param cmfHrmsBoolean 同意与否
     * @return 同意与否集合
     */
    public List<CmfHrmsBoolean> selectCmfHrmsBooleanList(CmfHrmsBoolean cmfHrmsBoolean);

    /**
     * 新增同意与否
     * 
     * @param cmfHrmsBoolean 同意与否
     * @return 结果
     */
    public int insertCmfHrmsBoolean(CmfHrmsBoolean cmfHrmsBoolean);

    /**
     * 修改同意与否
     * 
     * @param cmfHrmsBoolean 同意与否
     * @return 结果
     */
    public int updateCmfHrmsBoolean(CmfHrmsBoolean cmfHrmsBoolean);

    /**
     * 删除同意与否
     * 
     * @param id 同意与否主键
     * @return 结果
     */
    public int deleteCmfHrmsBooleanById(Integer id);

    /**
     * 批量删除同意与否
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfHrmsBooleanByIds(Integer[] ids);
}
