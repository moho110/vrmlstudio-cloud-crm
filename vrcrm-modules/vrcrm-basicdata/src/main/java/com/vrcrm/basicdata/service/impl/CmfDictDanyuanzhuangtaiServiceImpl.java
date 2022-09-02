package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfDictDanyuanzhuangtaiMapper;
import com.vrcrm.basicdata.domain.CmfDictDanyuanzhuangtai;
import com.vrcrm.basicdata.service.ICmfDictDanyuanzhuangtaiService;

/**
 * 单元状态Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfDictDanyuanzhuangtaiServiceImpl implements ICmfDictDanyuanzhuangtaiService 
{
    @Autowired
    private CmfDictDanyuanzhuangtaiMapper cmfDictDanyuanzhuangtaiMapper;

    /**
     * 查询单元状态
     * 
     * @param id 单元状态主键
     * @return 单元状态
     */
    @Override
    public CmfDictDanyuanzhuangtai selectCmfDictDanyuanzhuangtaiById(Integer id)
    {
        return cmfDictDanyuanzhuangtaiMapper.selectCmfDictDanyuanzhuangtaiById(id);
    }

    /**
     * 查询单元状态列表
     * 
     * @param cmfDictDanyuanzhuangtai 单元状态
     * @return 单元状态
     */
    @Override
    public List<CmfDictDanyuanzhuangtai> selectCmfDictDanyuanzhuangtaiList(CmfDictDanyuanzhuangtai cmfDictDanyuanzhuangtai)
    {
        return cmfDictDanyuanzhuangtaiMapper.selectCmfDictDanyuanzhuangtaiList(cmfDictDanyuanzhuangtai);
    }

    /**
     * 新增单元状态
     * 
     * @param cmfDictDanyuanzhuangtai 单元状态
     * @return 结果
     */
    @Override
    public int insertCmfDictDanyuanzhuangtai(CmfDictDanyuanzhuangtai cmfDictDanyuanzhuangtai)
    {
        return cmfDictDanyuanzhuangtaiMapper.insertCmfDictDanyuanzhuangtai(cmfDictDanyuanzhuangtai);
    }

    /**
     * 修改单元状态
     * 
     * @param cmfDictDanyuanzhuangtai 单元状态
     * @return 结果
     */
    @Override
    public int updateCmfDictDanyuanzhuangtai(CmfDictDanyuanzhuangtai cmfDictDanyuanzhuangtai)
    {
        return cmfDictDanyuanzhuangtaiMapper.updateCmfDictDanyuanzhuangtai(cmfDictDanyuanzhuangtai);
    }

    /**
     * 批量删除单元状态
     * 
     * @param ids 需要删除的单元状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfDictDanyuanzhuangtaiByIds(Integer[] ids)
    {
        return cmfDictDanyuanzhuangtaiMapper.deleteCmfDictDanyuanzhuangtaiByIds(ids);
    }

    /**
     * 删除单元状态信息
     * 
     * @param id 单元状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfDictDanyuanzhuangtaiById(Integer id)
    {
        return cmfDictDanyuanzhuangtaiMapper.deleteCmfDictDanyuanzhuangtaiById(id);
    }
}
