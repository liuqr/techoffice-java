package com.ittechoffice.example.dao;

import com.ittechoffice.example.model.Table1;
import com.ittechoffice.example.model.Table1Example;
import java.util.List;

public interface Table1DAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLE1
     *
     * @mbg.generated Wed Nov 02 09:41:33 CST 2016
     */
    long countByExample(Table1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLE1
     *
     * @mbg.generated Wed Nov 02 09:41:33 CST 2016
     */
    int deleteByExample(Table1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLE1
     *
     * @mbg.generated Wed Nov 02 09:41:33 CST 2016
     */
    void insert(Table1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLE1
     *
     * @mbg.generated Wed Nov 02 09:41:33 CST 2016
     */
    void insertSelective(Table1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLE1
     *
     * @mbg.generated Wed Nov 02 09:41:33 CST 2016
     */
    List<Table1> selectByExample(Table1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLE1
     *
     * @mbg.generated Wed Nov 02 09:41:33 CST 2016
     */
    int updateByExampleSelective(Table1 record, Table1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLE1
     *
     * @mbg.generated Wed Nov 02 09:41:33 CST 2016
     */
    int updateByExample(Table1 record, Table1Example example);
}