package com.vrcrm.basicdata.service;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfDictDanyuanzhuangtai;

/**
 * 单元状态Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfDictDanyuanzhuangtaiService 
{
    /**
     * 查询单元状态
     * 
     * @param id 单元状态主键
     * @return 单元状态
     */
    public CmfDictDanyuanzhuangtai selectCmfDictDanyuanzhuangtaiById(Integer id);

    /**
     * 查询单元状态列表
     * 
     * @param cmfDictDanyuanzhuangtai 单元状态
     * @return 单元状态集合
     */
    public List<CmfDictDanyuanzhuangtai> selectCmfDictDanyuanzhuangtaiList(CmfDictDanyuanzhuangtai cmfDictDanyuanzhuangtai);

    /**
     * 新增单元状态
     * 
     * @param cmfDictDanyuanzhuangtai 单元状态
     * @return 结果
     */
    public int insertCmfDictDanyuanzhuangtai(CmfDictDanyuanzhuangtai cmfDictDanyuanzhuangtai);

    /**
     * 修改单元状态
     * 
     * @param cmfDictDanyuanzhuangtai 单元状态
     * @return 结果
     */
    public int updateCmfDictDanyuanzhuangtai(CmfDictDanyuanzhuangtai cmfDictDanyuanzhuangtai);

    /**
     * 批量删除单元状态
     * 
     * @param ids 需要删除的单元状态主键集合
     * @return 结果
     */
    public int deleteCmfDictDanyuanzhuangtaiByIds(Integer[] ids);

    /**
     * 删除单元状态信息
     * 
     * @param id 单元状态主键
     * @return 结果
     */
    public int deleteCmfDictDanyuanzhuangtaiById(Integer id);
}
