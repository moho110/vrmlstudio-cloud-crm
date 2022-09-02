package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfGbPoliticalMapper;
import com.vrcrm.political.domain.CmfGbPolitical;
import com.vrcrm.political.service.ICmfGbPoliticalService;

/**
 * 政治面貌Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfGbPoliticalServiceImpl implements ICmfGbPoliticalService 
{
    @Autowired
    private CmfGbPoliticalMapper cmfGbPoliticalMapper;

    /**
     * 查询政治面貌
     * 
     * @param id 政治面貌主键
     * @return 政治面貌
     */
    @Override
    public CmfGbPolitical selectCmfGbPoliticalById(Integer id)
    {
        return cmfGbPoliticalMapper.selectCmfGbPoliticalById(id);
    }

    /**
     * 查询政治面貌列表
     * 
     * @param cmfGbPolitical 政治面貌
     * @return 政治面貌
     */
    @Override
    public List<CmfGbPolitical> selectCmfGbPoliticalList(CmfGbPolitical cmfGbPolitical)
    {
        return cmfGbPoliticalMapper.selectCmfGbPoliticalList(cmfGbPolitical);
    }

    /**
     * 新增政治面貌
     * 
     * @param cmfGbPolitical 政治面貌
     * @return 结果
     */
    @Override
    public int insertCmfGbPolitical(CmfGbPolitical cmfGbPolitical)
    {
        return cmfGbPoliticalMapper.insertCmfGbPolitical(cmfGbPolitical);
    }

    /**
     * 修改政治面貌
     * 
     * @param cmfGbPolitical 政治面貌
     * @return 结果
     */
    @Override
    public int updateCmfGbPolitical(CmfGbPolitical cmfGbPolitical)
    {
        return cmfGbPoliticalMapper.updateCmfGbPolitical(cmfGbPolitical);
    }

    /**
     * 批量删除政治面貌
     * 
     * @param ids 需要删除的政治面貌主键
     * @return 结果
     */
    @Override
    public int deleteCmfGbPoliticalByIds(Integer[] ids)
    {
        return cmfGbPoliticalMapper.deleteCmfGbPoliticalByIds(ids);
    }

    /**
     * 删除政治面貌信息
     * 
     * @param id 政治面貌主键
     * @return 结果
     */
    @Override
    public int deleteCmfGbPoliticalById(Integer id)
    {
        return cmfGbPoliticalMapper.deleteCmfGbPoliticalById(id);
    }
}
