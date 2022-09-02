package com.vrcrm.mytable.service;

import java.util.List;
import com.vrcrm.mytable.domain.CmfSmsSendlist;

/**
 * 短信发送清单Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfSmsSendlistService 
{
    /**
     * 查询短信发送清单
     * 
     * @param id 短信发送清单主键
     * @return 短信发送清单
     */
    public CmfSmsSendlist selectCmfSmsSendlistById(Integer id);

    /**
     * 查询短信发送清单列表
     * 
     * @param cmfSmsSendlist 短信发送清单
     * @return 短信发送清单集合
     */
    public List<CmfSmsSendlist> selectCmfSmsSendlistList(CmfSmsSendlist cmfSmsSendlist);

    /**
     * 新增短信发送清单
     * 
     * @param cmfSmsSendlist 短信发送清单
     * @return 结果
     */
    public int insertCmfSmsSendlist(CmfSmsSendlist cmfSmsSendlist);

    /**
     * 修改短信发送清单
     * 
     * @param cmfSmsSendlist 短信发送清单
     * @return 结果
     */
    public int updateCmfSmsSendlist(CmfSmsSendlist cmfSmsSendlist);

    /**
     * 批量删除短信发送清单
     * 
     * @param ids 需要删除的短信发送清单主键集合
     * @return 结果
     */
    public int deleteCmfSmsSendlistByIds(Integer[] ids);

    /**
     * 删除短信发送清单信息
     * 
     * @param id 短信发送清单主键
     * @return 结果
     */
    public int deleteCmfSmsSendlistById(Integer id);
}
