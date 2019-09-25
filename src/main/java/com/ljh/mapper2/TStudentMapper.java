package com.ljh.mapper2;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ljh.domain.TStudent;

import java.util.List;

public interface TStudentMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbg.generated
     */
    int insert(TStudent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbg.generated
     */
    TStudent selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbg.generated
     */
    List<TStudent> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TStudent record);
}