package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfHrmsSocialrelation;

/**
 * 社会关系Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfHrmsSocialrelationMapper 
{
    /**
     * 查询社会关系
     * 
     * @param id 社会关系主键
     * @return 社会关系
     */
    public CmfHrmsSocialrelation selectCmfHrmsSocialrelationById(Integer id);

    /**
     * 查询社会关系列表
     * 
     * @param cmfHrmsSocialrelation 社会关系
     * @return 社会关系集合
     */
    public List<CmfHrmsSocialrelation> selectCmfHrmsSocialrelationList(CmfHrmsSocialrelation cmfHrmsSocialrelation);

    /**
     * 新增社会关系
     * 
     * @param cmfHrmsSocialrelation 社会关系
     * @return 结果
     */
    public int insertCmfHrmsSocialrelation(CmfHrmsSocialrelation cmfHrmsSocialrelation);

    /**
     * 修改社会关系
     * 
     * @param cmfHrmsSocialrelation 社会关系
     * @return 结果
     */
    public int updateCmfHrmsSocialrelation(CmfHrmsSocialrelation cmfHrmsSocialrelation);

    /**
     * 删除社会关系
     * 
     * @param id 社会关系主键
     * @return 结果
     */
    public int deleteCmfHrmsSocialrelationById(Integer id);

    /**
     * 批量删除社会关系
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfHrmsSocialrelationByIds(Integer[] ids);
}
