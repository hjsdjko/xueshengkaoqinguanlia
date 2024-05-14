package com.dao;

import com.entity.KaoqinxiangqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoqinxiangqingView;

/**
 * 考勤详情 Dao 接口
 *
 * @author 
 */
public interface KaoqinxiangqingDao extends BaseMapper<KaoqinxiangqingEntity> {

   List<KaoqinxiangqingView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
