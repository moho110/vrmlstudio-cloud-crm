package com.vrcrm.basicdata.service;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfCmdictDanyuanyongtu;

/**
 * 单元用途Service接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface ICmfCmdictDanyuanyongtuService 
{
    /**
     * 查询单元用途
     * 
     * @param id 单元用途主键
     * @return 单元用途
     */
    public CmfCmdictDanyuanyongtu selectCmfCmdictDanyuanyongtuById(Integer id);

    /**
     * 查询单元用途列表
     * 
     * @param cmfCmdictDanyuanyongtu 单元用途
     * @return 单元用途集合
     */
    public List<CmfCmdictDanyuanyongtu> selectCmfCmdictDanyuanyongtuList(CmfCmdictDanyuanyongtu cmfCmdictDanyuanyongtu);

    /**
     * 新增单元用途
     * 
     * @param cmfCmdictDanyuanyongtu 单元用途
     * @return 结果
     */
    public int insertCmfCmdictDanyuanyongtu(CmfCmdictDanyuanyongtu cmfCmdictDanyuanyongtu);

    /**
     * 修改单元用途
     * 
     * @param cmfCmdictDanyuanyongtu 单元用途
     * @return 结果
     */
    public int updateCmfCmdictDanyuanyongtu(CmfCmdictDanyuanyongtu cmfCmdictDanyuanyongtu);

    /**
     * 批量删除单元用途
     * 
     * @param ids 需要删除的单元用途主键集合
     * @return 结果
     */
    public int deleteCmfCmdictDanyuanyongtuByIds(Integer[] ids);

    /**
     * 删除单元用途信息
     * 
     * @param id 单元用途主键
     * @return 结果
     */
    public int deleteCmfCmdictDanyuanyongtuById(Integer id);
}
