package com.tiny.store.mapper;

import com.tiny.store.model.SmsHomeRecommendProduct;
import com.tiny.store.model.SmsHomeRecommendProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SmsHomeRecommendProductMapper {
    long countByExample(SmsHomeRecommendProductExample example);

    int deleteByExample(SmsHomeRecommendProductExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeRecommendProduct record);

    int insertSelective(SmsHomeRecommendProduct record);

    List<SmsHomeRecommendProduct> selectByExample(SmsHomeRecommendProductExample example);

    SmsHomeRecommendProduct selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsHomeRecommendProduct record, @Param("example") SmsHomeRecommendProductExample example);

    int updateByExample(@Param("record") SmsHomeRecommendProduct record, @Param("example") SmsHomeRecommendProductExample example);

    int updateByPrimaryKeySelective(SmsHomeRecommendProduct record);

    int updateByPrimaryKey(SmsHomeRecommendProduct record);
}