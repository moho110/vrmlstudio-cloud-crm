package com.vrcrm.political.mapper;

import java.util.List;
import com.vrcrm.political.domain.CmfOfficeguihuanstate;

/**
 * 办公用品归还状态Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfOfficeguihuanstateMapper 
{
    /**
     * 查询办公用品归还状态
     * 
     * @param id 办公用品归还状态主键
     * @return 办公用品归还状态
     */
    public CmfOfficeguihuanstate selectCmfOfficeguihuanstateById(Integer id);

    /**
     * 查询办公用品归还状态列表
     * 
     * @param cmfOfficeguihuanstate 办公用品归还状态
     * @return 办公用品归还状态集合
     */
    public List<CmfOfficeguihuanstate> selectCmfOfficeguihuanstateList(CmfOfficeguihuanstate cmfOfficeguihuanstate);

    /**
     * 新增办公用品归还状态
     * 
     * @param cmfOfficeguihuanstate 办公用品归还状态
     * @return 结果
     */
    public int insertCmfOfficeguihuanstate(CmfOfficeguihuanstate cmfOfficeguihuanstate);

    /**
     * 修改办公用品归还状态
     * 
     * @param cmfOfficeguihuanstate 办公用品归还状态
     * @return 结果
     */
    public int updateCmfOfficeguihuanstate(CmfOfficeguihuanstate cmfOfficeguihuanstate);

    /**
     * 删除办公用品归还状态
     * 
     * @param id 办公用品归还状态主键
     * @return 结果
     */
    public int deleteCmfOfficeguihuanstateById(Integer id);

    /**
     * 批量删除办公用品归还状态
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfOfficeguihuanstateByIds(Integer[] ids);
}
