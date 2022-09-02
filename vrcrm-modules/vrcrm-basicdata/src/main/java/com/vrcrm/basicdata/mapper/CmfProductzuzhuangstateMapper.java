package com.vrcrm.basicdata.mapper;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfProductzuzhuangstate;

/**
 * 产品组装状态Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfProductzuzhuangstateMapper 
{
    /**
     * 查询产品组装状态
     * 
     * @param id 产品组装状态主键
     * @return 产品组装状态
     */
    public CmfProductzuzhuangstate selectCmfProductzuzhuangstateById(Integer id);

    /**
     * 查询产品组装状态列表
     * 
     * @param cmfProductzuzhuangstate 产品组装状态
     * @return 产品组装状态集合
     */
    public List<CmfProductzuzhuangstate> selectCmfProductzuzhuangstateList(CmfProductzuzhuangstate cmfProductzuzhuangstate);

    /**
     * 新增产品组装状态
     * 
     * @param cmfProductzuzhuangstate 产品组装状态
     * @return 结果
     */
    public int insertCmfProductzuzhuangstate(CmfProductzuzhuangstate cmfProductzuzhuangstate);

    /**
     * 修改产品组装状态
     * 
     * @param cmfProductzuzhuangstate 产品组装状态
     * @return 结果
     */
    public int updateCmfProductzuzhuangstate(CmfProductzuzhuangstate cmfProductzuzhuangstate);

    /**
     * 删除产品组装状态
     * 
     * @param id 产品组装状态主键
     * @return 结果
     */
    public int deleteCmfProductzuzhuangstateById(Integer id);

    /**
     * 批量删除产品组装状态
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfProductzuzhuangstateByIds(Integer[] ids);
}
