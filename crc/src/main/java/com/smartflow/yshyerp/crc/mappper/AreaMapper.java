package com.smartflow.yshyerp.crc.mappper;

import com.smartflow.yshyerp.crc.entity.Area;
import com.smartflow.yshyerp.crc.entity.AreaExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author haita
 */
public interface AreaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Area
     *
     * @mbggenerated
     */
    int countByExample(AreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Area
     *
     * @mbggenerated
     */
    int deleteByExample(AreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Area
     *
     * @mbggenerated
     */
    int insert(Area record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Area
     *
     * @mbggenerated
     */
    int insertSelective(Area record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Area
     *
     * @mbggenerated
     */
    List<Area> selectByExample(AreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Area
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Area record, @Param("example") AreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Area
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Area record, @Param("example") AreaExample example);
}